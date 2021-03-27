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
public class Story {
    private Date storyTime;
    private User author;
    private String storySrc;

    public Story(Date storyTime, User author, String storySrc) {
        this.storyTime = storyTime;
        this.author = author;
        this.storySrc = storySrc;
    }

    public Date getStoryTime() {
        return storyTime;
    }

    public void setStoryTime(Date storyTime) {
        this.storyTime = storyTime;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getStorySrc() {
        return storySrc;
    }

    public void setStorySrc(String storySrc) {
        this.storySrc = storySrc;
    }
    
    
}
