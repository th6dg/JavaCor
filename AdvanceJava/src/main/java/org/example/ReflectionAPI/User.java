package org.example.ReflectionAPI;

public class User implements  IUser{
    private Integer id;
    private String name;

    public User() {}

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void print() {
        System.out.println("Hello world");
    }

    @Override
    public void goodBye() {
        System.out.println("Good Bye");
    }

    @Override
    public void meetAgain() {
        System.out.println("Meet after good bye");
    }


}
