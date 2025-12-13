import java.util.Scanner;
public class NQueens_count_ways {
    public static boolean isSafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){   //Up direction
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){   //Diagonally left up
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){   //Diagonally right up
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char board[][]){
        System.out.println("--------BOARD--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void nQueens(char board[][], int row){
        if(row==board.length){
            // printBoard(board);
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){   //Column loop
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1);   //Function call
                board[row][j]='X';     //Backtracking
                }
        }
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQueens(board,0);
        System.out.println(count+" way/ways possible\n");
    }
}

