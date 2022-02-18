package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.meicode.finalproject4.databinding.ActivityPreMainBinding;

public class PreMainActivity extends AppCompatActivity {

    ActivityPreMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPreMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnPreMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PreMainActivity.this, MainActivity.class));
            }
        });

    }
}