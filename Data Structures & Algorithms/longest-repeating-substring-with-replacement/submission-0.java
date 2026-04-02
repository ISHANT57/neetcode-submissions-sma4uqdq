class Solution {
    public int characterReplacement(String s, int k) {

        int left=0;
        int ans=0;

        int [] occ=new int [26];
        int max_occ=0;


        for(int i=0;i<s.length();i++){
            max_occ=Math.max(max_occ,++occ[s.charAt(i)-'A']);
            if(i-left+1-max_occ>k){
                left++;
                occ[s.charAt(left)-'A']--;
            }
            ans=Math.max(ans,i-left+1);
        }

        return ans;



        
        
    }
}
