package com.hanbit.kakao.service;

import com.hanbit.kakao.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2017 on 2017-01-07.
 */

public interface MemberService {
    public void regist(MemberBean param); //createMember
    public ArrayList<MemberBean> list(); //readAll
    public ArrayList<MemberBean> searchByName(String name); //readGroup
    public MemberBean searchById(String id); //readOne
    public boolean login(MemberBean param);
    public int count(); //readCount
    public void modify(MemberBean param); //updateMember
    public void unregist(String id); //deleteMember

    public MemberBean detail(String hong);
    public void delete(String s);
}
