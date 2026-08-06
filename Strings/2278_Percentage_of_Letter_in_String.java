# 2278. Percentage of Letter in String

## Problem

Given a string `s` and a character `letter`, return the **percentage** of characters in `s` that are equal to `letter`, rounded down to the nearest whole number.

The percentage is calculated as:

```text
(number of occurrences of letter × 100) / length of s
```

---

## Example

**Input:**

```text
s = "foobar"
letter = 'o'
```

**Output:**

```text
33
```

**Explanation:**

* The letter `'o'` appears **2** times.
* The length of the string is **6**.
* Percentage = `(2 × 100) / 6 = 33` (rounded down).

---


## Java Solution

```java
class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }

        int ans = (count * 100) / s.length();
        return ans;
    }
}
```

---

## Concepts Used

* Strings
* Character Traversal
* Counting Frequency
* Integer Arithmetic
* Conditional Statements
