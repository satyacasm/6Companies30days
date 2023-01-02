class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<secret.length();i++){
            char ch=secret.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int bull=0,cow=0;
        for(int i=0;i<guess.length();i++){
            char ch=guess.charAt(i);
            if(i<secret.length() && ch==secret.charAt(i)){
                bull++;
            
            }
            if(map.containsKey(ch)){
                if(map.get(ch)>0)
                {
                    cow++;
                    map.put(ch,map.get(ch)-1);
                }
            }
        }
        cow-=bull;
        String s=bull+"A"+cow+"B";
        return s;

    }
}
