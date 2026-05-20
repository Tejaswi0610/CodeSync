class Solution {
    boolean ans=false;
    boolean find(char [][]mat,int i,int j,int idx,String word){
        if(ans) return true;
        if(idx==word.length()){
            ans=true;
            return true;
        }
        if(i<0||j<0||i>=mat.length||j>=mat[0].length||mat[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp=mat[i][j];
        mat[i][j]='$';
        boolean left=find(mat,i,j-1,idx+1,word); //left
        boolean right=find(mat,i,j+1,idx+1,word) ;//right
        boolean bottom=find(mat,i-1,j,idx+1,word) ;//bottom
        boolean top=find(mat,i+1,j,idx+1,word) ;//top
        mat[i][j]=temp;
        return left || right || bottom|| top;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                find(board,i,j,0,word);
                if(ans) return true;
            }
        }
        return ans;

    }
}