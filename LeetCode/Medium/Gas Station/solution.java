class Solution {
    public int canCompleteCircuit(int[] gas1, int[] cost1) {
       //int totalgas=0;
       //int maingas=0;
       //int idx=0;
       //for(int i=0;i<gas.length;i++){
        //int diff=gas[i]-cost[i];
        //totalgas=totalgas+diff;
        //maingas=maingas+diff;
        //if(maingas<0){
          //  maingas=0;
            //idx=i+1;
            //}
       //}
       //return totalgas>=0?idx:-1;
       int n=gas1.length*2;
       int n1=gas1.length;
       int[] gas2 = new int[n];
       int[] cost2=new int[n];
       for(int i=0;i<n;i++){
        gas2[i]=gas1[i%n1];
        cost2[i]=cost1[i%n1];
       }
       int n = gas1.length * 2;
       int n1 = gas1.length;
       int[] gas2 = new int[n];
       int[] cost2 = new int[n];

       for (int i = 0; i < n; i++) {
       gas2[i] = gas1[i % n1];
       cost2[i] = cost1[i % n1];
       }
       int c = 0;
       int fuel = 0;
       int start = 0;
       for (int i = 0; i < n; i++) {
        if (c == 0) {      
    }

    fuel += gas2[i] - cost2[i];

    if (fuel < 0) {
        fuel = 0;
        c = 0;
        continue;
    }

    c++;

    if (c == n1) {
        return start % n1;   // 🔹 correct start
    }
       }
return -1;

    }
}

