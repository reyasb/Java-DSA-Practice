# 229. Majority Element II

## Problem

Given an integer array `nums` of size `n`, return all elements that appear **more than `n / 3` times**.

There can be **at most two** elements that satisfy this condition.

---

## Example

**Input:**

```text
nums = [3,2,3]
```

**Output:**

```text
[3]
```

---


## Java Solution

```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > nums.length / 3 && !al.contains(nums[i])) {
                al.add(nums[i]);
            }
        }

        return al;
    }
}
```

---


## Concepts Used

- Arrays
- ArrayList
- Nested Loops
- Frequency Counting
- `contains()` Method
- Conditional Statements
