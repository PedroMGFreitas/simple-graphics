package org.academiadecodigo.ThirdIslandTruck;

public class Util {

    public static int getRandom(int min, int max){
        return (int) (Math.random() * (max - min) + min);

    }

    public static double getRandom() {
        return Math.random();
    }
}
