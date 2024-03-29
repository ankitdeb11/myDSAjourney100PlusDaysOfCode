#include<iostream>
#include<bits/stdc++.h>

//write an efficient algorithm where in the mXn matrix, search function will be there
//important is mid/col and then mic%col


bool searchMatrix(vector<vector<int>>& matrix, int target){ 

    int row = matrix.size();
    int col = matrix[0].size(); //take any size of a row

    int start = 0;
    int end = row*col-1;
    int mid = start + (end-start)/2;

    while(start<=end){

        int element = matrix[mid/col][mid%col];

        if(element==target){
            return 1;

        }if( element> target){
            start = mid+1;
        }else{
            end = mid-1;
        }
        mid = start + (end-start)/2;
        
    }return 0;



}


using namespace std;

int main(){



    return 0;
}