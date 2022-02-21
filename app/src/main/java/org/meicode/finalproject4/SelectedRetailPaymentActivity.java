package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.meicode.finalproject4.databinding.ActivitySelectedRetailPaymentBinding;

public class SelectedRetailPaymentActivity extends AppCompatActivity {
    ActivitySelectedRetailPaymentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySelectedRetailPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ivSelectedRetailPayment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopUpWindowQrCode();
            }
        });
    }

    private void openPopUpWindowQrCode() {
        Intent popupwindowqrcode = new Intent(getApplicationContext(),RetailPaymentQRCodeActivity.class);
        startActivity(popupwindowqrcode);
    }
}