package com.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.bean.Init;
import com.template.dao.InitMapper;

@Service
public class InitService {
	
	@Autowired
	InitMapper initMapper;
	//��ס����ѯ
	public Init selectByPrimaryKey(int id) {
		return initMapper.selectByPrimaryKey(id);
	}
}
