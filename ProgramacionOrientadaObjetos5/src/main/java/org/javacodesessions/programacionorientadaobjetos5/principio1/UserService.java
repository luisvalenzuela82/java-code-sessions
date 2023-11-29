/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio1;

/**
 *
 * @author Luis Valenzuela
 */
public class UserService {

    private String userId;
    private String userName;
    private String userEmail;

    public UserService(String userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public void saveUserToDatabase() {
        // Lógica para guardar el usuario en la base de datos
        System.out.println("Guardando usario " + userName + " en la base de datos");
    }

    // Getters y setters para userName y userEmail
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}
