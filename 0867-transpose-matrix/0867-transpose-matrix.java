class Solution {
    public int[][] transpose(int[][] a) {
        int b[][]=new int[a[0].length][a.length];
        for(int m=0;m<a.length;m++){
            for(int n=0;n<a[m].length;n++){
                b[n][m]=a[m][n];
            }
        }
      return b;  
    }
}