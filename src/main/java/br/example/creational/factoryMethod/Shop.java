package br.example.creational.factoryMethod;


public class Shop extends Website{

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new AboutPage());
    }
}
