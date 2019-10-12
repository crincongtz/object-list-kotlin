package com.example.listaobjetos.models;

public class Persona {

    private String name;
    private String email;
    private int image;

    public Persona(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Persona(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
