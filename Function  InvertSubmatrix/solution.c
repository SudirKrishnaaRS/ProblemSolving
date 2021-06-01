void invertSubmatrix(int R, int C, int matrix[R][C], int sRow, int sCol, int K)
{
    int row=sRow-1;
    int col=sCol-1;
    K=K-1;
    int f_r=sRow+K;
    int f_c=sCol+K;

    for(int i=row;i<f_r;i++)
    {
        for(int j=col;j<f_c;j++)
        {
            if(matrix[i][j]==0)
            {
                matrix[i][j]=1;
            }
            else if(matrix[i][j]==1)
            {
                matrix[i][j]=0;
            }
        }

    }
    
    

}
