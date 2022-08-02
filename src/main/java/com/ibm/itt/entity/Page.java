package com.ibm.itt.entity;

/**
 * save content
 * @author kevin
 * created by 7/31/2022
 */
public class Page {
    //content of page
    private String content ;
    //all watch count
    private String allWatch ;
    //all start count
    private String allStart ;
    //all fork count
    private String allFork  ;
    //the title of the repo
    private String title ;
    //the author of current article
    private String author ;
    // the url of current page
    private String utl ;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAllWatch() {
        return allWatch;
    }

    public void setAllWatch(String allWatch) {
        this.allWatch = allWatch;
    }

    public String getAllStart() {
        return allStart;
    }

    public void setAllStart(String allStart) {
        this.allStart = allStart;
    }

    public String getAllFork() {
        return allFork;
    }

    public void setAllFork(String allFork) {
        this.allFork = allFork;
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

    public String getUtl() {
        return utl;
    }

    public void setUtl(String utl) {
        this.utl = utl;
    }

    @Override
    public String toString() {
        return "Page{" +
                "content='" + content + '\'' +
                ", allWatch='" + allWatch + '\'' +
                ", allStart='" + allStart + '\'' +
                ", allFork='" + allFork + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", utl='" + utl + '\'' +
                '}';
    }
}
