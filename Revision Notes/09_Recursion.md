
# 🌲 Recursion

> ⏱ 3 min revision

---

## ✨ Template

```java
public int func(int n){

    // Base Case
    if(n == 0)
        return 0;

    // Recursive Call
    return func(n-1);
}
```

---

## ✨ Structure

1. Base Case
2. Recursive Call
3. Return Answer

---

## ✨ Factorial

```java
public int fact(int n){
    if(n == 0 || n == 1)
        return 1;

    return n * fact(n-1);
}
```

---

## ✨ Sum of N Numbers

```java
public int sum(int n){
    if(n == 0)
        return 0;

    return n + sum(n-1);
}
```

---

## ✨ Reverse String

```java
void reverse(String s, int i){

    if(i < 0)
        return;

    System.out.print(s.charAt(i));

    reverse(s, i-1);
}
```

---

## ⭐ Remember

- Base case stops recursion
- Every call must move toward the base case
- Missing base case → StackOverflowError

---

## 🎯 Used In

- Factorial
- Fibonacci
- Reverse String
- Tree DFS
- Backtracking
