package DataStructures;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {15, 2, 16, 14, 3, 13, 4, 12, 5, 11, 6, 10, 7, 9, 8, 1,13,14,14};
        int size = nums.length;
        int low =0;
        int high =size-1;
        int temp =0;
     quickSort(nums, 0, high);
     for(int n : nums){
         System.out.print(n+ ", ");
     }

    }
    private static  void quickSort(int [] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);

        }
    }
    public static int partition(int [] nums, int low, int high){
        int pivot = nums[high];
        int i = low -1;
//        int temp = 0;
        for(int j=low; j<high; j++){
            if((nums[j] < pivot)){
                i++;
               int temp= nums[i];
                nums[i]= nums[j];
                nums[j]= temp;

            }

        }
        int temp = nums[high];
        nums[high]= nums[i+1];
        nums[i+1] = temp;

    return i+1;

    }


}