package com.liousdk.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.truescend.gofit.pagers.start.splash.BindAccountActivity;


public class MainActivity extends AppCompatActivity {

    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytest_main);

        btnEnter = findViewById(R.id.btn_app);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //同意条款后，初始化SDK中的application
                MyApplication application = (MyApplication) getApplication();
                application.init();

                Intent intent = new Intent(MainActivity.this, BindAccountActivity.class);
                intent.putExtra(BindAccountActivity.QIZHI_EXTRA_PHONE, "15688888888");
                startActivity(intent);
            }
        });
    }
}
