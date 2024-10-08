import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Leetcode_735_AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<asteroids.length; i++){
            if(stk.isEmpty()){
                stk.push(asteroids[i]);
                continue;
            }
            boolean exploded = false;
            while(!stk.isEmpty() && ((stk.peek()>0 && asteroids[i]<0))){
                int first = stk.peek();
                int second = asteroids[i];

                if(Math.abs(first) == Math.abs(second)){
                    exploded = true;
                    stk.pop();
                    break;
                }

                else if(Math.abs(first) < Math.abs(second)){
                    stk.pop();
                }

                else{
                    exploded = true;
                    break;
                }
            }

            if(exploded == false){
                stk.push(asteroids[i]);
            }
        }
                

        while(!stk.isEmpty()){
            arr.add(stk.pop());
        }
        Collections.reverse(arr);

        int[] ans = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        
        return ans;
    }
}
