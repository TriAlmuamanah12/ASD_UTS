package UTS;
import java.util.Scanner;
public class No1_B {
    public static void main(String[] args) {
        int A[] = {3,10,4,2,8,13};
        System.out.println("Bubble Short");
        System.out.println("Data Sebelum diurutkan");
        hasil(A);
        System.out.println();
        bubbleshort(A);
        System.out.println("Data Setelah diurutkan");        
        hasil(A);
        System.out.println();
        System.out.println("Pencarian Menggunakan Binnary Search");
        pencarianBinary(A);
    }
    public static void bubbleshort(int[] A) {
        int i=1, j;
        int temp;
        int n = A.length;
        while (i < n) {
            j = n-1;
            while (j>=i){
                if (A[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A [j-1];
                    A[j-1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }  
    }
    public static void hasil(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }   
    }
    public static void pencarianBinary(int A []) {
        System.out.println();
        System.out.println("*******Cari Data*******");
        int caridata;
        Scanner pencarian = new Scanner(System.in);
        System.out.println("Masukan Angka : ");
        caridata = pencarian.nextInt();
        int batasbawah = A.length - 1;
        int batasatas = 0;
        boolean ketemu = false;
        int poin = 0;
        while ((batasatas <= batasbawah ) && (ketemu == false)){
        poin = (batasatas + batasbawah)/2;
        System.out.println("indeks pointer : "+poin);  
            if (A [poin]== caridata){
                ketemu = true;
                System.out.println("Data "+caridata+" telah ditemukan pada indeks ke "+poin);
            }
            else {
                if (caridata < A[poin]){
                    System.out.println("cari di kiri");
                    batasbawah = poin-1;   
                }
                else{
                    System.out.println("cari di kanan");
                    batasatas = poin+1;    
                }
            }
        }
        if (ketemu==true){
            System.out.println("data "+caridata+" ditemukan di indeks "+(poin+" di baris "+(poin+1)));
        }
        else{
            System.out.println("data "+caridata+" tidak ada ");
        }
    }
} 
