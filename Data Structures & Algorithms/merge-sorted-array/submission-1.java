class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right = (m+n)-1;
        int left = m-1;
        // swape between index on right with left like this 
        while(left >= 0){
            int temp = nums1[right];
            nums1[right] = nums1[left];
            nums1[left] = temp;
            right--;
            left--;
        }
        for(int i = 0 ; i < n ; i++){
            nums1[i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}