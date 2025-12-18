public class LamdaExp {
    public static void main(String[] args) {

        age((a)-> {
            if(a<18) return 1;
            return 0;
        },19);
            
        
    }
    public static void age(Lambo ag,int a)
    {
        
        System.out.println(ag.age(a)==1?"Under 18":"Above 18");
        
    }
    
}
interface Lambo {
    int age(int a);
}

