
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
import java.util.*;


class Two_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = 0;
        System.out.println("Enter size of array: ");
        size = input.nextInt();
        int nums[] = new int[size];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        int target = 0;
        System.out.println("Enter target sum: ");
        target = input.nextInt();

        arrSum obj = new arrSum();

        int ans[]= obj.sol(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

class arrSum {
    public int[] sol(int arr[], int target) 
    {
        int j = 0;
        int indices[] =new int[2];
        for (int i = 0; i < arr.length; i++) 
        {
            for ( j = i + 1; j < arr.length; j++) 
            {
                if ((arr[i] + arr[j]) == target) 
                {
                  
                   indices[0] = i;
                   indices[1] = j;
                  break;
                }
            }

        }
        return indices;
    }
}

