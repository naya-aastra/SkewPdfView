# SkewPdfView
An Android library to show pdf in your android applications.

## Get SkewPdfView
Add it in your root build.gradle at the end of repositories:


```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

and add the SkewPdfView Library as:

```
dependencies {
   implementation 'com.github.naya-aastra:SkewPdfView:1.1'
	}
```


# Include SkewPdfView in your layout

Add the following code to <your-layout-file>.xml

```xml
<com.nayaastra.skewpdfview.SkewPdfView
        android:id="@+id/skewPdfView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

# Load a PDF file

Add the java code to <your-java-class>.java

```java
SkewPdfView skewPdfView;
skewPdfView = findViewById(R.id.skewPdfView);
skewPdfView.loadPdf(pdfLink);
```

