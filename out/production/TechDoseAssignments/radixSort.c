#include<stdio.h>
void countSort(int *arr,int n,int power){
    int freq[10]={0},arr1[n];
    for(int i=0;i<n;i++) freq[(arr[i]/power)%10]++;
    for(int i=1;i<10;i++) freq[i]+=freq[i-1];
    for(int i=n-1;i>=0;i--) arr1[--freq[((arr[i]/power)%10)]]=arr[i];
    for(int i=0;i<n;i++) arr[i]=arr1[i];
}
void radixSort(int *arr,int n,int max){
    int power=1;
    while(max>=power){
        countSort(arr,n,power);
        power*=10;
    }
}
int main(){
    int n,max;
    scanf("%d",&n); int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        if(i==0) max=arr[i];
        else if(arr[i]>max) max=arr[i];
    }
    radixSort(arr,n,max);
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}
