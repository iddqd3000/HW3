package com.company;

public class Person {
    private String name;
    private String friendNames = "";
    private int friendCounter;


    public Person(String name) {
        this.name = name;

    }

    public void befriend(Person p) {
        friendNames = friendNames + " " + p.name;
        friendCounter += 1;
    }

    public void unfriend(Person p) {
        String[] splitedFriends = friendNames.split(p.name);
        friendNames = splitedFriends[0] + splitedFriends[1];
        friendCounter -= 1;

    }

    public String getFriendNames() {
        return friendNames;
    }

    public int getFriendCounter() {
        return friendCounter;
    }
}
