package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.meicode.finalproject4.databinding.ActivitySelectedBankTransferPaymentBinding;

public class SelectedBankTransferPaymentActivity extends AppCompatActivity {
    ActivitySelectedBankTransferPaymentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySelectedBankTransferPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String bankImage = getIntent().getStringExtra("BankImage");
        binding.ivSelectedBankTransferPayment.setImageResource(Integer.parseInt(bankImage));

        String bankText = getIntent().getStringExtra("BankText");
        binding.tvSelectedBankTransferPayment5.setText(String.valueOf(bankText));


        binding.btnSelectedBankTransferPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });


    }
}