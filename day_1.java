//MIN MAX IN ARRAY

public class day1 {
    public static void main(String[] args) {
        int[] a = {5, 9, 95, 10, 2, 17};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < 6; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            else if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}



//REMOVE DUPLICATE PRINT UNIQUE

public class remove_dupli_print_unique {
    int l=numbers.length;
    temp=[];
    for(int i=0;i<=l;i++){
        for(int j=0;j<=1;j++){
            if(numbers[i]!=numbers[j]){
                temp.add(numbers[i]);
            }
        }
    }
    return temp.toArray(new int[0]);
    
}


//REVERSE A STRING

class reverse_a_string {
    public int reverse(int x) {
        long rev = 0;
        
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10; 
        }
        
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) rev;
    }
    }
}        

//TWO SUM I

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0]; 
    }
}

// TWO SUM II

public class two_sum_II {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                return new int[]{left + 1, right + 1}; 
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[0]; 
    }
}
