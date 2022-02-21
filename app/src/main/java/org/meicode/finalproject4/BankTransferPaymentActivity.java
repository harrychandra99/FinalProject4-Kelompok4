package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.meicode.finalproject4.databinding.ActivityBankTransferPaymentBinding;

public class BankTransferPaymentActivity extends AppCompatActivity {
    ActivityBankTransferPaymentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBankTransferPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvBankTransferPayment7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToExplicit = new Intent(getApplicationContext(), SelectedBankTransferPaymentActivity.class);
                intentGoToExplicit.putExtra("BankImage", R.drawable.bnilogo);
                intentGoToExplicit.putExtra("BankText", binding.tvBankTransferPayment6.getText().toString());
                startActivity(intentGoToExplicit);
            }
        });

        binding.tvBankTransferPayment10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToExplicit = new Intent(getApplicationContext(), SelectedBankTransferPaymentActivity.class);
                intentGoToExplicit.putExtra("BankImage",R.drawable.cimbniagalogo);
                intentGoToExplicit.putExtra("BankText", binding.tvBankTransferPayment9.getText().toString());
                startActivity(intentGoToExplicit);
            }
        }));
    }
}