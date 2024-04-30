package airlinemanagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author liamg
 */
public class UserSession {
    private static UserSession instance;
    private String username;

    private UserSession(String username) {
        this.username = username;
    }

    public static UserSession getInstance(String username) {
        if (instance == null) {
            instance = new UserSession(username);
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void clearSession() {
        username = null;
        instance = null;
    }
}
