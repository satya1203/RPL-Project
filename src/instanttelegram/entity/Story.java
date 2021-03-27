/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanttelegram.entity;

import java.util.Date;
/**
 * Story.java
 * 
 * Created on March 27, 2021, 20:00 PM 
 */

/**
 *
 * @author MelvinS
 */
public class Story {
    private Date storyTime;
    private User author;
    private String storySrc;

    public Story(Date _storyTime, User _author, String _storySrc) {
        this.storyTime = _storyTime;
        this.author = _author;
        this.storySrc = _storySrc;
    }

    public Date getStoryTime() {
        return storyTime;
    }

    public void setStoryTime(Date _storyTime) {
        this.storyTime = _storyTime;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User _author) {
        this.author = _author;
    }

    public String getStorySrc() {
        return storySrc;
    }

    public void setStorySrc(String _storySrc) {
        this.storySrc = _storySrc;
    }
    
    
}
