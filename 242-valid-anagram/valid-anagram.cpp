class Solution {
public:
    bool isAnagram(string s, string t) {
        map <char,int> m;
        int j=0;
        for(int i=0;i<s.size();i++){
            if(m.find(s[i])!=m.end())
                m[s[i]]=m[s[i]]+1;
            else
                m[s[i]]=1;
        }
        for(j=0;j<t.size();j++){
            if(m.find(t[j])!=m.end() && m[t[j]]>0)
                m[t[j]]-=1;
            else
                break;
        }
        if(j==t.size() && s.size()==t.size())
            return true;
        return false;
    }
};