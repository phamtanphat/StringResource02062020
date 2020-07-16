package com.example.stringresource02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEdtAccount,mEdtPassword;
    Button mBtnLogin;
    TextView mTvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtAccount = findViewById(R.id.edittextTaikhoan);
        mEdtPassword = findViewById(R.id.edittextMatkhau);
        mBtnLogin = findViewById(R.id.buttonDangnhap);
        mTvInfo = findViewById(R.id.textviewThongtin);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taikhoan = mEdtAccount.getText().toString();
                String matkhau = mEdtPassword.getText().toString();

                String labelTaikhoan = getResources().getString(R.string.label_account);
                String labelMatkhau = getResources().getString(R.string.label_password);

                String info =
                        labelTaikhoan + " : " + taikhoan + "\n" +
                        labelMatkhau + " : " + matkhau;
                mTvInfo.setText(info);
            }
        });
    }
}