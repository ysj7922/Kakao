package com.hanbit.kakao.presentation.member;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.kakao.MainActivity;
import com.hanbit.kakao.R;

public class ResistMemberActivity extends AppCompatActivity implements View.OnClickListener {


    EditText etID,etName,etPass,etTel,etAddr;
    Button btSubmit, btCancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resist_member);

        etID= (EditText) findViewById(R.id.etID);
        etName= (EditText) findViewById(R.id.etName);
        etPass= (EditText) findViewById(R.id.etPass);
        etTel= (EditText) findViewById(R.id.etTel);
        etAddr= (EditText) findViewById(R.id.etAddr);

        btSubmit= (Button) findViewById(R.id.btSubmit);
        btCancle= (Button) findViewById(R.id.btCancle);

        etID.setOnClickListener(this);
        etName.setOnClickListener(this);
        etPass.setOnClickListener(this);
        etTel.setOnClickListener(this);
        etAddr.setOnClickListener(this);

        btSubmit.setOnClickListener(this);
        btCancle.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.etID :break;
            case R.id.etName :break;
            case R.id.etPass :break;
            case R.id.etTel :break;
            case R.id.etAddr :break;

            case R.id.btSubmit :break;
            case R.id.btCancel:
                this.startActivity(new Intent(ResistMemberActivity.this, MainActivity.class));
                break;


        }
    }
}