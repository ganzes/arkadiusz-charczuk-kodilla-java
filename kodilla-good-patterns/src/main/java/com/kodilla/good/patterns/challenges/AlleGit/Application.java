package com.kodilla.good.patterns.challenges.AlleGit;

public class Application {

    public static void main (String [] args){

        BoughtRequestRetriever boughtRequestRetriever = new BoughtRequestRetriever();
        BoughtRequest boughtRequest = boughtRequestRetriever.retrieve();

        ProductOrderService orderService = new ProductOrderService(new MailService(), new ItemBoughtService(),
                new ItemBoughtRepository());

        orderService.process(boughtRequest);
    }
}
