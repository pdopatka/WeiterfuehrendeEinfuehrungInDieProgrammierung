package Praezenz_4;

public class WrapperTask {

    public static void main(String[] args) {
        char[] values = {'1', 'a', '3', 'z', '9'};
        int[] nums = {10, 0, -4, 20, 5};
        System.out.println(countDigitsPrimitive(values));
        System.out.println(countDigitsWrapper(values));
        System.out.println(maxPrimitive(nums));
        System.out.println((char) maxWithWrapper(nums));
    }

    // Task A: Count digits using only primitives (e.g., ASCII comparison)
    public static int countDigitsPrimitive(char[] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            int calculation = values[i] / 10;
            if(calculation < 1){
                result++;
            }
        }
        return result;
    }

    // Task B: Count digits using Character.isDigit()
    public static int countDigitsWrapper(char[] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if(Character.isDigit(values[i])){
                result++;
            }
        }
        return result;
    }

    // Task C: Find max using only primitives
    public static int maxPrimitive(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(result < nums[i+1]){
                result = nums[i+1];
            }
        }
        return result;
    }

    // Task D: Find max using Integer.compare()
    public static int maxWithWrapper(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(Integer.compare(result, i+1) > 0){
                result = nums[i];
            }
        }
        return result;
    }
}


