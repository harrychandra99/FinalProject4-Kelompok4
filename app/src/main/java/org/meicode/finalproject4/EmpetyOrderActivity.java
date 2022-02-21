package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.meicode.finalproject4.databinding.ActivityEmpetyOrderBinding;

public class EmpetyOrderActivity extends AppCompatActivity {
    ActivityEmpetyOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEmpetyOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}