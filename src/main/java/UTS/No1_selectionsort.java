package UTS;
public class No1_selectionsort {
    public static void selectionshort(int[] A){
        int smallindex;
        int pass;
        int j;
        int temp;
        for ( pass = 0; pass < A.length -1; pass++) {
            smallindex = pass;
            for (j = pass + 1; j < A.length; j++) {
                if(A[j]<A[smallindex]){
                    smallindex = j;
                }   
            }
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
        }
    public static void hasil(int[]data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int A[] = {3,10,4,2,8,13};
        System.out.println("Selection Short");
        System.out.println("Tri Almu'amanah");
        System.out.println("Data sebelum diurutkan : ");
        No1.hasil(A);
        No1.selectionshort(A); 
        System.out.println("Data setelah diurutkan : ");
        No3.hasil(A);
    }
}
