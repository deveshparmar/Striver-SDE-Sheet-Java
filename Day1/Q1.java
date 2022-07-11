package Day1;

import java.util.Arrays;

public class Q1 {
    public void setZeros(int[][]matrix){
       boolean first_row=false,first_col=false;

       for(int i=0;i< matrix.length;i++){
           if(matrix[i][0]==0){
               first_col=true;
               break;
           }
       }
       for(int i=0;i< matrix[0].length;i++){
           if(matrix[0][i]==0){
               first_row=true;
               break;
           }
       }

       for(int i=1;i< matrix.length;i++){
           for(int j=1;j< matrix[0].length;j++){
               if(matrix[i][j] == 0){
                  matrix[i][0]=0;
                  matrix[0][j]=0;
               }
           }
       }

       for(int i=1;i< matrix.length;i++){
           for(int j=1;j<matrix[0].length;j++){
               if(matrix[i][0]==0 || matrix[0][j]==0){
                   matrix[i][j]=0;
               }
           }
       }

       if(first_col){
           for(int i=0;i< matrix.length;i++){
               matrix[i][0]=0;
           }
       }

       if(first_row){
           for(int i=0;i< matrix[0].length;i++){
               matrix[i][0]=0;
           }
       }
    }
}
