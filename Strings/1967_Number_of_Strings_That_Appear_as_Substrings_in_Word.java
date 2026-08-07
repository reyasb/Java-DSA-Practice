# 1967. Number of Strings That Appear as Substrings in Word

## Problem

Given an array of strings `patterns` and a string `word`, return the number of strings in `patterns` that appear as a **substring** of `word`.

A substring is a contiguous sequence of characters within a string.

---

## Example

**Input:**

```text
patterns = ["a","abc","bc","d"]
word = "abc"
```

**Output:**

```text
3
```

**Explanation:**

- `"a"` is a substring of `"abc"`.
- `"abc"` is a substring of `"abc"`.
- `"bc"` is a substring of `"abc"`.
- `"d"` is not a substring of `"abc"`.

Therefore, the answer is `3`.

---

## Java Solution

```java
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
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
- `contains()` Method
- Counting
```
