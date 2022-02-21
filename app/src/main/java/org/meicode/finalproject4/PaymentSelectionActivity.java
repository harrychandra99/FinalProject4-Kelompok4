package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.meicode.finalproject4.databinding.ActivityPaymentSelectionBinding;
import org.meicode.finalproject4.databinding.ActivityPaymentSelectionBinding;

public class PaymentSelectionActivity extends AppCompatActivity {
    ActivityPaymentSelectionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPaymentSelectionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvPaymentSelection7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaymentSelectionActivity.this, CreditCardPaymentActivity.class));
            }
        });

        binding.tvPaymentSelection10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaymentSelectionActivity.this, BankTransferPaymentActivity.class));
            }
        });

        binding.tvPaymentSelection13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaymentSelectionActivity.this, SelectedRetailPaymentActivity.class));
            }
        });
    }
}