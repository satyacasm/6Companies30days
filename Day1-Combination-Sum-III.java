
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        int c=1;
        f(k,n,ans,li,c);
        return ans;
    }
    void f(int k,int n,List<List<Integer>> ans,List<Integer> li,int c){
        if(c>=10){
            // System.out.println(n+" "+k+" "+c);
            if(n==0 && k==0){
                ans.add(new ArrayList<>(li));
            }
            return;
        }
        if(n<0 || k<0)
        return;
        else if(n==0){
            if(k==0)
            {
                // System.out.println(n+" "+k+" "+c);
                ans.add(new ArrayList<>(li));
                return;
            }
            else
            return;
        }
        else if(k<=0)
        return;
        f(k,n,ans,li,c+1);   
        li.add(c);
        f(k-1,n-c,ans,li,c+1);
        li.remove(li.size()-1);
    }   
}
