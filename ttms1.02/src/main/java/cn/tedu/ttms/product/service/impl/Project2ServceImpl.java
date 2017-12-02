package cn.tedu.ttms.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ttms.product.dao.Project2Dao;
import cn.tedu.ttms.product.entity.Project2;
import cn.tedu.ttms.product.service.Project2Service;

@Service("project2Servce")
public class Project2ServceImpl implements  Project2Service{
	@Autowired
	private Project2Dao project2Dao;
	
	@Override
	public List<Project2> queryProject2List() {
		List<Project2> list=new ArrayList<Project2>();
		list=project2Dao.getProjectList();
		for(int i=0;i<list.size();i++){
			list.get(i).setName("我是大笨蛋："+list.get(i).getName());;
		}
		return list;
	}

}
