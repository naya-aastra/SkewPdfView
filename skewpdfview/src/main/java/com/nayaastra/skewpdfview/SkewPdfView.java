package com.nayaastra.skewpdfview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;


public class SkewPdfView extends WebView {


    /**
     * Construct a new WebView with a Context object.
     *
     * @param context A Context object used to access application assets.
     */
    public SkewPdfView(Context context) {
        super(context);
    }

    /**
     * Construct a new WebView with layout parameters.
     *
     * @param context A Context object used to access application assets.
     * @param attrs   An AttributeSet passed to our parent.
     */
    public SkewPdfView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Construct a new WebView with layout parameters and a default style.
     *
     * @param context      A Context object used to access application assets.
     * @param attrs        An AttributeSet passed to our parent.
     * @param defStyleAttr
     */
    public SkewPdfView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SkewPdfView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * @param context
     * @param attrs
     * @param defStyleAttr
     * @param privateBrowsing
     * @deprecated
     */
    public SkewPdfView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) {
        super(context, attrs, defStyleAttr, privateBrowsing);
    }

    /**
     * Add a PDF file to the SkewPdfView
     * @param pdfUrl A String object that points to the location of the PDF file.
     **/
    public void loadPdf(String pdfUrl) {

        if (pdfUrl.trim().isEmpty()){
            throw new IllegalArgumentException("Pdf Url is empty");
        }

        //loadUrl("file:///android_asset/html.html");
        loadUrl("file:///android_asset/skewpdfview.html?search="+pdfUrl.trim());
        getSettings().setJavaScriptEnabled(true);




    }
}
