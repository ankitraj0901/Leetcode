class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        HashMap <Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int res=target-numbers[i];
            if(h1.containsKey(res)){
                arr[1]=h1.get(res);
                arr[0]=i+1;
                Arrays.sort(arr);
                return arr;
            }
            else{
                h1.put(numbers[i],i+1);
            }
        }
        return arr;
    }
}