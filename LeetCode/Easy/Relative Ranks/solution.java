class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ans=new String[n];
        for(int rank=1;rank<=n;rank++){
            int max=-1;
            for(int i=0;i<n;i++){
                if(ans[i]==null && (max==-1 || score[i]>score[max])){
                    max=i;
                }
            }
            if(rank==1)
                ans[max]="Gold Medal";
            else if(rank==2)
                ans[max]="Silver Medal";
            else if(rank==3)
                ans[max]="Bronze Medal";
            else
                ans[max]=String.valueOf(rank);
        }
        return ans;
    }
}