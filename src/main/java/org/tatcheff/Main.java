package org.tatcheff;



public class Main {
    public static void main(String[] args) {
        Goods goods= new Goods(1,"Goods 1",10);
        Goods goods1= new Goods(2,"Goods 1",10);
        Box<Goods>box=new Box<>(goods1);
        Goods.goodsComparatorByName.compare(goods,goods1);


    }
}
