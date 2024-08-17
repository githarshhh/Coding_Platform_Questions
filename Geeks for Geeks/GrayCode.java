import java.util.ArrayList;

public class GrayCode {

        public ArrayList<String> graycode(int n){
        if(n == 1){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }

        ArrayList<String> rres = graycode(n-1);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<rres.size(); i++){
            String str = rres.get(i);
            ans.add("0" + str);
        }

        for(int i=rres.size()-1; i>=0; i--){
            String str = rres.get(i);
            ans.add("1" + str);
        }

        return ans;

        }
}
