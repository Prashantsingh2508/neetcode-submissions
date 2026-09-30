class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
            int ans[]=new int[a.length-k+1];
    
    // int i=0;
    // while(i<=a.length-k){
        
    //         ans[i]=largerVal(Arrays.copyOfRange(a,i,i+k));
    //         i++;
    
    // }

    Deque<Integer> dq=new ArrayDeque<>();

    for(int i=0;i<a.length;i++){

        if(!dq.isEmpty() && dq.peekFirst()<=i-k) 
            {
                dq.pollFirst();
            }
        while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]){

            dq.pollLast();

        }

        dq.offerLast(i);

        if(i>=k-1){

                ans[i-k+1]=a[dq.peekFirst()];

        }

        
    }
    
    
    
    
    
    
    return ans;
    }
    // private static int largerVal(int a[]){
        
    //     int best = a[0];
    //     for (int n : a)
    //         {best = Math.max(best, n);}
        
    //    // System.err.println(""+best);
    //     return best;
    // }
    
}
