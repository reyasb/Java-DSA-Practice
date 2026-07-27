# 2108. Find First Palindromic String in the Array

## Problem

Given an array of strings `words`, return the **first palindromic string** in the array.

A string is a palindrome if it reads the same forward and backward.

If there is no palindrome, return an empty string `""`.

---

## Example

**Input:**

```text
words = ["abc","car","ada","racecar","cool"]
```

**Output:**

```text
"ada"
```

**Explanation:**

- `"abc"` → Not a palindrome
- `"car"` → Not a palindrome
- `"ada"` → Palindrome ✅

Since `"ada"` is the first palindrome, return `"ada"`.

---

## Approach

- Traverse each string in the array.
- Reverse the current string using `StringBuilder`.
- Compare the reversed string with the original using `.equals()`.
- Return the first string that matches its reversed version.
- If no palindrome is found, return an empty string.

---

## Java Solution

```java
class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {

            StringBuilder sb = new StringBuilder(words[i]);
            String ans = sb.reverse().toString();

            if (ans.equals(words[i])) {
                return ans;
            }
        }

        return "";
    }
}
```

## Concepts Used

- Strings
- StringBuilder
- String Reversal
- String Comparison
- Array Traversal
