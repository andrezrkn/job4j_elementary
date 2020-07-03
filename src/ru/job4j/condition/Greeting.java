package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        int year = 2020;
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But i am a newbie. ";
        idea = idea + year;
        System.out.println(idea);
    }
}
