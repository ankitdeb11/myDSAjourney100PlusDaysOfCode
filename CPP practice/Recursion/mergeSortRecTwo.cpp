#include<iostream>
#include<bits/stdc++.h>

using namespace std;

void merge(int *arr, int s, int e){

    int mid=(s+e)/2;
    int len1=mid-s+1;
    int len2=e-mid;
    int *first = new int[len1];
    int *second = new int[len2];

    //copy values
    int k=s; //here k is the starting index of the main array
    for(int i=0; i<len1; i++){
        first[i]=arr[k++];
    }

    k=mid+1;
    for(int i=0; i<len2; i++){
        second[i]=arr[k++];
    }


    //now merging the 2 sorted arrays
    int index1=0;
    int index2=0;
    k=s;

    while(index1<len1 && index2<len2){
        if(first[index1] <second[index2]){
            arr[k++]=first[index1++];
        }else{
            arr[k++]=second[index2++];
        }
    }

}

void mergeSort(int *arr, int s, int e){
    //base case for recursion
    if(s>=e) return ;

    int mid=(s+e)/2;

    //sorting the left part
    mergeSort(arr, s, mid);

    //sorting the right part
    mergeSort(arr, mid+1, e);

    //merge the 2 sorted arrays
    merge(arr, s, e);
}

int main(){
    int arr[5]={34, 56, 78, 24, 98};
    int n=5;

    mergeSort(arr, 0, n-1);

    for(int i=0; i<n; i++){
        cout<<arr[i]<<endl;
    }


    return 0;
}