import java.util.*;
class Heap{
    private int[]heapArray;
    private int capacity;
    private int curr_heap_size;
    Heap(int n){
        capacity=n;
        heapArray=new int[capacity];
        curr_heap_size=0;
    }
    private void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    // parent and child node generation
    private int parent(int key){
        return (key-1)/2;
    }
    private int left(int key){
        return (2*key)+1;
    }
    private int right(int key){
        return (2*key)+2;
    }

    //heapify
    private void heapify(int key){
        int l=left(key);
        int r=right(key);
        int smallest=key;
        if(l<curr_heap_size && heapArray[l]<heapArray[smallest]){
            smallest=l;
        }
        if(r<curr_heap_size && heapArray[r]<heapArray[smallest]){
            smallest=r;
        }
        if(smallest!=key){
            swap(heapArray, key, smallest);
            heapify(smallest);
        }
    }

    // insert value
    public boolean push(int key){
        if(curr_heap_size==capacity){
            return false;
        }
        else{
            int i=curr_heap_size;
            heapArray[i]=key;
            curr_heap_size++;
            while(i!=0 && heapArray[i]< heapArray[parent(i)]){
                swap(heapArray, i, parent(i));
                i=parent(i);
            }
        }
        return true;
    }

    // //decreasekey:= swap the key value with given value
    // public void decreasekey(int key, int new_val){
    //     heapArray[key]=new_val;
    //     while(key!=0 && heapArray[key]<heapArray[parent(key)]){
    //         swap(heapArray, key, parent(key));
    //         key=parent(key);
    //     }
    // }

    //delete value
    public void pop(int key){
        if(key<0 || key>=curr_heap_size){
            return ;
        }
        heapArray[key]=heapArray[curr_heap_size-1];
        curr_heap_size--;
         if (index > 0 && heapArray[index] < heapArray[parent(index)]) {

        while (index > 0 &&
               heapArray[index] < heapArray[parent(index)]) {

            swap(heapArray, index, parent(index));
            index = parent(index);
        }

    } else {
        // Otherwise heapify downward
        heapify(index);
    }
}
    }
}
public class Min_Heap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        Heap h=new Heap(n);
    }
}