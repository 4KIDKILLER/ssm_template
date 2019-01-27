package com.template.control;

import javax.servlet.http.HttpServletRequest;

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

	// ��������ѯ
	@RequestMapping("/select")
	@ResponseBody
	public Jsons select() {
		Init init = initService.selectByPrimaryKey(1);
		return Jsons.success("��ѯ�ɹ�").add("data", init);
	}

	// �������޸�
	@RequestMapping("/updata")
	@ResponseBody
	public Jsons update(HttpServletRequest request) {
		String value = request.getParameter("value");
		Init init = new Init();
		init.setInitId(1);
		init.setInitContent(value);
		int result = initService.updateByPrimaryKey(init);
		return Jsons.success("�޸ĳɹ�").add("data", result);
	}

	// �������
	@RequestMapping("/insert")
	@ResponseBody
	public Jsons insert(HttpServletRequest request) {
		String value = request.getParameter("value");
		Init init = new Init();
		init.setInitId(1);
		init.setInitContent(value);
		int result = initService.insert(init);
		return Jsons.success("��ӳɹ�").add("data", result);
	}
	
	//ɾ������
	@RequestMapping("/remove")
	@ResponseBody
	public Jsons remove() {
		int result = initService.deleteByPrimaryKey(1);
		return Jsons.success("ɾ���ɹ�").add("data", result);
	}
}
