public class NextgreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        char x=target;
        int st=0;
        int end= letters.length -1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(letters[mid]<=x){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[st%letters.length]; 
    }
    public static void main(String[] args) {
        NextgreatestLetter obj=new NextgreatestLetter();
        char arr[]={'c','f','j'};
        char target='a';
        System.out.println(obj.nextGreatestLetter(arr,target));
    }
}


//leetcode 744