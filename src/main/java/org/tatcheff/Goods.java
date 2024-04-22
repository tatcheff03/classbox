package org.tatcheff;
import NBU_.classbox.Weighted;

import java.util.Comparator;

public class Goods implements Weighted,Comparable<Goods>{
    private long id;
    private String name;
    private double weight;



    public Goods(long id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Goods o) {

        return Long.compare(this.id,o.id);
    }

    public static Comparator<Goods> goodsComparatorByName=new Comparator<Goods>() {
        @Override
        public int compare(Goods o1, Goods o2) {
            return o1.name.compareTo(o2.name);
        }
    };
}

