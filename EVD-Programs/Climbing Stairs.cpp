/*
Name : Subham Das
Username : subhamtheone
About : 4th year undergrad student at SOA ITER
*/
#include <bits/stdc++.h>

using namespace std;


int main() {

  int n=3;
  vector<int> dp(n+1,-1);
  
  dp[0]= 1;
  dp[1]= 1;
  
  for(int i=2; i<=n; i++){
      dp[i] = dp[i-1]+ dp[i-2];
  }
  cout<<dp[n];
  return 0;
}

Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Secu