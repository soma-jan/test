package com.example.CourseApplication;

public class AbsoluteDiffrence {

    public static int differenceOfSum(int[] nums)
    {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
            int rev = 0;
            while (nums[i] > 0)
            {
                rev =  rev + nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
            sum2 = sum2 + rev;
        }
        System.out.println(sum);
        System.out.println(sum2);
        return sum;
    }


    public static void main(String[] args) {
        int[] arr ={1,15,6,3};
        AbsoluteDiffrence.differenceOfSum(arr);

    }

}
