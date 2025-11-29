class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int output=nums[0];
        while(l<=h){
            int mid=(l+h)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if (nums[l]<nums[mid] && nums[l]<nums[h]) {
                return nums[l];
           }else if(nums[mid]<nums[prev] && nums[mid]<nums[next]){
                output=nums[mid];
                break;
            }else if(nums[l]<=nums[mid]){
                l=mid+1;
            }else if(nums[mid]<=nums[h]){
                h=mid-1;
            }
        }
        return output;
    }
}