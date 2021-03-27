/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanttelegram.entity;
/**
 * Account.java
 * 
 * Created on March 27, 2021, 17:03 PM 
 */

/**
 * Kelas DirectMessage berisi atribut direct message dan fungsi/prosedur yang diperlukan untuk message.
 * @author chris
 */
//import User;
public class DirectMessage {
    User sender;
    User receiver;
    String message;

    public void setMessage(String _message){
            this.message = _message;
    }
    
    private void sendDirectMessage(User _username,String _message){
            //username.dm.setMessage(message);		//dm = object dalam user
            //username.dm.setReceiver(username);
    }
}
