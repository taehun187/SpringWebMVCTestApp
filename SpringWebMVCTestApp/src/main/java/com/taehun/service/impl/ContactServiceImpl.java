package com.taehun.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;


import com.taehun.dao.UserMessageDao;
import com.taehun.entity.UserMessage;
import com.taehun.service.ContactService;

@Service
@Transactional(
	propagation = Propagation.REQUIRED,
	isolation = Isolation.DEFAULT,
	readOnly = true)
public class ContactServiceImpl implements ContactService {
	@Inject private UserMessageDao userMsgDao;
	
	
	@Transactional(readOnly = false)
	public void saveUserMessage(UserMessage userMsg) {
		Assert.notNull(userMsg, "userMsg can't be null");
		userMsgDao.save(userMsg);
	}
}