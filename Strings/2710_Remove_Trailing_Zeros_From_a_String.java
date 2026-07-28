# 2710. Remove Trailing Zeros From a String

## Problem

Given a positive integer represented as a string `num`, remove all the **trailing zeros** from the string and return the resulting string.

A trailing zero is a `'0'` that appears at the **end** of the string.

---

## Example

**Input:**

```text
num = "51230100"
```

**Output:**

```text
"512301"
```

**Explanation:**

The last two characters are trailing zeros, so they are removed.

---

## Java Solution

```java
class Solution {
    public String removeTrailingZeros(String num) {
        char[] nums = num.toCharArray();
        int index = nums.length;
        String ans = "";

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == '0') {
                index = i;
            } else {
                break;
            }
        }

        for (int i = 0; i < index; i++) {
            ans = ans + nums[i];
        }

        return ans;
    }
}
```


## Concepts Used

- Strings
- Character Arrays
- Reverse Traversal
- String Concatenation
- Simulation
