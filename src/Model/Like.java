package Model;

public class Like {
    private  News news;
    private  User user;

    public Like(News news, User user) {
        this.news = news;
        this.user = user;

    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
