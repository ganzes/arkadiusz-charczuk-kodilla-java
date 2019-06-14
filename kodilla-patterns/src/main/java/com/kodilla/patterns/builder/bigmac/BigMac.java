package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final int burgers;
    private final List<String> sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder{
        private String bun;
        private int burgers;
        private List<String> sauce = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauc(String sauc){
            sauce.add(sauc);
            return this;
        }

        public BigMacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build(){
            return new BigMac(bun, burgers, sauce,ingredients);
        }
    }


    public BigMac(String bun, int burgers, List<String> sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = new ArrayList<>(sauce);
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString(){
        return "BigMac coming right up!" +
                " | bun= " + bun + '|' +
                "| burgers= " + burgers + '|' +
                "| sauce= " + sauce  + '|' +
                "| ingredients=" + ingredients +
                '}';
    }
}
