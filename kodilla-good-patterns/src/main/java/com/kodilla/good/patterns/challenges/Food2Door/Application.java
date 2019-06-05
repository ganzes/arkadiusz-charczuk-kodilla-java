package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {

    public static void main(String[] args) {

        BoughtRequestRetriever boughtRequestRetrieverExtraFood = new BoughtRequestRetriever();
        BoughtRequest boughtRequestExtraFood = boughtRequestRetrieverExtraFood.retrieveExtraFood();

        ProductOrderService orderServiceExtraFood = new ProductOrderService(new MailService(),
                new ExtraFoodShopBoughtService(),
                new ExtraFoodBoughtRepository());

        orderServiceExtraFood.process(boughtRequestExtraFood);


        BoughtRequestRetriever boughtRequestRetrieverHealthyShop = new BoughtRequestRetriever();
        BoughtRequest boughtRequestHealthyShop = boughtRequestRetrieverHealthyShop.retrieveHealthyShop();

        ProductOrderService orderServiceHealthyShop = new ProductOrderService(new MailService(),
                new HealthyShopBoughtService(),
                new HealthyShopBoughtRepository());

        orderServiceHealthyShop.process(boughtRequestHealthyShop);


        BoughtRequestRetriever boughtRequestRetrieverGlutenFreeShop = new BoughtRequestRetriever();
        BoughtRequest boughtRequestGlutenFreeShop = boughtRequestRetrieverGlutenFreeShop.retrieveGlutenFreeShop();

        ProductOrderService orderServiceGlutenFreeShop = new ProductOrderService(new MailService(),
                new GlutenFreeShopBoughtService(),
                new GlutenFreeShopBoughtRepository());

        orderServiceGlutenFreeShop.process(boughtRequestGlutenFreeShop);

    }
}
