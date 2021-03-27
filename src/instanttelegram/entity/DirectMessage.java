/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanttelegram.entity;

/**
 *
 * @author chris
 */
//import User;
public class DirectMessage {
    User sender;
    User receiver;
    String message;

    public void setMessage(String message){
            this.message=message;
    }
    sendDirectMessage(User username,String message){
            username.dm.setMessage(message);		//dm = object dalam user
            username.dm.setReceiver(username);
    }
}
