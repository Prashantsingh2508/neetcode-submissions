class Solution {
    public boolean checkInclusion(String k, String str) {


                 boolean flag = false;
     int i=0;
     int j=k.length()-1;
     
        
   
     
     while(j<str.length()){
        int a=i;
          Map<Character,Integer> map=new HashMap<>();
     for(char c : k.toCharArray()){
         
         map.merge(c, 1, Integer::sum);
         
     }
     
         int count =0;
          
         while(map.containsKey(str.charAt(i)) && i<=j && map.get(str.charAt(i))>=1){
         
         count++;
            if(count==k.length()){
            
            flag=true;
            break;
            }
                   map.merge(str.charAt(i), -1, Integer::sum);
            
            i++;
      
         }
         
         if(flag==true){
         
           return flag;
         }
         j++;
         i=a;
         i++;
     
     
     }
    return flag;


    }
}
