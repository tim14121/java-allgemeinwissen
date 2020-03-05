package com.java.allgemein.wissen.designpatterns.builderpattern;

public class User {

    private String name;
    private int age;
    private int groesse;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.groesse = userBuilder.groesse;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groesse=" + groesse +
                '}';
    }

    public static class UserBuilder{
        private String name;
        private int age;
        private int groesse;

        public UserBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

       public UserBuilder withGroesse(int groesse){
            this.groesse = groesse;
            return this;
       }

       public  User build(){
            return new User(this);
       }
    }
}
