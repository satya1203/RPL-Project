/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanttelegram.entity;

import java.util.Date;

/**
 *
 * @author MelvinS
 */
public class Comment {
    private User author;
    private Date commentTime;
    private String comment;

    public Comment(User _author, Date _commentTime, String _comment) {
        this.author = _author;
        this.commentTime = _commentTime;
        this.comment = _comment;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User _author) {
        this.author = _author;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date _commentTime) {
        this.commentTime = _commentTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String _comment) {
        this.comment = _comment;
    }
    
    
}
