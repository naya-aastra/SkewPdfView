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
   implementation 'com.github.naya-aastra:SkewPdfView:Tag'
	}
```


# Include SkewPdfView in your layout

```xml
<com.nayaastra.skewpdfview.SkewPdfView
        android:id="@+id/skewPdfView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

# Load a PDF file

```java
SkewPdfView skewPdfView;
skewPdfView = findViewById(R.id.skewPdfView);
skewPdfView.loadPdf(pdfLink);
```

## License
[MIT](https://choosealicense.com/licenses/mit/)


