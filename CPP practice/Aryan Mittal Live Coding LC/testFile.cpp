#include<iostream>
#include<vector>
#include<bits/stdc++.h>



bool compare(pair<int,int> a,pair<int,int> b)
{
    if(a.second!=b.second)
      return a.second>b.second;
    else
      return a.first>b.first;
}
vector<int> TopK(vector<int>& arr, int k) 
{
    unordered_map<int ,int> m;
    
    for(int i=0;i<arr.size();i++)
    {
        if(m.find(arr[i])!=m.end())
           m[arr[i]]++;
        else
           m[arr[i]]=1;
    }
    vector<pair<int, int> > v;
    auto it = m.begin();
 
    for (it; it != m.end(); ++it)
        v.push_back(make_pair(it->first, it->second));
    sort(v.begin(),v.end(),compare);
    
    vector<int> ans;
    
    for(int i=0;i<k;i++)
      ans.push_back(v[i].first);
      
    return ans;  
      
}