package com.inno.moofiy.ssad.labs.builders;

public class Game implements GameBuilder {

   private String title;
   private String publisher;
   private String company;
   private String price;
   private String date;
   private String trailer;
   private String discounts;

    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public GameBuilder title(String data) {
        title = data;
        return this;
    }

    @Override
    public GameBuilder publisher(String data) {
        return this;
    }

    @Override
    public GameBuilder company(String data) {
        company = company;
        return this;
    }

    @Override
    public GameBuilder price(String data) {
        return this;
    }

    @Override
    public GameBuilder date(String data) {
        return this;
    }

    @Override
    public GameBuilder trailer(String data) {
        return this;
    }

    @Override
    public GameBuilder discounts(String data) {
        return this;
    }


    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCompany() {
        return company;
    }

    public String getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getTrailer() {
        return trailer;
    }

    public String getDiscounts() {
        return discounts;
    }


}
