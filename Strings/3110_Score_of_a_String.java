# 3110. Score of a String

## Problem

Given a string `s`, calculate its score.

The score is the sum of the **absolute differences between the ASCII values of consecutive characters**.

For every pair of adjacent characters:

```text
|ASCII(s[i]) - ASCII(s[i+1])|
```

Add all these differences to get the final score.

---

## Example

**Input:**

```text
s = "hello"
```

**ASCII values:**

```text
h = 104
e = 101
l = 108
l = 108
o = 111
```

Calculate:

```text
|104 - 101| = 3
|101 - 108| = 7
|108 - 108| = 0
|108 - 111| = 3
```

Total:

```text
3 + 7 + 0 + 3 = 13
```

**Output:**

```text
13
```

---

## Java Solution

```java
class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int val = (int) s.charAt(i);
            arr[i] = val;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            score = score + Math.abs(arr[i] - arr[i + 1]);
        }

        return score;
    }
}
```

---


## Concepts Used

- Strings
- Character to ASCII Conversion
- Arrays
- Array Traversal
- `Math.abs()`
- Arithmetic Operations
