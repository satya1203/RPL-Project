/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanttelegram.entity;
/**
 * Account.java
 * 
 * Created on March 27, 2021, 15:10 PM 
 */

/**
 * Kelas Account yang berisi atribut parent class account. 
 * @author NealsonW
 */
public class Account {
    private String fullname;
    private String username;
    private String email;
    private String password;
    private String gender;
    private String phoneNum;

    public Account() {
    }

    public Account(String _fullname, String _username, String _email, String _password, String _gender, String _phoneNum) {
        this.fullname = _fullname;
        this.username = _username;
        this.email = _email;
        this.password = _password;
        this.gender = _gender;
        this.phoneNum = _phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String _phoneNum) {
        this.phoneNum = _phoneNum;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String _fullname) {
        this.fullname = _fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String _username) {
        this.username = _username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String _gender) {
        this.gender = _gender;
    }
    
    
}
