# 1374. Generate a String With Characters That Have Odd Counts

## Problem

Given an integer `n`, generate a string containing exactly `n` lowercase English letters such that **each character appears an odd number of times**.

Return any valid string.

---

## Example

**Input:**

```text
n = 4
```

**Output:**

```text
"xxxi"
```

---


## Java Solution

```java
class Solution {
    public String generateTheString(int n) {
        String s = "";

        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                s = s + 'x';
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                s = s + 'x';
            }

            s = s + 'i';
        }

        return s;
    }
}
```

---


## Concepts Used

- Strings
- Loops
- Conditional Statements
- Even and Odd Numbers
- String Concatenation
