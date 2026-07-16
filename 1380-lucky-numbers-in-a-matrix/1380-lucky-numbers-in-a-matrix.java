class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;// no.of.columns
        int LN=0;
        for(int i=0;i<n;i++){
            int maxColumn=0;
            for(int j=1;j<m;j++){
                if(matrix[i][j] < matrix[i][maxColumn]){
                    maxColumn=j;  //column will be stored
                }
            }
            boolean islucky=true;
            for(int k=0;k<n;k++){
                if(matrix[k][maxColumn]>matrix[i][maxColumn]){ //uses the column
                    islucky=false;
                    break;
                }
            }
            if(islucky) {
                result.add(matrix[i][maxColumn]);

            }    
        }
        return result;
    }
}