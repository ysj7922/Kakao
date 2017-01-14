package com.hanbit.kakao.presentation.member;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.kakao.R;
import com.hanbit.kakao.domain.MemberBean;
import com.hanbit.kakao.service.MemberService;
import com.hanbit.kakao.service.MemberServiceImpl;

public class ModifyMemberActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etID, etPass, etName, etPhone, etAddr;
    Button btJoin, btLogin, btUpdate;
    MemberBean member;
    MemberService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_member);

        service = new MemberServiceImpl(this.getApplicationContext());
        Intent intent = this.getIntent();

        String id = intent.getExtras().getString("id");

        member = service.searchById(id);


        etID= (EditText) findViewById(R.id.etID);
        etPass= (EditText) findViewById(R.id.etPass);
        etName= (EditText) findViewById(R.id.etName);
        etPhone= (EditText) findViewById(R.id.etPhone);
        etAddr= (EditText) findViewById(R.id.etAddr);

        btJoin= (Button) findViewById(R.id.btJoin);
        btLogin= (Button) findViewById(R.id.btLogin);
        btUpdate=(Button) findViewById(R.id.btUpdate);

        btJoin.setOnClickListener(this);
        btLogin.setOnClickListener(this);
        btUpdate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btJoin:
                break;
            case R.id.btList:
                startActivity(new Intent(this, MemberListActivity.class));
                break;
            case R.id.btUpdate:
                MemberBean temp=new MemberBean();
                temp.setId(etID.getText().toString());
                temp.setPw((etPass.getText().toString()==null)?member.getPw():etPass.getText().toString());
                temp.setName((etName.getText().toString()==null)?member.getPw():etName.getText().toString());
                temp.setAddr((etAddr.getText().toString()==null)?member.getPw():etAddr.getText().toString());
                temp.setPhone((etPhone.getText().toString()==null)?member.getPw():etPhone.getText().toString());
                service.modify(temp);
                break;
            case R.id.btCancle:

                break;
        }
        Intent intent=new Intent(ModifyMemberActivity.this, MemberDetailActivity.class);
        intent.putExtra("id",member.getId());
        startActivity(intent);
    }

}