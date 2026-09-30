class Solution {
    public boolean isValid(String s) {
    
    Deque<Character> dq=new ArrayDeque<>();

    for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);

        if(c=='{' || c=='('  || c=='['){

            dq.push(c);
        }

        else{

                if(dq.isEmpty())
                {
                    return false;
                }


                char top=dq.pop();

                if(c=='}' && top !='{') return false;
                 if(c==']' && top !='[') return false;
                  if(c==')' && top !='(') return false;


        }

    }

        return dq.isEmpty();
    }
}
