# 📘 Arrays

> ⏱ 2 min revision

---

## ✨ Declaration

```java
int[] arr = new int[n];

int[] arr = {1,2,3,4};
```

---

## ✨ Input

```java
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}
```

---

## ✨ Space Separated Input

Input:
1 2 3 4

```java
String[] s = sc.nextLine().split(" ");
```

---

## ✨ Comma Separated Input

Input:
1,2,3,4

```java
String[] s = sc.nextLine().split(",");
```

---

## ✨ Functions

| Task | Syntax |
|------|---------|
| Length | `arr.length` |
| Access | `arr[i]` |
| Update | `arr[i]=x` |
| Sort | `Arrays.sort(arr)` |
| Fill | `Arrays.fill(arr,-1)` |

---

## ✨ Conversion

### List → Array

```java
arr[i] = list.get(i);
```

### Array → List

```java
list.add(arr[i]);
```

---

## 🎯 Used In

- Binary Search
- Two Sum
- Search Insert Position
- Valid Perfect Square
