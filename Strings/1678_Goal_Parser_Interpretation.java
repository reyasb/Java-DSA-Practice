# 1678. Goal Parser Interpretation

## Problem

You own a Goal Parser that interprets a string `command` using the following rules:

- `"G"` → `"G"`
- `"()"` → `"o"`
- `"(al)"` → `"al"`

Return the interpreted string after replacing all patterns according to these rules.

---

## Example

**Input:**

```text
command = "G()(al)"
```

**Output:**

```text
"Goal"
```

**Explanation:**

```text
"G"    → "G"
"()"   → "o"
"(al)" → "al"

Result = "Goal"
```

## Java Solution

```java
class Solution {
    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
```

## Concepts Used

- Strings
- String Manipulation
- `replace()` Method
- Immutable Strings
- Pattern Replacement
