class Solution {
    public boolean canTransform(String start, String result) {
        int s=0, e=0;
        int n=start.length();
        while(e<start.length() || s<start.length()){
            while(s<n && start.charAt(s)=='X'){
                s++;
            }
            while(e<n && result.charAt(e)=='X'){
                e++;
            }
            if( (s==n)!=(e==n)){
                return false;
            }
            if( s==n && e==n){
                return true;
            }
            if(start.charAt(s)!=result.charAt(e)){
                return false;
            }

            if(start.charAt(s)=='R' && s>e){
                return false;
            }
            if(start.charAt(s)=='L' && s<e){
                return false;
            }

            s++;
            e++;

        }
        return true;
    }
}