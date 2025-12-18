import java.util.HashMap;

public class code3541 {
    public static void main(String[] args) {
        String s = "successes";
        HashMap<String,Integer> vowels=new HashMap<>();
        HashMap<String,Integer> consonats=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if("aeiou".contains(""+s.charAt(i))){
                if(!vowels.containsKey(""+s.charAt(i)))
                {
                    vowels.put(""+s.charAt(i),1);
                }
                else
                {
                    vowels.put(""+s.charAt(i),vowels.get(""+s.charAt(i))+1);
                }
            }
            else
            {
                if(!consonats.containsKey(""+s.charAt(i)))
                {
                    consonats.put(""+s.charAt(i),1);
                }
                else
                {
                    consonats.put(""+s.charAt(i),consonats.get(""+s.charAt(i))+1);
                }
            }
        }

        int max1 = 0;
        int max2 = 0;

for (int v : vowels.values()) {
    max1 = Math.max(max1, v);
}

for (int c : consonats.values()) {
    max2 = Math.max(max2, c);
}

        System.out.println(vowels);
        System.out.println(consonats);
        System.out.println(max1);
        System.out.println(max2);


    }
}
