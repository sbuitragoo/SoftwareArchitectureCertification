package edu.unisabana.dyas.patterns.strategy.impl;

/**
 @author cesarvefe
 
 */
public class Principal {

    private String userName;
    private String rol;

    public Principal(String userName, String rol) {
        this.userName = userName;
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Principal{" + "userName=" + userName + ", rol=" + rol + '}';
    }

}