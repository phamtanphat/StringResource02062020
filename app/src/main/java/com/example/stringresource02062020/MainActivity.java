package com.example.stringresource02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText mEdtAccount,mEdtPassword;
    Button mBtnLogin;
    TextView mTvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources res = getResources();

        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.setLocale(new Locale("en", "US"));
        res.updateConfiguration(conf, dm);

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