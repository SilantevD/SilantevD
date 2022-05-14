public class Main {
    private   static  void printMatrix(int[][]matrix){
        for (int i=0;i<matrix[0].length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    private  static  void  printArray(int[]array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int n=10;
        int matrix[][]=new int [n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=(int) (Math.random()*100);
            }
        }
        System.out.println("Матрица: ");
        printMatrix(matrix);
        int []b=new int[n];
        for (int i = 0; i < n; i++) {
            int min=matrix[i][0];
            for (int j=1;j<n;j++) {

                if (matrix[i][j]<min) min=matrix[i][j];
            }
            b[i]=min;
        }
        System.out.println(" ");
        System.out.println("Вектор: ");
        printArray(b);
    }

}