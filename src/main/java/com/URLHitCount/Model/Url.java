package com.URLHitCount.Model;

public class Url {
    private int count;
    private String username;

    public Url(int count, String username) {
        this.count = count;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Url{" +
                "count=" + count +
                ", username='" + username + '\'' +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
