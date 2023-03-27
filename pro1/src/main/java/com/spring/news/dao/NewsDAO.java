package com.spring.news.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.news.vo.NewsVO;

public interface NewsDAO {
	public List selectAllNewssList() throws DataAccessException;
	
	public int insertNews(NewsVO newsVO) throws DataAccessException;
	
	public int deleteNews(int aid) throws DataAccessException;
	
	public int updateNews(NewsVO newsVO) throws DataAccessException;
	
	public NewsVO modNews(int aid) throws DataAccessException;

	
	
}
