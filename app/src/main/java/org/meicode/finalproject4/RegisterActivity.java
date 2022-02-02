package org.meicode.finalproject4;

import static org.meicode.finalproject4.Database.Preference.DATABASE_REFERENCE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.meicode.finalproject4.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;
    DatabaseReference userDbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        userDbRef = FirebaseDatabase.getInstance().getReference().child("Users");

        binding.btnSubmitRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNameRegister = binding.etUsernameRegister.getText().toString();
                String nameUserRegister = binding.etNameRegister.getText().toString();
                String passwordUserRegister = binding.etPasswordRegister.getText().toString();

                if (nameUserRegister.isEmpty() || userNameRegister.isEmpty() || passwordUserRegister.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Please complete the form", Toast.LENGTH_SHORT).show();
                } else {
                    DATABASE_REFERENCE.child("Users").child(userNameRegister).child("nameUser").setValue(nameUserRegister);
                    DATABASE_REFERENCE.child("Users").child(userNameRegister).child("passwordUser").setValue(passwordUserRegister);
                    Toast.makeText(RegisterActivity.this, "User Register Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                    finish();
                }
            }
        });


    }
}