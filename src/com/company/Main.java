package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] in = {13, 6, 17, 18, 19, 20, 37};

        System.out.println(lcmOfArray(in));
        System.out.println(lookAndSay(54544666));

    }

    public static Integer lcmOfArray(int[] inArray){

        int maxNum = inArray[0];

        for (int j : inArray) {
            if (j > maxNum)
                maxNum = j;
        }

        int end = 0;
        for(int i = 0; i < 10000000; i++){
            int good = 0;
            int newNum = maxNum*(i+1);
            for(int l = 0; l < inArray.length; l++){
                if(newNum % inArray[l] == 0){

                } else {
                    good = 1;
                }
            }
            if(good == 0) {
                end = newNum;
                break;
            }
        }
        return end;
    }

    public static BigInteger lookAndSay(int start){
        Integer val = start;
        String test = val.toString();
        if (test.length() % 2 == 1){
            return new BigInteger(String.valueOf(-1));
        } else {
            List numbers = new ArrayList();
            int store;
            while(start > 1){
                store = (start % 100);
                numbers.add(store);
                start = start/100;

            }
            System.out.println(numbers);
            String output = "";

            for(int i = numbers.size()-1; i >= 0; i--){
                int number = (int)numbers.get(i);
                int second = number % 10;

                int first = number / 10;
                String sec = Integer.toString(second);

                for(int j = 0; j < first; j++){
                    output = output.concat(sec);
                }


            }

            return new BigInteger(output);
        }

    }



}
