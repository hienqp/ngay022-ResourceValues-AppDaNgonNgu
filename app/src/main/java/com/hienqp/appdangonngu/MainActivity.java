package com.hienqp.appdangonngu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextName, editTextEmail, editTextPhoneNumber;
    Button buttonConfirm;
    TextView textViewInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name     = editTextName.getText().toString();
                String email    = editTextEmail.getText().toString();
                String phone    = editTextPhoneNumber.getText().toString();

                String textHello        = getResources().getString(R.string.text_chao_ban);
                String textEmail        = getResources().getString(R.string.text_email);
                String textPhoneNumber  = getResources().getString(R.string.text_so_dien_thoai);

                textViewInformation.setText(textHello + ": " + name + "\n" + textEmail + ": " + email + "\n" + textPhoneNumber + ": " + phone);
            }
        });
    }

    private void AnhXa() {
        editTextName = (EditText) findViewById(R.id.editText_ho_ten);
        editTextEmail = (EditText) findViewById(R.id.editText_email);
        editTextPhoneNumber = (EditText) findViewById(R.id.editText_so_dien_thoai);
        buttonConfirm = (Button) findViewById(R.id.button_xac_nhan);
        textViewInformation = (TextView) findViewById(R.id.textView_thong_tin);
    }
}