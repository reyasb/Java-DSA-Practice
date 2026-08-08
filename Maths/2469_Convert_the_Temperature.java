# 2469. Convert the Temperature

## Problem

Given a temperature in **Celsius**, convert it into:

1. **Kelvin**
2. **Fahrenheit**

The formulas are:

```text
Kelvin = Celsius + 273.15
Fahrenheit = Celsius × 1.80 + 32.00
```

---

## Example

**Input:**

```text
celsius = 36.50
```

**Output:**

```text
[309.65000, 97.70000]
```

---

## Java Solution

```java
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];

        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.0;

        return ans;
    }
}
```

---

## Concepts Used

- Arrays
- `double` Data Type
- Mathematical Formulas
- Arithmetic Operations
- Array Initialization
