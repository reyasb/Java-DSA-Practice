# 2000. Reverse Prefix of Word

## Problem

Given a **0-indexed** string `word` and a character `ch`, reverse the segment of `word` from index `0` to the **first occurrence** of `ch` (inclusive).

- If `ch` does not exist in `word`, return the original string.

---

## Example

**Input:**

```text
word = "abcdefd"
ch = 'd'
```

**Output:**

```text
"dcbaefd"
```


---

## Approach

- Find the first occurrence of `ch` using `indexOf()`.
- If the character is not found, return the original string.
- Traverse from the found index back to `0` and append the characters to the answer.
- Append the remaining characters after the prefix.
- Return the final string.

---

## Java Solution

```java
class Solution {
    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);
        String ans = "";

        if (ind == -1) {
            return word;
        }

        for (int i = ind; i >= 0; i--) {
            ans = ans + word.charAt(i);
        }

        for (int i = ind + 1; i < word.length(); i++) {
            ans = ans + word.charAt(i);
        }

        return ans;
    }
}
```


## Concepts Used

- Strings
- `indexOf()`
- `charAt()`
- String Traversal
- String Manipulation
- Simulation
