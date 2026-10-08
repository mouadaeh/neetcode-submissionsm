class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result=false;
        int[] countS = new int[26];
        for(int i=0;i<s.length();i++){
            countS[s.charAt(i) - 'a']+=1;
        }
        int[] countT = new int[26];
        for(int i=0;i<t.length();i++){
            countT[t.charAt(i) - 'a']+=1;
        }
        for(int i=0;i<26;i++){
            if(countT[i]!=countS[i]){ result=false;
                break;
            }
            else result=true;
        }
        return result;
    }
}
