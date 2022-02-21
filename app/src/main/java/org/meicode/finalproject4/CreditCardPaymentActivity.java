package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.meicode.finalproject4.databinding.ActivityCreditCardPaymentBinding;

public class CreditCardPaymentActivity extends AppCompatActivity {
    ActivityCreditCardPaymentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreditCardPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvCreditCardPayment7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToExplicit = new Intent(getApplicationContext(), SelectedCreditCardPaymentActivity.class);
                intentGoToExplicit.putExtra("CreditImage", binding.ivCreditCardPayment.getResources().toString());
            }
        });

        binding.tvCreditCardPayment10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToExplicit = new Intent(getApplicationContext(), SelectedCreditCardPaymentActivity.class);
                intentGoToExplicit.putExtra("CreditImage", binding.ivCreditCardPayment2.getResources().toString());
            }
        });
    }
}