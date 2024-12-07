class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==1&&n==0){
            nums1[0]=nums1[0];
        }
        else{
            int arr[]=new int [m+n];
            int i=0,j=0,k=0;
            while(i<m&&j<n){
                if(nums1[i]<=nums2[j]){
                    arr[k]=nums1[i];
                    i++;
                    k++;
                }
                else{
                    arr[k]=nums2[j];
                    j++;
                    k++;
                }
            }
            while (i < m) {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            while (j < n) {
                arr[k]=nums2[j];
                j++;
                k++;
            }
            for(int l=0;l<arr.length;l++){
                nums1[l]=arr[l];
            }
        }
    }
}