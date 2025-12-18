public class code409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        int count=0;
        boolean odd=false;
        int characters[]=new int[122];
        for(int i=0;i<s.length();i++)
        {
            characters[(int)s.charAt(i)]+=1;
        }
        for(int i=0;i<characters.length;i++)
        {
            count+=(characters[i]/2)*2;  
            
            if (characters[i]%2==1) {
                odd=true;   
            }
        }
        if (odd) {
            count++;
        }
        // count=odd?count++:count;
        System.out.println(count);
    }
}
