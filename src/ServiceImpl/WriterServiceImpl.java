package ServiceImpl;

import DAO.NewsData;
import Model.News;
import Service.WriterService;

public class WriterServiceImpl implements WriterService {
    @Override
    public News addNew(News news) {
        NewsData.processNews.add(news);
        return news;
    }

    @Override
    public boolean deleteNew(News news) {
        NewsData.processNews.remove(news);
        return true;
    }

    @Override
    public News updateNew(News oldness, News newNews) {
        int index = NewsData.processNews.indexOf(oldness);
        NewsData.processNews.set(index, newNews);
        System.out.println("7sl");
        return newNews;
    }

    @Override
    public News searchNew(News news) {
        if (NewsData.processNews.contains(news)) {
            System.out.println("Ana hna ya jo");
            return news;
        }
       else   System.out.println("not Found");
        return null;
    }

    @Override
    public boolean addLike() {
        return false;
    }

}
