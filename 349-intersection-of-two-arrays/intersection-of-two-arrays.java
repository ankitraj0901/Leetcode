class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        int i,j,k=0;
        for(i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(list.contains(nums1[i]))
                        break;
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int arr[]=new int[list.size()];
        for(k=0;k<list.size();k++)
            arr[k]=list.get(k);
        return arr;
    }
    
}