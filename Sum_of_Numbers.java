 class sumOfNum
{
    public static void main(String args[])
    {
        int[] nums = {45,90,67,93,45,34,57};
        int n=nums.length;
        //Sort
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        System.out.print("Sum of the second and third largest numbers is : ");
        System.out.println(nums[n-2]+nums[n-3]);
    }
}
