class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
    
    for(int i:nums){
        map.merge(i, 1, Integer::sum);
    }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        
        for(int i:map.keySet()){
            pq.offer(i);
            if(pq.size()>k) pq.poll();
        }
        System.err.println("");
    
        int []res=new int[k];
        for(int i=k-1;i>=0;i--){
            
            res[i]=pq.poll();
        
        }
        return res;
        
        //Arrays.stream(res).forEach(arg->System.err.println(arg));
        
    }
}
