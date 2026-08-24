#include <iostream>
 
using namespace std;
 
void solve() {
int n,m,a;
    cin>>n>>m>>a;
    long long length = (n+a-1)/a;
    long long width =  (m+a-1)/a;
    long  long total = length * width ;
    cout<<total<<endl;
 
}
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    /*
    int t;
    cin >> t;
    while (t--) {
 
    }
    */
    solve();
 
    return 0;
}
