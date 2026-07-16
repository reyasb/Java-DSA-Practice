# 2574. Left and Right Sum Differences

## Problem

Given a 0-indexed integer array `nums`, find a 0-indexed integer array `answer` where:

* `leftSum[i]` is the sum of elements to the left of index `i` in the array `nums`. If there is no such element, `leftSum[i] = 0`.
* `rightSum[i]` is the sum of elements to the right of index `i` in the array `nums`. If there is no such element, `rightSum[i] = 0`.

Then,

```text
answer[i] = |leftSum[i] - rightSum[i]|
```

Return the array `answer`.

## Example

**Input:**

```text
nums = [10,4,8,3]
```

**Output:**

```text
[15,1,11,22]
```

**Explanation:**

```text
leftSum  = [0,10,14,22]
rightSum = [15,11,3,0]

answer[0] = |0 - 15|  = 15
answer[1] = |10 - 11| = 1
answer[2] = |14 - 3|  = 11
answer[3] = |22 - 0|  = 22
```

## Approach

* Create three arrays:

  * `leftsum` to store the sum of elements to the left of each index.
  * `rightsum` to store the sum of elements to the right of each index.
  * `op` to store the final answer.
* Traverse from left to right to calculate `leftsum`.
* Traverse from right to left to calculate `rightsum`.
* Calculate the absolute difference between `leftsum[i]` and `rightsum[i]` for each index.
* Return the resulting array.

## Java Solution

```java
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] rightsum = new int[nums.length];
        int[] leftsum = new int[nums.length];
        int[] op = new int[nums.length];

        if (nums.length == 1) {
            op[0] = 0;
            return op;
        }

        // Calculate left sums
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftsum[i] = 0;
            } else {
                leftsum[i] = leftsum[i - 1] + nums[i - 1];
            }
        }

        // Calculate right sums
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                rightsum[i] = 0;
            } else {
                rightsum[i] = rightsum[i + 1] + nums[i + 1];
            }
        }

        // Calculate absolute differences
        for (int i = 0; i < nums.length; i++) {
            op[i] = Math.abs(leftsum[i] - rightsum[i]);
        }

        return op;
    }
}
```

## Concepts Used

* Arrays
* Prefix Sum
* Suffix Sum
* Array Traversal
* Loops
* `Math.abs()` Function
