package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.meicode.finalproject4.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}