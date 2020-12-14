package in.aditya.mynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText etEmail, etUsername, etPassword, etPasswordConfirm;
    Button btnRegister;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etEmail = (EditText) findViewById(R.id.et_reg_email);
        etUsername = (EditText) findViewById(R.id.et_reg_username);
        etPassword = (EditText) findViewById(R.id.et_reg_pass);
        etPasswordConfirm = (EditText) findViewById(R.id.et_reg_pass_confirm);

        btnRegister = (Button) findViewById(R.id.btn_register);
        tvLogin = (TextView) findViewById(R.id.tv_login);


        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this,
                        LoginActivity.class);
                startActivity(i);
            }
        });
    }
}