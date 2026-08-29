class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] a=s.toCharArray();
        char[] b=s.toCharArray();
        Arrys.sort(a);
        Arrays.sort(b);
        return Arrays.equal(a,b);
    }
}