public class MajorityElement {
    
    // Majority Element find karne ka main function
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Boyer-Moore Majority Vote Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        MajorityElement solver = new MajorityElement();
        
        // Example 1 Test
        int[] nums1 = {3, 2, 3};
        System.out.println("Input: [3, 2, 3] -> Output: " + solver.majorityElement(nums1));
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Input: [2, 2, 1, 1, 1, 2, 2] -> Output: " + solver.majorityElement(nums2));
    }
}