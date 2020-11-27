package com.ankit.learningpoint.datastructure.graph;

import java.util.stream.Stream;

public class ArrayPractice {
    public static void main(String[] args) {
        String [] oneDArr = new String[]{"","",""};
        String [][] twoDArr = new String[][]{
                {"r0c1","r0c1","r0c2"},
                {"r1c1","r1c1","r1c2"},
                {"r2c1","r2c1","r2c2"}};

       // Stream.of(twoDArr).forEach(row -> printRow(row));
        //System.out.println("Done");

        Stream.of(twoDArr).forEach( row -> {
            Stream.of(row).forEach(val -> System.out.print(" "+val));
            System.out.println();
        });

        Boolean[][] boolTwoArr = {{true,true,true},
                {true, false, true},
                {false, false,false}};

        Stream.of(boolTwoArr).forEach((Boolean [] row)->{
            Stream.of(row).map(a-> a+" ").forEach(System.out::print);
            System.out.println();
        });
    }

    /*public static void printRow(String [] row){
        Stream.of(row).forEach(val -> System.out.print(" "+val));
        System.out.println();
    }*/
}
