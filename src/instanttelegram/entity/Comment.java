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
        this.author = author;
        this.commentTime = commentTime;
        this.comment = comment;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
