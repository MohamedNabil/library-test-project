package com.siliconnile.library.dao.impl;

import org.springframework.stereotype.Repository;

import com.pearlox.framework.dao.impl.BasicJpaDao;
import com.siliconnile.library.dao.ReaderDAO;
import com.siliconnile.library.domain.Reader;

/**
 * author: M.Nabil
 * Date: 7/5/14
 */
@Repository
public class ReaderDaoImpl extends BasicJpaDao<Reader> implements ReaderDAO {

	public ReaderDaoImpl() {
		super(Reader.class);
		// TODO Auto-generated constructor stub
	}

}
