package com.nayaastra.pdfview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nayaastra.skewpdfview.SkewPdfView;

public class MainActivity extends AppCompatActivity {

    SkewPdfView skewPdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skewPdfView = findViewById(R.id.sk);

        skewPdfView.loadPdf("https://mozilla.github.io/pdf.js/web/compressed.tracemonkey-pldi-09.pf");
    }
}
