package com.spring.news.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface NewsController {
	public ModelAndView listNewss(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView addNews(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView removeNews(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView updateNews(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView modNews(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
