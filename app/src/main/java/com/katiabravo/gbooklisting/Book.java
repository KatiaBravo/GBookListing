package com.katiabravo.gbooklisting;

/**
 * Created by wendy on 7/4/2017.
 */

public class Book {
    private String mAuthor;
    private String mTitle;
    private String mLevel;

    public Book(String author, String title, String level){
        mAuthor = author;
        mLevel = "By: " + level;
        mTitle = title;
    }

    public String getAuthor() {return mAuthor;}
    public String getTitle() {return mTitle;}
    public String getLevel() {return mLevel;}
}
