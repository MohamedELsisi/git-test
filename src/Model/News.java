package Model;

import Enums.Days;

import java.util.List;

public class News {

    private Enums.Category Category;
    private String newsString;
    private int id;
    private Writer writer;
    private String time;
    private List<Days>day;
    private List <Comment>comments;

    public News() {

    }

    public News(String category, String newsString, int id, Writer writer, String time, List<Days> day) {

        this.newsString = newsString;
        this.id = id;
        this.writer = writer;
        this.time = time;
        this.day = day;
    }

    public Enums.Category getCategory(Enums.Category economics) {
        return Category;
    }

    public void setCategory(Enums.Category category) {
        Category = category;
    }

    public String getNewsString() {
        return newsString;
    }

    public void setNewsString(String newsString) {
        this.newsString = newsString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Days> getDay() {
        return day;
    }

    public void setDay(List<Days> day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "News{" +
                "Category='" + Category + '\'' +
                ", newsString='" + newsString + '\'' +
                ", id=" + id +
                ", writer=" + writer +
                ", time='" + time + '\'' +
                ", day=" + day +
                ", comments=" + comments +
                '}';
    }
}
