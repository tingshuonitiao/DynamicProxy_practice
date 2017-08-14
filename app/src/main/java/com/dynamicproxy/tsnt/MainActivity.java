package com.dynamicproxy.tsnt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        LoginApi loginApi = ApiGenerator.generateApi(LoginApi.class);
        User user = loginApi.login("123", "456");
        Toast.makeText(MainActivity.this, user.toString(), Toast.LENGTH_SHORT).show();
    }
}
