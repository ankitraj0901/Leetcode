class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (n == 1) {
            int arr[] = new int[1];
            switch (digits[0]) {
                case 0:
                    arr[0] = 1;
                    return arr;
                case 1:
                    arr[0] = 2;
                    return arr;
                case 2:
                    arr[0] = 3;
                    return arr;
                case 3:
                    arr[0] = 4;
                    return arr;
                case 4:
                    arr[0] = 5;
                    return arr;
                case 5:
                    arr[0] = 6;
                    return arr;
                case 6:
                    arr[0] = 7;
                    return arr;
                case 7:
                    arr[0] = 8;
                    return arr;
                case 8:
                    arr[0] = 9;
                    return arr;
                case 9:
                    arr = new int[2];
                    arr[0] = 1;
                    arr[1] = 0;
                    return arr;
            }
        }

        if(allnine(digits)){
            System.out.println("if");
            int arr[] = new int[n+1];
            arr[0] = 1;
            return arr;
        }
        else if (digits[digits.length-2]==9) {
            if(digits[n-1]!=9||digits[n-2]!=9){
                digits[digits.length-1]++;
                return digits;
            }
            else{
                int i, j;
                for(i=digits.length-2; i > 0 && digits[i]==9;i--);
                digits[i]+=1;
                for(j=i+1;j<digits.length-1;j++){
                    digits[j]=0;
                }
                digits[j]=0;
                return digits;
            }
        }
        else if (digits[n-1] == 9) {
            digits[n-2] ++;
            digits[n-1] = 0;
            return digits;
        }
        System.out.println("else");

        digits[n-1]+=1;

        return digits;
    }
    public static boolean allnine(int digits[]){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9)
                return false;
        }
        return true;
        
    }
}