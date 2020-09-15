package Service;

import Model.News;

public interface WriterService {
    //add ,delete ,read ,like ,comment,update,search;
    public News addNew(News news);

    boolean deleteNew(News news);

    public News updateNew(News oldness, News newNews);
    public News searchNew( News news);
    public boolean addLike();






}
