class Solution {
    public int trap(int[] a) {
          int leftMax=a[0];
        int rightMax=a[a.length-1];
        int count=0;
        int l=0,r=a.length-1;
        
        while(l<r){
                
            if(a[l]<a[r]){
                    
                if(a[l]<leftMax){
                 count=count+leftMax-a[l];
                }
                else{
                    leftMax=Math.max(leftMax, a[l]);
                }
                l++;
            }
            
            else{
                if(a[r]<rightMax){
                 count=count+rightMax-a[r];
                }
                else{
                    rightMax=Math.max(rightMax, a[r]);
                }
                r--;
            }
            
        }

        return count;
    }
}
