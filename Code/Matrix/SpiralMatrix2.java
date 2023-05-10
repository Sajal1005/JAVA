package Matrix;
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top=0,left=0,right=n-1,down=n-1,dir=0,k=1;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    arr[top][i]=k++;
                }
                top++;
            }else if(dir==1){
                for(int i=top;i<=down;i++){
                    arr[i][right]=k++;
                }
                right--;
            }else if(dir==2){
                for(int i=right;i>=left;i--){
                    arr[down][i]=k++;
                }
                down--;
            }else if(dir==3){
                for(int i=down;i>=top;i--){
                    arr[i][left]=k++;
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return arr;
    }
}
