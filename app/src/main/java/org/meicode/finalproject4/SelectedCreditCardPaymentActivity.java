package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.meicode.finalproject4.databinding.ActivitySelectedCreditCardPaymentBinding;

public class SelectedCreditCardPaymentActivity extends AppCompatActivity {
    ActivitySelectedCreditCardPaymentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySelectedCreditCardPaymentBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_selected_credit_card_payment);

        String Credit = getIntent().getStringExtra("Credit");
        binding.ivSelectedCreditCardPayment.setImageResource(Integer.parseInt(Credit));

        String number1 = binding.edtSelectedCreditCardPayment.getText().toString();
        String number2 = binding.edtSelectedCreditCardPayment2.getText().toString();
        String number3 = binding.edtSelectedCreditCardPayment3.getText().toString();
        String number4 = binding.edtSelectedCreditCardPayment4.getText().toString();
        String month = binding.edtSelectedCreditCardPayment5.getText().toString();
        String year = binding.edtSelectedCreditCardPayment6.getText().toString();
        String sureName = binding.edtSelectedCreditCardPayment7.getText().toString();
        String vcc = binding.edtSelectedCreditCardPayment.getText().toString();

        if (number1.isEmpty()||number2.isEmpty()||number3.isEmpty()||number4.isEmpty()||month.isEmpty()||year.isEmpty()||sureName.isEmpty()||vcc.isEmpty())
        {
            binding.btnSelectedCreditCardPayment.setEnabled(false);
        }
            else{
                binding.btnSelectedCreditCardPayment.setEnabled(true);
        }

        binding.btnSelectedCreditCardPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.btnSelectedCreditCardPayment.isEnabled()) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                } else{
                    Toast.makeText(getApplicationContext(),"please fill the box",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}