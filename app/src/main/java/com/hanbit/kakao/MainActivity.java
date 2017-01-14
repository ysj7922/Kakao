package com.hanbit.kakao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hanbit.kakao.presentation.member.LoginActivity;
import com.hanbit.kakao.presentation.member.ModifyMemberActivity;
import com.hanbit.kakao.presentation.member.RegistMemberActivity;
import com.hanbit.kakao.util.BackPressCloseHandler;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button regist_btn,menu_login,menu_help;
    //LinearLayout help_center;
    TextView menu_home;
    View mCustomView;
    private BackPressCloseHandler backPressCloseHander;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menu_home = (TextView) findViewById(R.id.menu_home);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDefaultDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        mCustomView = LayoutInflater.from(MainActivity.this)
                .inflate(R.layout.main_custombar, null);
        actionBar.setCustomView(mCustomView);
        setContentView(R.layout.activity_main);
        init();

    }


    public void init() {
        regist_btn = (Button) findViewById(R.id.regist_btn);
        menu_login = (Button) mCustomView.findViewById(R.id.menu_login);
        regist_btn.setOnClickListener(this);
        menu_help = (Button) findViewById(R.id.menu_help);
        menu_login = (Button) findViewById(R.id.menu_login);
        backPressCloseHander = new BackPressCloseHandler(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.regist_btn:
                startActivity(new Intent(MainActivity.this, RegistMemberActivity.class));
                break;
            case R.id.menu_help:
                startActivity(new Intent(MainActivity.this, ModifyMemberActivity.class));
                break;
            case R.id.menu_login:
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        backPressCloseHander.onBackPressed(); }
}
