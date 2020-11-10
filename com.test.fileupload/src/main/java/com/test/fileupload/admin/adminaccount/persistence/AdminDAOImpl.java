package com.test.fileupload.admin.adminaccount.persistence;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.fileupload.admin.adminaccount.entity.AdminEntity;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public AdminEntity selectOne(AdminEntity entity) {

		return sqlSession.selectOne("AdminDAO.selectOne", entity);
	}

}
