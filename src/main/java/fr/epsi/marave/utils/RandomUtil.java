package fr.epsi.marave.utils;

import java.util.Random;

public class RandomUtil {

    public static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
