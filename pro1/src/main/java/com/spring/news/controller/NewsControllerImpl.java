package com.spring.news.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.news.service.NewsService;
import com.spring.news.service.NewsServiceImpl;
import com.spring.news.vo.NewsVO;

public class NewsControllerImpl extends MultiActionController implements NewsController {
	private NewsService newsService =null;
	
	public void setNewsService(NewsServiceImpl newsService) {
		this.newsService = newsService;
	}
	
	@Override
	public ModelAndView listNewss(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		List<NewsVO> newssList = newsService.listNewss();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("newssList", newssList);
		return mav;
	}
	
	@Override
	public ModelAndView addNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		NewsVO newsVO = new NewsVO();
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		String title = request.getParameter("title");
		String img = request.getParameter("img");
		String content = request.getParameter("content");
		newsVO.setAid(aid);
		newsVO.setTitle(title);
		newsVO.setImg(img);
		newsVO.setContent(content);
		
		bind(request, newsVO);
		int result = 0;
		result = newsService.addNews(newsVO);
		ModelAndView mav = new ModelAndView("redirect:/news/listNewss.do");
		return mav;
	}
	
	@Override
	public ModelAndView modNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		int aid = Integer.parseInt( request.getParameter("aid"));
		String viewName = getViewName(request);
		
		NewsVO newsVO = newsService.modNews(aid);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		mav.addObject("news" , newsVO);
		return mav;
	}
	
	
	@Override
	public ModelAndView updateNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		int aid = Integer.parseInt(request.getParameter("aid"));
		String title = request.getParameter("title");
		String img = request.getParameter("img");
		String content = request.getParameter("content");
		
		NewsVO newsVO = new NewsVO();
		newsVO.setAid(aid);
		newsVO.setTitle(title);
		newsVO.setImg(img);
		newsVO.setContent(content);
		bind(request, newsVO);
		int result = newsService.updateNews(newsVO);		
		ModelAndView mav = new ModelAndView("redirect:/news/listNewss.do");
		return mav;
	}
	
	@Override
	public ModelAndView removeNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int aid = Integer.parseInt(request.getParameter("aid"));
		newsService.removeNews(aid);
		ModelAndView mav = new ModelAndView("redirect:/news/listNewss.do");
		return mav;
	}
	
	public ModelAndView Form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
	
	
	private String getViewName (HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if(uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}
	
		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String fileName = uri.substring(begin, end);
		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
		}
		return fileName;

	}
	
	
	
	
	
	
}
