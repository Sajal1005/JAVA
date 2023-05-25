package LinkedList;

public class SpiralMatrixIV {
    public int[][] spiralMatrix(int n, int m, ListNode head) {
        int[][] arr = new int[n][m];
        int top=0,down=n-1,left=0,right=m-1,dir=0,k=1;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    if(head!=null){
                        arr[top][i]=head.val;
                        head=head.next;
                    }else{
                        arr[top][i]=-1;
                    }
                }
                top++;
            }else if(dir==1){
                for(int i=top;i<=down;i++){
                    if(head!=null){
                        arr[i][right]=head.val;
                        head=head.next;
                    }else{
                        arr[i][right]=-1;
                    }
                }
                right--;
            }else if(dir==2){
                for(int i=right;i>=left;i--){
                    if(head!=null){
                        arr[down][i]=head.val;
                        head=head.next;
                    }else{
                        arr[down][i]=-1;
                    }
                }
                down--;
            }else if(dir==3){
                for(int i=down;i>=top;i--){
                    if(head!=null){
                        arr[i][left]=head.val;
                        head=head.next;
                    }else{
                        arr[i][left]=-1;
                    }
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return arr;
    }
}
