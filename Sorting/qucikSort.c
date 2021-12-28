#include <stdio.h>
#include <stdlib.h>
int Partiton(int *arr,int start,int end){
    int i=start,j=end,PivotIndex=end;
    while(i<j){
        while(arr[i]<=arr[PivotIndex]) i++;
        while(arr[j]>arr[PivotIndex]) j--;
        if(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
    int temp=arr[PivotIndex];
    arr[PivotIndex]=arr[j];
    arr[j]=temp;
    return j;
}
void QuickSort(int *arr,int start,int end){
    if(start>=end) return;
    int PivotIndex=Partiton(arr,start,end);
    QuickSort(arr,start,PivotIndex-1);
    QuickSort(arr,PivotIndex+1,end);
}
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++) scanf("%d",&arr[i]);
    for(int i=0;i<n;i++) printf("%d ",arr[i]);
    QuickSort(arr,0,n-1);
    printf("\n");
    for(int i=0;i<n;i++) printf("%d ",arr[i]);
    return 0;
}
