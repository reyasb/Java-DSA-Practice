# 3541. Find Most Frequent Vowel and Consonant

## Problem

Given a string `s` consisting of lowercase English letters, find:

- The **maximum frequency of any vowel** (`a`, `e`, `i`, `o`, `u`).
- The **maximum frequency of any consonant**.

Return the sum of these two maximum frequencies.

---

## Example

**Input:**

```text
s = "successes"
```

**Output:**

```text
6
```

**Explanation:**

- The most frequent vowel is `'e'`, appearing `2` times.
- The most frequent consonant is `'s'`, appearing `4` times.
- Therefore:

```text
2 + 4 = 6
```

---

## Java Solution

```java
class Solution {
    public int maxFreqSum(String s) {
        int maxV = 0;
        int maxC = 0;

        for (int i = 0; i < s.length(); i++) {
            int cc = 0;
            int vc = 0;

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == s.charAt(i)) {
                        vc++;
                    }
                }

                if (vc > maxV) {
                    maxV = vc;
                }

            } else {

                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == s.charAt(i)) {
                        cc++;
                    }
                }

                if (cc > maxC) {
                    maxC = cc;
                }
            }
        }

        return maxV + maxC;
    }
}
```

---


## Concepts Used

- Strings
- Character Traversal
- Nested Loops
- Frequency Counting
- Conditional Statements
- Vowels and Consonants
- Finding Maximum
