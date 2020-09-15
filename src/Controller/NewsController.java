package Controller;

import DAO.NewsData;
import Enums.Category;
import Enums.Days;
import Model.Comment;
import Model.News;
import ServiceImpl.CommentSerImpl;

import java.util.Collections;

import static DAO.commentsData.commentData;

public class NewsController {
public static CommentSerImpl commentImpl;
   public static void loadData(){
       commentImpl =new CommentSerImpl();
        for (int i = 0; i < 5; ++i) {
            News news = new News();
            news.setCategory(Category.Economics);
            news.setId(12345 + i);
            news.setWriter(null);

            Comment comment =new Comment("Hey",news);

            commentImpl.addComment(comment);
            NewsData.processNews.add(news);

    }}
    public static void main(String[] args) {
        loadData();
        for(News news1: NewsData.processNews){

            System.out.println( news1.toString());
        }
        for (Comment comment :commentData){
            System.out.println( comment.toString());


        }


        }
    }

