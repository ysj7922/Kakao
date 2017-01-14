package com.hanbit.kakao.service;

import com.hanbit.kakao.domain.MessageBean;

import java.util.ArrayList;

/**
 * Created by hb2017 on 2017-01-07.
 */

public interface MessageService {
    public void write(MessageBean msg);
    public ArrayList<MessageBean> list();
    public ArrayList<MessageBean> findByWrite(String id);
    public MessageBean findBySeq(int seq);
    public int count();
    public int countByWriter(String id);
    public void updateMessage(MessageBean msg);
    public void deleteMessage(int seq);
}
