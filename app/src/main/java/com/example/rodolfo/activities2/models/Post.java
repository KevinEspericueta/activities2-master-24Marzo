package com.example.rodolfo.activities2.models;

/**
 * Created by rodolfo on 17/03/18.
 */

public class Post {
    private String image;
    private String title;
    private String author;

    public Post(String image, String title, String author) {
        this.image = image;
        this.title = title;
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
