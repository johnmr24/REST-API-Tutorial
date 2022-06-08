package com.example.restservice;

public class Greeting {

    private final long id; //id for the greeting
    private final String content; //string to hold the item that the
                                  //greeting is directed towards

    public Greeting(long id, String content) { //constructor
        this.id = id;
        this.content = content;
    }

    public long getId() { //returns the id of the greeting
        return id;
    }

    public String getContent() { //returns the content of the greeting
        return content;
    }
}
