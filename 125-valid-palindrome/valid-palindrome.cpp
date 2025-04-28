class Solution {
public:
    bool isPalindrome(string s) {
        char arr[200000];
        char arr2[200000];
        int lastindex=-1,lastindex2=0;
        for(auto e:s){
            if(e>='A' && e<='Z'){
                lastindex++;
                arr[lastindex]=(e+32);
            }
            if(e>='a' && e<='z'){
                lastindex++;
                arr[lastindex]=e;
            }
            if(e>='0' && e<='9'){
                lastindex++;
                arr[lastindex]=e;
            }
        }
        lastindex2=lastindex;
        for(int i=lastindex,j=0;i>=0;i--,j++)
            arr2[j]=arr[i];
        for(int l=0;l<=lastindex2;l++)
            cout<<arr[l];
        cout<<endl;
        for(int l=0;l<=lastindex2;l++)
            cout<<arr2[l];
        for(int k=0;k<=lastindex2;k++){
            if(arr2[k]!=arr[k])
                return false;
        }
        return true;
    }
};