package com.company;

class War extends Thread {

    War(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(getName());
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        War egg = new War("Яйцо");
        War chicken = new War("Курица");
        chicken.start();
        egg.start();
        chicken.join();
        if(egg.isAlive()){
            egg.join();
            System.out.println("Выйграло эгг");
        }
        else{
                System.out.println("Выйграла чикен");
        }
    }
}