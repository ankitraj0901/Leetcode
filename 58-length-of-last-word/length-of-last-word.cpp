class Solution {
public:
    int lengthOfLastWord(string s) {
        int count=-1;
        for(int i=s.size()-1;i>=0;i--){
            if(count==-1 && s[i]==' ')
                continue;
            else if(count!=-1 && s[i]==' ')
                break;
            else
                count++;
        }
        return count+1;
    }
};