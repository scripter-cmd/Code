import java.util.Arrays;

public class code3467 {

    public static void main(String[] args) {
        
        int nums[]= {4,3,2,1};
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]%2==0?0:1;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}