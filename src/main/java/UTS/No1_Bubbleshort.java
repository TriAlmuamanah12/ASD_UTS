package UTS;
public class No1_Bubbleshort {
    public static void main(String[] args) {
        System.out.println("Bubble Short");
        System.out.println("Tri Almu'amanah");
        System.out.println("Data Sebelum diurutkan");
        int[] data = {3,10,4,2,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        int A=1;
        while (A<data.length){
            int j = data.length-1;
            while (j>=1){
                if (data[j-1]>data[j]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
                j = j-1;
            }
            A = A+1;
        }
        System.out.println();
        System.out.println("Data setelah diurutkan");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
