# 961. N-Repeated Element in Size 2N Array

## Problem

You are given an integer array `nums` of size `2n`, where exactly **one element is repeated `n` times** and all the other elements appear only once.

Return the element that is repeated `n` times.

---

## Example

**Input:**

```text
nums = [1,2,3,3]
```

**Output:**

```text
3
```

**Explanation:**

* The array size is `4`, so `n = 2`.
* The element `3` appears `2` times.
* Therefore, the answer is `3`.

---


## Java Solution

```java
class Solution {
    public int repeatedNTimes(int[] nums) {
        int val = nums.length / 2;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == val) {
                ans = nums[i];
                break;
            }
        }

        return ans;
    }
}
```

---


## Concepts Used

* Arrays
* Nested Loops
* Frequency Counting
* Brute Force
* Conditional Statements
