package ru.geekbrains.lesson2.server;

public class Users {

    private int id;
    private String name;
    private String surname;

    public Users(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Users(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(String surname){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

}
