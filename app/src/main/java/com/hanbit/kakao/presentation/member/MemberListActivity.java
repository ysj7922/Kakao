package com.hanbit.kakao.presentation.member;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.kakao.R;
import com.hanbit.kakao.domain.MemberBean;
import com.hanbit.kakao.service.MemberService;
import com.hanbit.kakao.service.MemberServiceImpl;

import java.util.List;

public class MemberListActivity  extends AppCompatActivity implements View.OnClickListener{
    Button btDetail;
    MemberService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);
        btDetail = (Button) findViewById(R.id.btDetail);
        service = new MemberServiceImpl(getApplicationContext());
        List<MemberBean> list = service.list();
        btDetail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MemberListActivity.this, MemberDetailActivity.class));
    }
}