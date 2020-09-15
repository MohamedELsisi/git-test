package Model;

public class Comment {
    private String content;
    private News news;

    public Comment(String content, News news) {
        this.content = content;
        this.news = news;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "content='" + content + '\'' +
                ", news=" + news +
                '}';
    }
}
