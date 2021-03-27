/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanttelegram.entity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * User.java
 * 
 * Created on March 27, 2021, 15:10 PM 
 */

/**
 * Kelas User yang berisi atribut user dan fungsi/prosedur untuk user. 
 * @author NealsonW
 */
public class User extends Account{
    User user = new User();
    private String profilePic;
    private String biography;
    private ArrayList<User> listUser = new ArrayList<>();
    private ArrayList<Post> listOfPost = new ArrayList<>();
    private ArrayList<Post> listOfSavedPost = new ArrayList<>();

    public User() { 
        
    }

    public User(String _profilePic, String _biography, String _fullname, String _username, String _email, String _password, String _gender, String _phoneNum) {
        super(_fullname, _username, _email, _password, _gender, _phoneNum);
        this.profilePic = _profilePic;
        this.biography = _biography;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String _profilePic) {
        this.profilePic = _profilePic;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String _biography) {
        this.biography = _biography;
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> _listUser) {
        this.listUser = _listUser;
    }
    
    public void addUser(User _user){
        listUser.add(_user);
    }
    public ArrayList<Post> getListOfPost() {
        return listOfPost;
    }

    public void setListOfPost(ArrayList<Post> _listOfPost) {
        this.listOfPost = _listOfPost;
    }
    
    public ArrayList<Post> getListOfSavedPost() {
        return listOfSavedPost;
    }

    public void setListOfSavedPost(ArrayList<Post> _listOfSavedPost) {
        this.listOfSavedPost = _listOfSavedPost;
    }

    public boolean register(String _fullname,String _username, String _email, String _password, String _gender, String _phoneNum) {
        User user = new User();
        user.setFullname(_fullname);
        user.setUsername(_username);
        user.setEmail(_email);
        user.setPassword(_password);
        user.setGender(_gender);
        user.setPhoneNum(_phoneNum);
        boolean isValid = false;
        //ArrayList<User> listUser = Controller.getAllUser();                
        //mengecek apakah ada kredensial yang sama dengan user yang sudah ada
        for(int i = 0; i < user.getListUser().size(); i++) {
            if(username.equals(user.getListUser().get(i).getUsername())) {
                System.out.println("Maaf username sudah terdaftar harap diubah");
            } else if(email.equals(user.getListUser().get(i).getEmail())) {
                System.out.println("Maaf email sudah terdaftar harap diubah");
            } else {
                isValid = true;
            }
        }

        if(isValid == true) {
            //apabila berhasil akun akan masuk ke database
            //Controller.insertNewUser(user);
            user.addUser(user); 
            return true;
        }
        return false;
    };
    
    public boolean login(String _username, String _password) {
        //ArrayList<User> listUser = Controller.getAllUser();
        //Mengecek apakah user sudah terdaftar
        for(int i = 0; i < user.getListUser().size(); i++) {
            if(_username.equals(user.getListUser().get(i).getUsername()) && _password.equals(user.getListUser().get(i).getPassword())){
                return true;
            }    
        }
        return false;
    };
    
    public boolean recoverAccount(String _username) {
        boolean isValid = false;
        //ArrayList<User> listUser = Controller.getAllUser();
        //Mengecek dari database apakah user sudah terdaftar
        
        for(int i = 0; i < user.getListUser().size(); i++) {
            if(_username.equals(user.getListUser().get(i).getUsername())){
                isValid = true;
            }    
        }
        if(isValid == true) {
            Scanner scan  = new Scanner(System.in);
            String newPass = scan.nextLine();
            //update password milik username tersebut di database
            //Controller.recoverAccount(newPass,username);
            return true;
        }
        return false;
    };
    
    public void editUser(String _profilePic, String _biography, String _fullname, String _username, String _email, String _password, String _gender, String _phoneNum) {
        String tempUsername = _username;
        boolean isValid = false;
        //ArrayList<User> listUser = Controller.getAllUser();
        
        //mengecek apakah ada kredensial yang sama dengan user yang sudah ada
        for(int i = 0; i < user.getListUser().size(); i++) {
            if(_username.equals(user.getListUser().get(i).getUsername()) && !(_username.equals(tempUsername))) {
                System.out.println("Sudah ada yang memakai username ini");
            } else {
                isValid = true;
            }
        }
        
        if(isValid == true){
            //update data profile user di database
            //Controller.updateUserProfile(String profilePic, String biography, String fullname, String username, String email, String password, String gender, String phoneNum);
        }else{
            System.out.print("Perubahan profile gagal dilakukan"); 
        }
    }
    
    public void logout(){
        System.out.println("logout success");
        return;
    }
    
    public void cratePost(String _postSource, String _caption, User _user) {
        Post post = new Post;
        
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        post.setPostSrc(_postSource);
        post.setCaption(_caption);
        //post.setAuthor(user.getUsername());
        post.setLike(0);
        post.setPostTime(formatter.format(date));
        // memasukkan data postingan ke database
        //Controller.insertNewPost(post);
        // data post masuk ke list
        //post.addPost(post)
        
    }
    
    public void createStory(String _storySource, User _user) {
        //Story story = new Story();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        /*
        story.setStorySrc(_storySource);
        story.setAuthor(_user.getUsername());
        story.setStoryTime(formatter.format(date));
        * memasukkan data story ke database
        Controller.insertNewStory(story);
        * data story masuk ke list
        story.addStory(story);
        */
    }
    
    public void viewDirectMessage(String _usernameFriend, String _username) {
        //list pesan/DM dari teman yang tersimpan di database
        //ArrayList<friend> listFriendMessage = Controller.getFriendMessage(_usernameFriend, _username);
        /*
        for(int i=0; i<listFriendMessage.size(); i++){
            System.out.println(listMessagedFriend.get(i).getMessage());
        }
        */
    }
    
    public void viewPost(User _user) {
        //list dari post yang diterbitkan oleh user
        //ArrayList<Post> listOwnPost = Controller.getUserPost(user.getUsername());
        user.getListOfPost();
        for(int i = 0; /*i<listOwnPost.size()*/ _user.getListOfPost().get(i).size(); i++ {
            System.out.println(user.getListOfPost().get(i).getAuthor()
            ,_user.getListOfPost().get(i).getPostSrc()
            ,_user.getListOfPost().get(i).getCaption()
            ,_user.getListOfPost().get(i).getListOfComments()
            ,_user.getListOfPost().get(i).getPostTime());
        }
          
    }
    
    public void viewShop() {
        //list dari barang yang dijual yang tersimpan pada database
        //ArrayList<Shop> listOfItems = Controller.getItems();
        /*
            for(int i=0; i<listOfItems.size();){
                System.out.println(listOfItems.get(i).getItemSource()
                ,listOfItems.get(i).getItemName()
                ,listOfItems.get(i).getShopName());
            }
        */
    }
}
