package com.michaldebicki;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        //1 . Zmień to na lambda exp
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//            }
//        };
//
//        Runnable runnable1 = () -> {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for (String part : parts) {
//                System.out.println(part);
//            }
//        };

        Function<String,String> lambdaFunction =s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        lambdaFunction.apply("123456");

        String result = everySecondCharacer(lambdaFunction,"1234567890");
        System.out.println(result);


        Supplier<String> iLoveJava = () ->"I love Java";
        //Supplier<String> iLoveJava = () ->{ return "I love Java!"; };
        String supplierResult = iLoveJava.get();

        System.out.println(supplierResult);


    }
    public static String everySecondCharacer(Function<String,String> func , String number){
        return func.apply(number.toString());
    }


}
