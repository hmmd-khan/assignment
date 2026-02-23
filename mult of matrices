import java.util.Scanner;
class multiplication {
    public static void main(String[]args){
        System.out.println("Enter the order of matrix A:");
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] a=new int [m][n];
        System.out.println("Enter the order of matrix B:");
        int o=sc.nextInt();
        int p=sc.nextInt();
        int[][] b=new int [3][3];
        int[][] mult=new int [m][n];
        System.out.println("Enter values of matrix A:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print("A["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print("B["+i+"]["+j+"]:");
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                mult[i][j]=0;
                for(int k=0;k<a[0].length;k++){
                    mult[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(mult[i][j]+" ");
            }
            System.out.println();
        }
    }
}
