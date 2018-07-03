package com.startup.daddyschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.daddyschool.dao.ISchoolDAO;
import com.startup.daddyschool.entity.SchoolEntity;
@Service
public class SchoolService implements ISchoolService {
	@Autowired
	private ISchoolDAO schoolDAO;
	/*@Override
	public Article getArticleById(int articleId) {
		Article obj = articleDAO.getArticleById(articleId);
		return obj;
	}	
	@Override
	public List<Article> getAllArticles(){
		return articleDAO.getAllArticles();
	}
	@Override
	public synchronized boolean addArticle(Article article){
       if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
    	   return false;
       } else {
    	   articleDAO.addArticle(article);
    	   return true;
       }
	}
	@Override
	public void updateArticle(Article article) {
		articleDAO.updateArticle(article);
	}
	@Override
	public void deleteArticle(int articleId) {
		articleDAO.deleteArticle(articleId);
	}*/
	@Override
	public List<SchoolEntity> getAllSchools(){
		return schoolDAO.getAllSchools();
	}
}
