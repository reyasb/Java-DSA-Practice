# 628. Maximum Product of Three Numbers

## Problem

Given an integer array `nums`, find three numbers whose product is maximum and return the maximum product.

## Example

*Input:*

```text
nums = [-10,-10,5,2]
```

*Output:*

```text
500
```

## Approach

* Sort the array in ascending order.
* Calculate the product of the three largest numbers.
* Calculate the product of the two smallest numbers and the largest number.
* Compare both products using `Math.max()`.
* Return the larger product.

## Java Solution

```java
import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int prd = nums[nums.length - 1] *
                  nums[nums.length - 2] *
                  nums[nums.length - 3];

        int prd1 = nums[nums.length - 1] *
                   nums[0] *
                   nums[1];

        return Math.max(prd, prd1);
    }
}
```

## Concepts Used

* Arrays
* Sorting (`Arrays.sort()`)
* Mathematical Operations
* `Math.max()`
* Greedy Approach
