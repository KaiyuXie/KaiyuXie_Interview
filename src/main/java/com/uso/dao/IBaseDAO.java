package com.uso.dao;

import org.mybatis.spring.SqlSessionTemplate;

public interface IBaseDAO<T> {
	/**
	 * 获取写MyBatis模板实例
	 * @return SqlSessionTemplate实例
	 */
	public SqlSessionTemplate getWriteTemplate();
}
