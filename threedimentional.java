package com;

public class threedimentional {
    public static void main(String[] args){
        int branches=2;
        int batches=2;
        int studentsperbatch=5;
        int arr[][][]=new int[branches][batches][studentsperbatch];
        for(int i=0;i<branches;i++)
        {
            for(int j=0;j<batches;j++)
            {
                for(int k=0;k<studentsperbatch;k++)
                {
                    System.out.println( "branch"+ (i+1)+ "batch" +(j+1)+ "student" +(k+1));
                    arr[i][j][k]=(i+1)*(j+1)*(k+1);  
                }
            }
        }

    }


    
}
