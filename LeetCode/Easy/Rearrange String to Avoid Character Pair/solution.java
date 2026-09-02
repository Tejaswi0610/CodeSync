class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] arr=s.toCharArray();
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==y){
                char temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
                pos++;
            }
        }
        return new String(arr);
    }
}