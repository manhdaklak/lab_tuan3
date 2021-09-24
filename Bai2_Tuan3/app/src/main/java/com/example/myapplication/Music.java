package com.example.myapplication;

public class Music {

    private String name;
    private String singer;
    private int imgae;

    public  Music(){

    }
    public Music(String name, String singer, int imgae) {
        this.name = name;
        this.singer = singer;
        this.imgae = imgae;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getImgae() {
        return imgae;
    }

    public void setImgae(int imgae) {
        this.imgae = imgae;
    }
}
