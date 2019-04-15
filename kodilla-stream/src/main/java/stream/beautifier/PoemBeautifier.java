package com.kodilla.stream.beautifier;

public  class PoemBeautifier{

    public String beautify (String textToBeautify) {
        String result = textToBeautify;
        return result;
    }

    public String add(String string, PoemDecorator poemDecorator){
        return poemDecorator.decorate(string);
    }
}