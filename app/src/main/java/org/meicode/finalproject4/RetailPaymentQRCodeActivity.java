package org.meicode.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

import org.meicode.finalproject4.databinding.ActivityRetailPaymentQrcodeBinding;

public class RetailPaymentQRCodeActivity extends AppCompatActivity {
    ActivityRetailPaymentQrcodeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRetailPaymentQrcodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int hight = dm.heightPixels;

        getWindow().setLayout((int)(width*.9), (int)(hight*.9));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = 0;

        getWindow().setAttributes(params);

        binding.tvBackActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SelectedRetailPaymentActivity.class));
            }
        });
    }
}