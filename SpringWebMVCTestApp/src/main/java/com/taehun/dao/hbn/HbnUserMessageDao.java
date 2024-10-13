package com.taehun.dao.hbn;

import org.springframework.stereotype.Repository;

import com.taehun.dao.AbstractHbnDao;
import com.taehun.dao.UserMessageDao;
import com.taehun.entity.UserMessage;

@Repository("userMessageDao")
public final class HbnUserMessageDao extends AbstractHbnDao<UserMessage>
	implements UserMessageDao {

	public HbnUserMessageDao(Class<UserMessage> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
}