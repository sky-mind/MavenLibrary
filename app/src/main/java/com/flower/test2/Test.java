package com.flower.test2;

import java.io.File;
import java.util.Random;

/**
 * @author nicolee 2018/3/29
 */

public class Test {
    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        long length = file.length();
        System.out.println(length);

    }

    @Override
    public String toString() {
        return super.toString();
    }



}
