package cn.tedu.ttms.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.ttms.product.dao.Project2Dao;
import cn.tedu.ttms.product.entity.Project2;
import cn.tedu.ttms.product.service.Project2Service;

@RequestMapping("/project2/")
@Controller
public class Project2Controller {
	@Autowired
	private Project2Service  project2Serivce;
	
	@ResponseBody
	@RequestMapping("getProject2List")
	public List<Project2> getProject2List(){
		
		return project2Serivce.queryProject2List();
		
	}
}
