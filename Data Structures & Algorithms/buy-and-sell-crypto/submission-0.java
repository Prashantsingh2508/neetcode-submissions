class Solution {
    public int maxProfit(int[] a) {
        
             if(a.length==1 || a.length==0 ) return 0;
        
        int buy=a[0];
        int i=1;
        
        int max=-10000;
        
        while(i<a.length){
            
            if(buy>a[i]){
                
                buy=a[i];
               
                
            }
            max=Math.max(max,a[i]-buy);
            i++;
        
        }
        
        return  max;
        


    }
}
