package heapsort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int A[]={9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0};
        heapSort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        System.out.println("A = "+Arrays.toString(A));
    }  
    public static void maxHeapify(int A[], int i,int heapsize){
        int L,R,maior;        
        L=2*i;
        R=(2*i)+1;
        if((L<=heapsize)&& A[L]>A[i])
        {
            maior=L;}
            else {
                maior = i;
            }
        if(R<=heapsize && A[R]>A[maior])
        {
            maior=R;
        }
        if(maior!=i)
        {
            int aux;
            aux=A[i];
            A[i]=A[maior];
            A[maior]=aux;
            maxHeapify(A,maior,heapsize);
        }
    }
    public static void buildMaxHeap(int A[],int heapsize){
        for (int i = A.length-1; i>=0;i--)
        {
            maxHeapify(A,i,heapsize);
        }   
    }
    public static void heapSort(int A[]){
        int heapsize;
        heapsize=A.length-1;
        buildMaxHeap(A,heapsize);
        
        for (int i = A.length-1;i>=1;i--){
           int aux= A[0];
            A[0]=A[i];
            A[i]=aux;
            heapsize=heapsize-1;
            maxHeapify(A,0,heapsize);
        }     
    }
}
