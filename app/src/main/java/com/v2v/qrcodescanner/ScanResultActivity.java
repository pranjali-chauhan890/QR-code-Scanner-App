package com.v2v.qrcodescanner;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ScanResultActivity extends AppCompatActivity {

    TextView txtResult;
    Button btnOpenInBrowser;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_result);

        txtResult = findViewById(R.id.txtResult);
        btnOpenInBrowser = findViewById(R.id.btnOpenInBrowser);

        String result = getIntent().getStringExtra("scanned_result");
        txtResult.setText(result);

        btnOpenInBrowser.setOnClickListener(v -> {
            Intent thankYouIntent = new Intent(ScanResultActivity.this, ThankYouActivity.class);
            thankYouIntent.putExtra("url", result);
            startActivity(thankYouIntent);
            finish(); // optional, to close result screen
        });
    }
}
