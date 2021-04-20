package UTS;
public class no3_matriks {
    public static void main(String[] args){
        int matrix[][] = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        matrix[2][0] = 5;
        matrix[2][1] = 6;
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print(matrix[1][0]);
                System.out.println();
        System.out.println("Tri Almu'amanah");
    }
    
}
