# 2810. Faulty Keyboard

## Problem

A faulty keyboard behaves differently when typing:

- If the typed character is `'i'`, the current text is **reversed**.
- Otherwise, the character is appended to the end of the text.

Return the final string after processing all the characters.

---

## Example

**Input:**

```text
s = "string"
```

**Output:**

```text
"rtsng"
```

## Approach

- Initialize an empty string `ans`.
- Traverse each character in the input string.
- If the character is `'i'`:
  - Create a `StringBuilder` from `ans`.
  - Reverse it using `reverse()`.
  - Convert it back to a string.
- Otherwise, append the character to `ans`.
- Return the final string.

---

## Java Solution

```java
class Solution {
    public String finalString(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'i') {
                StringBuilder sb = new StringBuilder(ans);
                ans = sb.reverse().toString();
            } else {
                ans = ans + s.charAt(i);
            }
        }

        return ans;
    }
}
```

## Concepts Used

- Strings
- StringBuilder
- String Reversal
- Character Traversal
- Simulation
