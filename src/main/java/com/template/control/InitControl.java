package com.template.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.template.bean.Init;
import com.template.service.InitService;
import com.template.tools.Jsons;

@Controller
@RequestMapping("/init")
public class InitControl {

	@Autowired
	InitService initService;
	
	//��������ѯ
	@RequestMapping("/select")
	@ResponseBody
	public Jsons select() {
		Init init = initService.selectByPrimaryKey(1);
		return Jsons.success("��ѯ�ɹ�").add("data", init);
	}
}
