# 2185. Counting Words With a Given Prefix

## Problem

Given an array of strings `words` and a string `pref`, return the number of strings in `words` that start with the prefix `pref`.

A prefix is a substring that appears at the beginning of a string.

---

## Example

**Input:**

```text
words = ["pay","attention","practice","attend"]
pref = "at"
```

**Output:**

```text
2
```

**Explanation:**

- `"attention"` starts with `"at"`.
- `"attend"` starts with `"at"`.

Therefore, the answer is `2`.

---

## Java Solution

```java
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count++;
            }
        }

        return count;
    }
}
```

---


## Concepts Used

- Strings
- Arrays
- String Traversal
- `startsWith()` Method
- Prefix Matching
- Counting
