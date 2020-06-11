
         var searchQuery = location.search;
         var searchQueryValidated = searchQuery.replace("?search=", "");


         var pageNum = 1;
         var pdfScale = 0.50; // make pdfScale a global variable
         var shownPdf; // another global we'll use for the buttons
         var url = searchQueryValidated; // PDF to load: change this to a file that exists;

         function renderPage(page) {
            var scale = pdfScale; // render with global pdfScale variable
            var viewport = page.getViewport(scale);
            var canvas = document.getElementById('skewpdfcanvas');
            var context = canvas.getContext('2d');
            canvas.height = viewport.height;
            canvas.width = viewport.width;
            var renderContext = {
               canvasContext: context,
               viewport: viewport
            };
            page.render(renderContext);
         }

         function displayPage(pdf, num) {
            pdf.getPage(num).then(function getPage(page) { renderPage(page); });
         }

         var pdfDoc = pdfjsLib.getDocument(url).then(function getPdfHelloWorld(pdf) {
            displayPage(pdf, 1);
            shownPdf = pdf;
         }).catch(e => {

                document.getElementById("simpleskewedtopbar").style.display = "none";
                document.getElementById("skewpdfcanvas").style.display = "none";
                document.getElementById("error").innerHTML = "Something Wrong with the PDF provided!";
          });;

         var nextbutton = document.getElementById("nextbutton");
         nextbutton.onclick = function() {
            if (pageNum >= shownPdf.numPages) {
               return;
            }
            pageNum++;
            displayPage(shownPdf, pageNum);
         }

         var prevbutton = document.getElementById("prevbutton");
         prevbutton.onclick = function() {
            if (pageNum <= 1) {
               return;
            }
            pageNum--;
            displayPage(shownPdf, pageNum);
         }

         var zoominbutton = document.getElementById("zoominbutton");
         zoominbutton.onclick = function() {
            pdfScale = pdfScale + 0.25;
            displayPage(shownPdf, pageNum);
         }

         var zoomoutbutton = document.getElementById("zoomoutbutton");
         zoomoutbutton.onclick = function() {
            if (pdfScale <= 0.25) {
               return;
            }
            pdfScale = pdfScale - 0.25;
            displayPage(shownPdf, pageNum);
         }
