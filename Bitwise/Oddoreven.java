package Bitwise;

public class Oddoreven {
    int n=45;
    public void check(){    
        if((n & 1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

//last digit of binary - least significant bit - LSB