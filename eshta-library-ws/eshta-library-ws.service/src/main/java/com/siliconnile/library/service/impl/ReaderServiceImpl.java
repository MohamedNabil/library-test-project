package com.siliconnile.library.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siliconnile.library.dao.ReaderDAO;
import com.siliconnile.library.domain.Book;
import com.siliconnile.library.domain.Reader;
import com.siliconnile.library.service.api.ReaderService;


@Service
public class ReaderServiceImpl implements ReaderService {

	@Autowired
	private ReaderDAO readerDao;
	@Override
	public Reader persistReader(Reader reader) {
		try {
			return readerDao.saveOrUpdate(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reader> listReaders() {
		try {
			return (List<Reader>) readerDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
