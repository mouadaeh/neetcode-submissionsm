class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase().replaceAll("[^a-z0-9]","");
        for (int i=0;i<a.length();i++){
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
