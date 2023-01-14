package br.example.creational.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {

        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton instance2 = DbSingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance2);

        System.out.println(instance == instance2);




    }

}
