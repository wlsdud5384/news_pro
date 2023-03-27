package com.spring.news.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.news.dao.NewsDAO;
import com.spring.news.vo.NewsVO;

public class NewsServiceImpl implements NewsService {
	
	private NewsDAO newsDAO;
	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}
	
	@Override
	public List listNewss() throws DataAccessException {
		List newssList = null;
		newssList = newsDAO.selectAllNewssList();
		return newssList;
	}
	
	@Override
	public int addNews(NewsVO newsVO) throws DataAccessException {
		
		
		return newsDAO.insertNews(newsVO);
	}
	
	@Override
	public int updateNews(NewsVO newsVO) throws DataAccessException {
		
		
		return newsDAO.updateNews(newsVO);
	}
	
	
	
	@Override
	public NewsVO modNews(int aid) throws DataAccessException {
		
		
		return newsDAO.modNews(aid);
	}


	@Override
	public int removeNews(int aid) throws DataAccessException {
		
		
		
		return newsDAO.deleteNews(aid);
	}
	
	
	
}
