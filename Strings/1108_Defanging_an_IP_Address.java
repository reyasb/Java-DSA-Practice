# 1108. Defanging an IP Address

## Problem

Given a valid IPv4 address, return a **defanged** version of that IP address.

A defanged IP address replaces every `"."` with `"[.]"`.

## Example

*Input:*

```text
address = "1.1.1.1"
```

*Output:*

```text
"1[.]1[.]1[.]1"
```

*Explanation:*

```text
Every "." in the IP address is replaced with "[.]".
```

---

## Approach

* Use the `replace()` method to replace every `"."` with `"[.]"`.
* Store the updated string back into the `address` variable.
* Return the modified IP address.

---

## Java Solution

```java
class Solution {
    public String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }
}
```

## Concepts Used

* Strings
* String Manipulation
* `replace()` Method
* Immutable Strings
```
