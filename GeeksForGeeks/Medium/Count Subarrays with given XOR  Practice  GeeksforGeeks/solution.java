class Solution {
    public long subarrayXor(int arr[], int k) {
        int xor=0;
        
        Map<Integer ,Integer> map=new HashMap<Integer,Integer>();
        
        map.put(xor,1);
        int c=0;
        for(int ele : arr){
            xor^=ele;
            if(map.containsKey(xor^k)){
                c+=map.get(xor^k);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        
        return c;
    }
}