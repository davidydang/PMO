package com.pmo.dashboard.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pmo.dashboard.dao.ResumeMapper;
import com.pmo.dashboard.entity.Resume;
import com.pom.dashboard.service.ResumeService;

/**
 * 候选人Service接口实现类
 * 
 * @author dilu
 * @version 1.0 2017-8-28 10:39:22
 */
@Service
public class ResumeServiceImpl implements ResumeService {

	@Resource
	private ResumeMapper resumeMapper;
	@Override
	public void add(Resume resume) {
		
		// 调用dao层
		resumeMapper.add(resume);
		
		
	}
	@Override
	public Resume searchTel(String tel) {
		// TODO Auto-generated method stub
		return resumeMapper.selectTel(tel);
	}

}
