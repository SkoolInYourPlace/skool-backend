package com.startup.daddyschool.dao;
import java.util.List;

import com.startup.daddyschool.entity.SchoolEntity;



public interface ISchoolDAO {
    List<SchoolEntity> getAllSchools();
    /*Article getArticleById(int articleId);
    void addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);*/
}
 