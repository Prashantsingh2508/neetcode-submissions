class Solution {
    public int findKthLargest(int[] a, int k) {
        
           PriorityQueue<Integer> pq=new PriorityQueue<>();
         
         for(int l:a){
             
                pq.offer(l);
                
                
             if(pq.size()>k){
                 
                 pq.poll();
             }
          
         }
         
         return pq.peek();


    }
}
