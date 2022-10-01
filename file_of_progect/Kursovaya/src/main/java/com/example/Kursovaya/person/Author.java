package com.example.Kursovaya.person;

import com.example.Kursovaya.logic.Departamtnt;
import com.example.Kursovaya.logic.Post;

import java.net.DatagramPacket;

public class Author extends Chelovek{
    private String jobTitle="Author";
    private Departamtnt dep4Author;

    public void editPost(Post p,String news){
        p.setNews(news);
    }

    public Author(String name, String surename, String email, String pass, Departamtnt dep4Author) {
        super(name, surename, email, pass);
        this.dep4Author = dep4Author;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Departamtnt getDep4Author() {
        return dep4Author;
    }
}
