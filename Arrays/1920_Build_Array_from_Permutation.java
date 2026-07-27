# 1920. Build Array from Permutation

## Problem

Given a **zero-based permutation** `nums` of length `n`, build an array `ans` of the same length such that:

```text
ans[i] = nums[nums[i]]
```

Return the constructed array.

---

## Example

**Input:**

```text
nums = [0,2,1,5,3,4]
```

**Output:**

```text
[0,1,2,4,5,3]
```

**Explanation:**

```text
ans[0] = nums[nums[0]] = nums[0] = 0
ans[1] = nums[nums[1]] = nums[2] = 1
ans[2] = nums[nums[2]] = nums[1] = 2
ans[3] = nums[nums[3]] = nums[5] = 4
ans[4] = nums[nums[4]] = nums[3] = 5
ans[5] = nums[nums[5]] = nums[4] = 3
```

Therefore,

```text
ans = [0,1,2,4,5,3]
```

## Java Solution

```java
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
```

## Concepts Used

- Arrays
- Permutations
- Indexing
- Array Traversal
- Simulation
