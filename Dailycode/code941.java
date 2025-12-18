public class code941 {
    public static void main(String[] args) {
        // int ar[]={0,2,3,4,5,2,1,0};
        int ar[]={0,3,2,1};
        boolean ans=true;
        System.out.println(ar.length/2);
        int max=ar[0];
        int max2=ar[ar.length-1];
        System.out.println(max2);
        // System.out.println();
        // for(int i=1;i<ar.length/2;i++)
        // {
        //     if((max!=ar[i]&&max<ar[i])||(max2!=ar[ar.length-i]&&max2>ar[ar.length-i]))
        //     {
        //         ans=true;
        //         max=ar[i];
        //         max2=ar[ar.length-i];
        //     }
        //     else
        //     {
        //         ans=false;
        //         break;
        //     }   
        // }

        for(int i=1;i<ar.length/2;i++)  
        {
            if(max<ar[i])
            {
                max=ar[i];
            }
            else{
                ans=false;
                break;
            }
        }
        max=ar[ar.length-1];
            for(int i=ar.length-2;i>=ar.length/2;i--)
            {
            if(max<ar[i])
            {
                max=ar[i];
            }
            else{
                ans=false;
                break;
            }
        }



        System.out.println(ans);
    }
}
