# 1684. Count the Number of Consistent Strings

## Problem

You are given a string `allowed` containing the characters that are allowed and an array of strings `words`.

A string is called **consistent** if all of its characters appear in `allowed`.

Return the number of consistent strings in `words`.

---

## Example

**Input:**

```text
allowed = "ab"
words = ["ad","bd","aaab","baa","badab"]
```

**Output:**

```text
2
```
  
---

## Java Solution

```java
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            char[] wc = words[i].toCharArray();
            boolean yes = true;

            for (int j = 0; j < wc.length; j++) {
                if (!allowed.contains(String.valueOf(wc[j]))) {
                    yes = false;
                    break;
                }
            }

            if (yes) {
                count++;
            }
        }

        return count;
    }
}
```

---

## Concepts Used

- Arrays
- Strings
- Character Arrays
- `contains()` Method
- Nested Loops
- Boolean Flag
- Counting
