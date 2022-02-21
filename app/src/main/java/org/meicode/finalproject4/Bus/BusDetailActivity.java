package org.meicode.finalproject4.Bus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.meicode.finalproject4.databinding.ActivityBusDetailBinding;

public class BusDetailActivity extends AppCompatActivity {

    ActivityBusDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBusDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int image = getIntent().getIntExtra("image", 0);
        String name = getIntent().getStringExtra("name");
        String type = getIntent().getStringExtra("type");
        String seat = getIntent().getStringExtra("seat");

        binding.imgDetailBus.setImageDrawable(getResources().getDrawable(image));
        binding.tvNameDetailBus.setText(name);
        binding.tvSeatDetail.setText(seat);
        binding.tvDetailClass.setText(type);
    }

}