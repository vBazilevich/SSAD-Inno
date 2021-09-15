package com.moofiyTv.mossapp.homework;


import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way ;
public class Human extends Worker implements Enterpreneur, Religious, Romantic, Sportsman, Unemployed {

    private String name;
    private String nickname;
    private double salary;
    private Language lang;
    private List<String> hobbies;

    public Human(String name, double salary, Language lang) {
        super(salary);
        this.name = name;
        this.lang = lang;
    }

    // This implementation violates Open-Close and Dependency inversion principles
    //enum Languages {Arabic, English, Japanese}

    String sayHello() {
        return this.lang.sayHello();
    }

    // Method calculateTax violates Single Responsibility principle. So, lets separate it into a new class Worker
//    void calculateTax(int percentage) {
        //salary = salary * percentage;
//    }

    int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }

    void creatNickName(String postFix) {
        nickname = name.concat(postFix);
    }

    @Override
    public void pray() {
    }

    @Override
    public void playSports() {

    }

    @Override
    public void getMarried() {

    }

    @Override
    public void ownCompany() {

    }

    @Override
    public void becomeEmployee() {

    }


    public static void main(String[] args) {
        Human human = new Human("Bob", 3000.0, new Arabic());
        human.sayHello();
    }

}
