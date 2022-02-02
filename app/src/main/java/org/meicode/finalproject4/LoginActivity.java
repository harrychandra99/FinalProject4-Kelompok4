package org.meicode.finalproject4;

import static org.meicode.finalproject4.Database.Preference.DATABASE_REFERENCE;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import org.meicode.finalproject4.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        binding.btnSubmitLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNameLoginUser = binding.etUsernameLogin.getText().toString();
                String passwordLoginUser = binding.etPasswordLogin.getText().toString();

                if (userNameLoginUser.isEmpty() || passwordLoginUser.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please complete the form", Toast.LENGTH_SHORT).show();
                } else {
                    DATABASE_REFERENCE.child("Users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(userNameLoginUser)) {
                                String getPasswordLogin = snapshot.child(userNameLoginUser).child("passwordUser").getValue(String.class);
                                if (getPasswordLogin.equals(passwordLoginUser)) {
                                    Toast.makeText(LoginActivity.this, "Successfully Logged in", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(LoginActivity.this, PreMainActivity.class));
                                    finish();
                                } else {
                                    Toast.makeText(LoginActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(LoginActivity.this, "Wrong Phone Number", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }

        });
    }
}