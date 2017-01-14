package com.hanbit.kakao.service;

import android.content.Context;

import com.hanbit.kakao.dao.MessageDAO;
import com.hanbit.kakao.domain.MessageBean;

import java.util.ArrayList;

/**
 * Created by hb2017 on 2017-01-07.
 */

public class MessageServiceImpl implements MessageService {
    MessageDAO dao;
    public MessageServiceImpl(Context applicationContext) {
        dao = new MessageDAO(applicationContext);
    }

    @Override
    public void write(MessageBean msg) {

    }

    @Override
    public ArrayList<MessageBean> list()   {
        return null;
    }

    @Override
    public ArrayList<MessageBean> findByWrite(String id) {
        return null;
    }

    @Override
    public MessageBean findBySeq(int seq) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int countByWriter(String id) {
        return 0;
    }

    @Override
    public void updateMessage(MessageBean msg) {

    }

    @Override
    public void deleteMessage(int seq) {

    }
}
