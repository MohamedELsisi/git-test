package Service;

import Model.Like;

public interface likesService {
    public Like addLike(Like like);
    public boolean removeLike(Like like);
    
}
