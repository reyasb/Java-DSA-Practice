# 905. Sort Array By Parity

## Problem

Given an integer array `nums`, return an array where all the even integers appear before all the odd integers.

You may return any answer array that satisfies this condition.

  
## Approach

* Create a new array to store the result.
* Traverse the input array and add all even numbers to the new array.
* Traverse the input array again and add all odd numbers after the even numbers.
* Return the resulting array.

## Java Solution

```java
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] num2 = new int[nums.length];
        int j = 0;

        // Add even numbers first
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                num2[j] = nums[i];
                j++;
            }
        }

        // Add odd numbers next
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                num2[j] = nums[i];
                j++;
            }
        }

        return num2;
    }
}
```
