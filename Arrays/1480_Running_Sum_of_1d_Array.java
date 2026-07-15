# 1480. Running Sum of 1d Array

## Problem

Given an array `nums`, we define a running sum of an array as:

`runningSum[i] = sum(nums[0] ... nums[i])`

Return the running sum of `nums`.

## Example

**Input:**

```text
nums = [1,2,3,4]
```

**Output:**

```text
[1,3,6,10]
```

**Explanation:**

```text
runningSum[0] = 1
runningSum[1] = 1 + 2 = 3
runningSum[2] = 1 + 2 + 3 = 6
runningSum[3] = 1 + 2 + 3 + 4 = 10
```

## Approach

* Create a new array `op` to store the running sums.
* Store the first element of `nums` directly in `op[0]`.
* For every other element, add the current element to the previous running sum.
* Return the resulting array.

## Java Solution

```java
class Solution {
    public int[] runningSum(int[] nums) {
        int[] op = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                op[i] = nums[i];
            } else {
                op[i] = op[i - 1] + nums[i];
            }
        }

        return op;
    }
}
```

## Concepts Used

* Arrays
* Prefix Sum
* Array Traversal
* Loops
* Conditional Statements
