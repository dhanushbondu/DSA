import java.util.LinkedHashMap;
import java.util.Map;

public class CustomSort {
    public static void main(String args[]){
        String o = "cab";
        String s = "abcd";
        String res2 = "";
        LinkedHashMap<Character,Integer> l = new LinkedHashMap<>();
        for(int i=0;i<o.length();i++){
            char ch = o.charAt(i);
            if(l.containsKey(ch)){
                l.put(ch, l.get(ch)+1);
            }
            else{
                l.put(ch, 1);
            }
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(l.containsKey(ch)){
                l.put(ch, l.get(ch)+1);
            }
            else{
                res2+=ch;
                l.put(ch, 1);
            }
        }
        String res = "";

        for(Map.Entry<Character, Integer> map: l.entrySet()){
            int n = map.getValue();
            char ch = map.getKey();
            while(n>1){
                res+=ch;
                n--;
            }
        }
        res+=res2;
        System.out.println(res);


    }
}
