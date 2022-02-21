package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.meicode.finalproject4.databinding.ActivityPaymentSelecionBinding;

public class PaymentSelecionActivity extends AppCompatActivity {
    ActivityPaymentSelecionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPaymentSelecionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvPaymentSelection7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaymentSelecionActivity.this, SelectedCreditCardPaymentActivity.class));
            }
        });

        binding.tvPaymentSelection10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SelectedBankTransferPaymentActivity.class));
            }
        });

        binding.tvPaymentSelection13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SelectedRetailPaymentActivity.class));
            }
        });
    }
}