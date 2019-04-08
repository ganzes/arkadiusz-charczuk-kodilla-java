package com.kodilla.testing.forum.statistics;

public class ComputeStatistics {//klasa obliczajaca statystyki


    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsUsers;
    private double averageCommentsUsers;
    private double averageCommentsPosts;

    public int getUsersQuantity() {//liczbe uzytkownikow
        return usersQuantity;
    }

    public int getPostsQuantity() {//liczba postow
        return postsQuantity;
    }

    public int getCommentsQuantity() {//lista komentarzy
        return commentsQuantity;
    }

    public double getAveragePostsUsers() {//liczba postow na uzytkownika
        return averagePostsUsers;
    }

    public double getAverageCommentsUsers() {//liczba komentarzy na uzytkownika
        return averageCommentsUsers;
    }

    public double getAverageCommentsPosts() {//liczba komentarzy na post
        return averageCommentsPosts;
    }

    private double calAveragePostsPerUsers(){
        if(usersQuantity>0){
            return (double)postsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calAverageCommentsPerUsers(){
        if(usersQuantity>0){
            return (double)commentsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calAverageCommentsPerPosts(){
        if(postsQuantity>0){
            return (double)commentsQuantity/postsQuantity;
        } else {
            return 0;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsUsers = calAveragePostsPerUsers();
        averageCommentsUsers = calAverageCommentsPerUsers();
        averageCommentsPosts = calAverageCommentsPerPosts();
    }


    public void showStatistics (){
        System.out.println(usersQuantity);
        System.out.println(postsQuantity);
        System.out.println(commentsQuantity);
        System.out.println(calAveragePostsPerUsers());
        System.out.println(calAverageCommentsPerPosts());
        System.out.println(calAverageCommentsPerUsers());
    }
}
