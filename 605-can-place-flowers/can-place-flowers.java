class Solution {
    public boolean canPlaceFlowers(int[] fb, int a) {
        int n = fb.length;
        // int one = -1;
        // for(int i = 0; i<n; i++){
        //     if(fb[i] == 1){
        //         one = i;
        //         break;
        //     }
        // }
        // if(one == -1){
        //     if(n%2 == 0) n = n/2;
        //     else n = n/2 + 1;
        //     if(a - n > 0) return false;
        //     else return true;
        // }
        // for(int j = one-2 ; j>=0; j-=2){
        //     if(fb[j]!=1){
        //         if( j-1 >= 0 ){
        //             if(fb[j-1] !=1 && fb[j+1] != 1
        //         else if
        //     }
        // }
        // for(int k = one +2; k<n; k+=2) if(fb[k] != 1) a--;
        // return (a <= 0) ? true : false;

        for(int i=0; i<n && a>=0 ; i++){
            int prev = i-1 >= 0 ? i-1 : 0;
            int next = i+1 < n ? i+1 : n-1;
            if(fb[i] == 0 && fb[next] != 1 && fb[prev] != 1){
                fb[i] = 1;
                a--;
            }
        }
        return a <= 0 ? true : false;
    }
}