class Solution {
public:
    string reverseWords(string s) {
        stringstream sc(s);
        string word;
        vector<string>arr;
        while(sc>>word)
        {
            arr.push_back(word);
        }
        string ans="";
        for(int i=arr.size()-1;i>=0;i--)
        {
            if(i!=0)
            ans=ans+arr[i]+" ";
            else
            ans=ans+arr[i];
        }
        return ans;
        
    }
};