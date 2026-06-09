package Bitwise;

public class Pascaltriangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println(1 << (n-1));
}}
//sum of each row is 2^n where n is the row number starting from 0. so we can use bitwise operator to calculate the sum of each row in O(1) time.
//for nth row the sum will be 2^n which is equal to 1 << n . so we can calculate the sum of nth row in O(1) time using bitwise operator.