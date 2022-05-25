package com.company;

public class HouseBuilder implements AdvancedBuilder{
    @Override
    public void buildHouse(String location) {
        System.out.println("Xây dựng một ngôi nhà nằm trong" +location+" Khu vực! ");
    }

    @Override
    public void buildSkyscrapper(String location) {

    }
}
