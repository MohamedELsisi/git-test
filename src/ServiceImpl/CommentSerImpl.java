package ServiceImpl;

import DAO.commentsData;
import Model.Comment;
import Service.CommentServive;

public class CommentSerImpl implements CommentServive {


    @Override
    public Comment addComment(Comment comment) {
        commentsData.commentData.add(comment);
        return comment;
    }

    @Override
    public boolean deleteComment(Comment comment) {
        if(commentsData.commentData.contains(comment))    commentsData.commentData.remove(comment);
        else System.out.println("not found");
        return true ;
    }
}
