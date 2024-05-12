import java.util.*;
public class MatrixMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows of matrix 1:");
        int m = sc.nextInt();
        System.out.println("Enter no of columns of matrix 1:");
        int n = sc.nextInt();
        System.out.println("Enter no of rows of matrix 2:");
        int p = sc.nextInt();
        System.out.println("Enter no of columns of matrix 2:");
        int q = sc.nextInt();

        if(n!=p){
            System.out.println("Multiplication not possible!");
        }
        else{
            int A[][] = new int[m][n];
            int B[][] = new int[p][q];
            int C[][] = new int[m][q];

            System.out.println("Enter elements of matrix A: ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of matrix B: ");
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    B[i][j] = sc.nextInt();
                }
            }
            
                for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                    C[i][j] = 0;
                    for(int k=0;k<n;k++){
                        C[i][j] = C[i][j] + A[i][k]*B[k][j];
                    }
                }
            }
            System.out.println("Matric afetr multiplication is:");
            for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                    System.out.print2(C[i][j]+ " ");

            }
            System.out.println("");
        }
    }
}
}

