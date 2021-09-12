package org.example;

import java.util.Scanner;

import static java.lang.System.out;


/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    //public int c;
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {
        App ask = new App();
        int[] one = ask.question();
        int found = ask.find(one);
       // out.println(String.format("%d",c));
        out.println(String.format("The largest number is %d",found) );
    }
    public int[] question(){
        int[] arr;
        int c=0;
        arr = new int[9];
        String v;
        while((c <10)){
            out.print("Enter a number or x to exit: ");
            v=in.next();
            if(v.equals("x")) break;
            else
            arr[c] = Integer.parseInt(v);
            c++;
        }
        return arr;
    }
    private int find(int[] one){
        int x=0;
        int temp =one[x];
        for(x=0;x<8;x++){
            if(temp < one[x+1]){
                temp = one[x+1];
            }
        }
        return temp;
    }
}
