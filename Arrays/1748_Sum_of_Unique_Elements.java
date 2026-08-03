# 1748. Sum of Unique Elements

## Problem

Given an integer array `nums`, return the **sum of all unique elements** in the array.

An element is considered **unique** if it appears **exactly once**.

---

## Example

**Input:**

```text
nums = [1,2,3,2]
```

**Output:**

```text
4
```

**Explanation:**

* `1` appears once.
* `2` appears twice.
* `3` appears once.
* Sum of unique elements = `1 + 3 = 4`.

---


## Java Solution

```java
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
```

---

## Concepts Used

* Arrays
* Nested Loops
* Frequency Counting
* Conditional Statements
* Brute Force Approach
