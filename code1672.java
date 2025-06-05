public class code1672 {
    public static void main(String[] args) {
        int accounts[][] = {{1,2,3},{3,2,1}};
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {
            int tot=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                tot=tot+accounts[i][j];
            }
            if(tot>max)
            {
                max=tot;
            }
        }
        System.out.println(max);

        
    }
}
