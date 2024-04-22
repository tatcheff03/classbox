package org.tatcheff;

public class Box <T extends NBU_.classbox.Weighted>{

    private T content;

    public Box(T content){
        this.content=content;
    }

    public double getContentWeight(){
        return content.getWeight();
    }

    public T getContent(){
        return  content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
    }
}