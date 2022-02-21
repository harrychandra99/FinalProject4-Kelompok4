package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.meicode.finalproject4.databinding.ActivitySeatBinding;

public class SeatActivity extends AppCompatActivity {
    ActivitySeatBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBookSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PaymentSelectionActivity.class));
            }
        });
    }
}