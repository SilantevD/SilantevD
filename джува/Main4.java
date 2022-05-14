public class Main {
    private   static  void printMatrix(int[][]matrix){
        for (int i=0;i<matrix[0].length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        int matrix[][]=new int [n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=(int) (Math.random()*100);
            }
        }
        System.out.println("Матрица: ");
        printMatrix(matrix);
        System.out.println();
        int min=matrix[0][0];
        int max=matrix[0][0];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j){
                    if (matrix[i][j]>max) max=matrix[i][j];
                    if (matrix[i][j]<min) min=matrix[i][j];
                }
            }
        }
        int sum=max+min;
        System.out.println("Минимальный элемент: "+min);
        System.out.println("Максимальный элемент: "+max);
        System.out.println("Сумма: "+sum);

    }

}