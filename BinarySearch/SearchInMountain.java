package BinarySearch;
public class SearchInMountain {
    /**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int st=0;
        int en=mountainArr.length()-1;
        while(st<en)
        {
            int mid=st+(en-st)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                en=mid;
            }
            else {
                st=mid+1;
            }   
        }
        int peak=st;
        int pea2=peak;
        int beg=0;
        while(beg<=peak)
        {
            int midd=beg+(peak-beg)/2;
            if(mountainArr.get(midd)==target)
            {
                return midd;
            }
            else if(mountainArr.get(midd)<target)
            {
                beg=midd+1;
            }
            else
            {
                peak=midd-1;
            }
        }
        int beg2=pea2;
        int peak2= mountainArr.length()-1;
        while(beg2<=peak2)
        {
            int midd2=beg2+(peak2-beg2)/2;
            if(mountainArr.get(midd2)==target)
            {
                return midd2;
            }
            else if(mountainArr.get(midd2)>target)
            {
                beg2=midd2+1;
            }
            else
            {
                peak2=midd2-1;
            }
        }
        return -1;
    }
}


//from the leetcode 1095. Find in Mountain Array. 