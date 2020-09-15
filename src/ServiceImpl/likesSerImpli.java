package ServiceImpl;

import Model.Like;
import Service.likesService;
import jdk.dynalink.linker.LinkerServices;

import static DAO.likesData.likesData;

public class likesSerImpli implements likesService {
    @Override
    public Like addLike(Like like) {
        likesData.add(like);
        return like;
    }

    @Override
    public boolean removeLike(Like like) {
        if(likesData.contains(like))  likesData.remove(like);
        else System.out.println("not found");

        return true;
    }
}
