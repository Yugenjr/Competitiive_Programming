// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Reverse {
    public static void main(String[] args) {
        rev(5437342);
    }
    public static void rev(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n%10+"");
        rev(n/10);
    }
}