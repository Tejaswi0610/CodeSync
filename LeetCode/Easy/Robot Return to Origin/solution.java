class Solution {
    public boolean judgeCircle(String moves) {
        int lc=0;
        int rc=0;
        int uc=0;
        int dc=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                uc++;
            }
            if(moves.charAt(i)=='D'){
                dc++;
            }
            if(moves.charAt(i)=='L'){
                lc++;
            }
            if(moves.charAt(i)=='R'){
                rc++;
            }
        }
        if(lc==rc && uc==dc){
            return true;
        }
        return false;
    }
}

// class Solution {
//     public boolean judgeCircle(String moves) {
//         int UpDown = 0;
//         int LeftRight = 0;

//         for (char c : moves.toCharArray() )
//         {
//             if (c == 'U')
//                 UpDown++;
//             else if (c == 'D')
//                 UpDown--;
//             else if (c == 'R')
//                 LeftRight++;
//             else if (c == 'L')
//                 LeftRight--;
//         }
//         return (LeftRight == 0 && UpDown == 0);
//     }
// }