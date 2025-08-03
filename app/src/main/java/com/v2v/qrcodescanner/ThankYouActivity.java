package com.v2v.qrcodescanner;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThankYouActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);

        TextView txtThankYou = findViewById(R.id.txtThankYou);
        txtThankYou.setText("Thank you page opened successfully!");
    }
}

