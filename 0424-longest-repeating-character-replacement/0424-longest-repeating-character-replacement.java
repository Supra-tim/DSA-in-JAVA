class Solution {
    public int characterReplacement(String s, int k) {
        int l=0, r=0, maxlen=0,maxf=0;
        HashMap<Character, Integer>map=new HashMap<>();
        while(r<s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf, map.get(s.charAt(r)));
        while((r-l+1)-maxf>k){
            char left=s.charAt(l);
            map.put(left, map.get(left)-1);
            // if(map.get(left)==0){
            //     map.remove(left);
            // }
            l++;
        }
        maxlen=Math.max(maxlen, r-l+1);
        r++;
    }
    return maxlen;
    }
}