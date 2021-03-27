/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
//import Controller.ControllerPost;
/**
 * Post.java
 * 
 * Created on March 27, 2021, 16:17 PM 
 */

/**
 * Kelas Post yang berisi atribut post dan fungsi/prosedur yang diperlukan post. 
 * @author Andreas
 */
public class Post {
    private int idPost;
    private String caption;;
    private Date postTime;
    private int likes;
    private String postSrc;
    private ArrayList<Comment> listOfComment = new ArrayList<>();
    private ArrayList<User> Author = new ArrayList<>();


    public Post() {
    }

    public Post(int idPost,String _caption, int _likes, String _postSrc, Date _postTime) {
        this.idPost = _idPost;
        this.caption = _caption;
        this.likes = _likes;
        this.postTime = _postTime;
        this.postSrc = _postSrc;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String _caption) {
        this.caption = _caption;
    }

    public int getLikes() {
        return likes;
    }

    public int setLikes(int _likes) {
        this.likes = _likes;
        return 0;
    }


    public Date getPostTime() {
        return postTime;
    }

    public Date setPostTime(Date _postTime) {
        this.postTime = _postTime;
        return null;
    }

    public ArrayList<Comment> getListOfComment() {
       return listOfComment;
    }

    public void setListComment(ArrayList<Comment> _listOfComment) {
        this.listOfComment = _listOfComment;
    }

    public ArrayList<User> getAuthor() {
        return User;
    }

    public void setAuthor(ArrayList<User> _Author) {
        this.Author = _Author;
    }

    public String getPostSrc() {
       return postSrc;
    }

    public void setPostSrc(String _postSrc) {
        this.postSrc = _postSrc;
    }
        public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int _idPost) {
        this.idPost = _idPost;
    }
    
//    @Override
//    public String toString() {
//        return "Post{" + "idPost = " + idPost + ",caption = " + caption + ", postTime = " + postTime + ", likes = " + likes + ", postSrc = " + postSrc + ", listOfComment=" + Comment + ", author = " + User +'}';
//    }
    

//    public String getUsername_user() {
//        return username_user;
//    }

//    public void setUsername_user(String username_user) {
//        this.username_user = username_user;
//    }

    

    
}
