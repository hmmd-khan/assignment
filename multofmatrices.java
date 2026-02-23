import java.util.Scanner;
class multofmatrices {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        //taking order of matrix A from user
        System.out.println("Enter the order of matrix A:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] a=new int [m][n];
        //taking order of matrix B from user
        System.out.println("Enter the order of matrix B:");
        int o=sc.nextInt();
        int p=sc.nextInt();
        int[][] b=new int [3][3];
        int[][] mult=new int [m][n];
        System.out.println("Enter values of matrix A:");
        //taking values of matrix A from user
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print("A["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();
            }
        }
        //taking values of matrix B from user
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print("B["+i+"]["+j+"]:");
                b[i][j]=sc.nextInt();
            }
        }
        //multiplication of rows and columns and saving values in matrix mult
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                mult[i][j]=0;
                for(int k=0;k<a[0].length;k++){
                    mult[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        //printing matrix mult
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(mult[i][j]+" ");
            }
            System.out.println();
        }
    }
}

