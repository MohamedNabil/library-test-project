package com.siliconnile.library.service.api;

import java.util.List;

import com.siliconnile.library.domain.Reader;

/**
 * author: M.Nabil
 * Date: 7/5/14
 */
public interface ReaderService {

	Reader persistReader(Reader reader);
	List<Reader> listReaders();
}
