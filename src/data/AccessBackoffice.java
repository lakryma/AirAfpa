/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 */
public class AccessBackoffice {
    private int user_id;
    private String nickname;
    private String password;

    public AccessBackoffice(int user_id, String nickname, String password) {
        this.user_id = user_id;
        this.nickname = nickname;
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
