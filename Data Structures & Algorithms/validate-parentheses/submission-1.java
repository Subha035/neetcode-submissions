class Solution {
    public boolean isValid(String s) {
        char [] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char x : arr){
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
            } else {
                if(stack.isEmpty()){
                    return false;
                } else{
                    char i = stack.peek();
                    if(x ==')'&& i == '(' || x == '}' && i =='{' || x == ']' && i == '['){
                    stack.pop();
                    } else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
