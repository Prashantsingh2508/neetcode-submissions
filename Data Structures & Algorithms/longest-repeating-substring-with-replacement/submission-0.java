class Solution {
    public int characterReplacement(String s, int k) {
        
              int max = 0;
        int count[] = new int[26];
        int i = 0;
        for (int j = 0; j < s.length(); j++) {

            count[s.charAt(j) - 'A']++;
            int maxFreq = 0;
            for (int v : count) {
                maxFreq = Math.max(maxFreq, v);
            }
            while (maxFreq + k <= j - i) {

                count[s.charAt(i) - 'A']--;

                for (int v : count) {
                    maxFreq = Math.max(maxFreq, v);
                }
                i++;
            }
            
            max=Math.max(max, j-i+1);
            
        }

        return max;


    }
}
