class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//
             
        Map<List<Integer>, List<String>> map=new HashMap<>();

        int arr[];
  for (String str1 : strs) {
            
            arr=new int[26];
           
             int j=0;
            while(j<str1.length()){
                arr[str1.charAt(j)-'a']++;
                j++;
                
            }
      List<Integer> list1 = Arrays.stream(arr)
                                          .boxed()
                                          .collect(Collectors.toList());

        map.computeIfAbsent(list1, k -> new ArrayList<>()).add(str1);
            
            
       
        }
      
    
             return new ArrayList<>(map.values());


    }
}
