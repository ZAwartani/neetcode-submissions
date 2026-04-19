class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        int right = (m + n) - 1;
        int left = m - 1;

        // swap part (same logic as your Java code)
        while (left >= 0) {
            int temp = nums1[right];
            nums1[right] = nums1[left];
            nums1[left] = temp;
            right--;
            left--;
        }

        // copy nums2 into nums1
        for (int i = 0; i < n; i++) {
            nums1[i] = nums2[i];
        }

        // sort final array
        sort(nums1.begin(), nums1.end());
    }
};