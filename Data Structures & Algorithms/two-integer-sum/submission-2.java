class Solution {
    public int[] twoSum(int[] a, int target) {


      Map<Integer,Integer> map=new HashMap<>();
            
            
            int l=0;
            int r=a.length;
            
            while(l<r){
                
                if(!map.containsKey(target-a[l])){
                    
                    map.put(a[l],l);
                    l++;
                }
                
                else{
                    
                    return new int[]{map.get(target-a[l]),l};
                }
            
            }
            
            
    
            
            return new int[]{};
            

    }
    
    
    }

    //             int l = 0, r = a.length - 1;

    // while (l < r) {
    //     int sum = a[l] + a[r];

    //     if (sum == target) {
    //         return new int[]{l, r};
    //     } else if (sum < target) {
    //         l++;                   
    //     } else {
    //         r--;                 
    //     }
    // }

    // return new int[]{};   

