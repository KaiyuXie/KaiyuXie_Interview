package com.uso.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAOImpl<T> implements IBaseDAO<T>{
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getWriteTemplate() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate;
	}

}
