class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sum-nums[i];
        }
        int max=0;
        for(int i=0;i<n;i++){
            max+=(i*nums[i]);
        }
    int temp=max;
        for(int i=n-1;i>=1;i--){
            temp-=(n-1)*nums[i];
            temp+=a[i];
            if(temp>max)
            max=temp;
        }
        return max;
    }
}
