package UTS;
public class No1_insertionshort {
    public static void main(String[] args){
        int[] A = {3, 10, 4, 2, 8, 13};
        System.out.println("Insertion Short");
        System.out.println("Tri Almu'amanah");
        System.out.println("Data Sebelum diurutkan");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] +" ");
        }
        for (int i = 1; i < A.length; i++) {
            int key = A[i]; 
            int j = i-1; 
            while((j>=0)&&(A[j]>key)){
                A[j+1] = A[j];
                j--;
            }
            A[j+1]=key;  
        }
        System.out.println();
        System.out.println("Data setelah diurutkan");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" "); 
        }
    }
}