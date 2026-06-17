public class Countof0 {
    public static void main(String[] args) {
        int co=0;
        int n=00;
        if(n==0) System.out.println(1);
        else System.out.println(countof0(n,co));
    }
    public static int countof0(int n,int co)
    {
        if(n==0)
        {
            return co;
        }
        
        if(n%10==0) co+=1;
        return countof0(n/10,co);
    }
}