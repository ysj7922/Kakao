package com.hanbit.kakao.dao;

import android.content.Context;

import com.hanbit.kakao.domain.MessageBean;

import java.util.ArrayList;

/**
 * Created by hb2017 on 2017-01-07.
 */

public class MessageDAO {
    public MessageDAO(Context applicationContext) {
    }

    public void write(MessageBean msg) {

    }
    public ArrayList<MessageBean> list(){
        ArrayList<MessageBean> list = new ArrayList<MessageBean>();
        return list;
    }
    public ArrayList<MessageBean> findByWrite(String id){
        ArrayList<MessageBean> list = new ArrayList<MessageBean>();
        return list;
    }
    public MessageBean findBySeq(int seq){
        MessageBean message = new MessageBean();
        return message;
    }
    public int count(){
        int count = 0;
        return count;
    }
    public int countByWriter(String id){
        int count = 0;
        return count;
    }
    public void updateMessage(MessageBean msg){

    }
    public void deleteMessage(int seq){

    }
}
