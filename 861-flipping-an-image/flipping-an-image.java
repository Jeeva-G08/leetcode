class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int result[][]=new int[n][n];
        for(int i=0;i<image.length;i++)
        {
            int k=0;
            for(int j=image[i].length-1;j>=0;j--)
            {
                result[i][k]=image[i][j];
                k++;
            }
        }
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                if(result[i][j]==1)
                {
                    result[i][j]=0;
                }
                else
                {
                    result[i][j]=1;
                }
            }
        }
        return result;
        
    }
}