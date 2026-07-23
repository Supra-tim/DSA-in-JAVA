class Solution {
    public void rotate(int[] a, int num) {
        int n=a.length;
    if(num==0){
        for(int i=0; i<a.length; i++){
System.out.print( a[i]+" ");
}
    }
num=num%n;
int temp[]=new int[num];//num is the no of element want to rotate
for(int i=0; i<num; i++){
    temp[i]=a[n-num+i];
}
//shifting element
for(int i=n-1; i>=num; i--){
    a[i] = a[i - num];
}
//placing temp
for(int i=0; i<num; i++){
    a[i]=temp[i];
}
//display
System.out.print("the rotating array is:");
for(int i=0; i<a.length; i++){
System.out.print( a[i]+" ");
}

    }
}