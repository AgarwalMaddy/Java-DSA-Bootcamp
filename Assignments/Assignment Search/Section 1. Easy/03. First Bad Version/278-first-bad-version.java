/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* If the function call is true it means the product is defective which implies either it is the first defective product or any product before it is defective. Therefore we store the first defective encountered defective and move left to check for more else if the function return false implies that the product is working and that the defective product either lies to right or does not exits. */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int index = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}