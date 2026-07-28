class Solution {
    public int dayOfYear(String date) {
        int y=Integer.parseInt(date.substring(0,4));
        int m=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8,10));
        int []days={31,28,31,30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeap(y)){
            days[1]=29;
        }
        int totalDays=0;
        for(int i=0;i<m-1;i++){
            totalDays+=days[i];
        }
        totalDays+=d;
        return totalDays;
    }
    private boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}