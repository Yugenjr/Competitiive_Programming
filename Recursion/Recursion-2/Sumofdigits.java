class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sumofdig(543));
    }
    public static int sumofdig(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return sumofdig(n/10) + n%10;
    }
}