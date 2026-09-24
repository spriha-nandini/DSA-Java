# 📗 Strings

> ⏱ 2 min revision

---

## ✨ Declaration

```java
String s = "Hello";
```

## ✨ Input

```java
String s = sc.nextLine();
```

---

## ✨ Conversion

### String → Char

```java
char ch = s.charAt(i);
```

### String → Array (space)

```java
String[] arr = s.split(" ");
```

### String → Array (comma)

```java
String[] arr = s.split(",");
```

### String → Integer

```java
int n = Integer.parseInt(s);
```

### Integer → String

```java
String str = String.valueOf(n);
```

---

## ✨ Functions

| Task | Syntax |
|------|--------|
| Length | `s.length()` |
| Character | `s.charAt(i)` |
| Substring | `s.substring(a,b)` |
| Equals | `s.equals(str)` |
| Contains | `s.contains("ab")` |
| Uppercase | `s.toUpperCase()` |
| Lowercase | `s.toLowerCase()` |
| Trim | `s.trim()` |

---

## 🎯 Used In

- Valid Parentheses
- Sparse Arrays
- Ransom Note
- String Split Questions
