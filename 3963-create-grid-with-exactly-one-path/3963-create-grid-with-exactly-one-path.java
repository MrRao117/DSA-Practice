class Solution {
    public String[] createGrid(int m, int n) {
        
        // brute force

        // String[] ans = new String[m];
        // for(int i=0; i<m; i++){
        //     String s = "";
        //     for(int j=0; j<n; j++){
        //         if(i==0){
        //             s+=".";
        //         }

        //         else if(j==n-1){
        //             s+=".";
        //         }

        //         else{
        //             s+="#";
        //         }
        //     }
        //     ans[i] = s;
        // }
        // return ans;

        // optimised
        String[] ans = new String[m];

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append(".");
        }

        ans[0] = sb.toString();

        StringBuilder sb1 = new StringBuilder();
        for(int i=1; i<n; i++){
            sb1.append("#");
        }
        sb1.append(".");

        for(int i=1; i<m; i++){
            ans[i] = sb1.toString();
        }

        return ans;
    }
}