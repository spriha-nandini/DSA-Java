# ➕ Prefix Sum

> ⏱ 2 min revision

---

## ✨ Build

```java
prefix[0] = arr[0];

for(int i=1;i<n;i++)
    prefix[i] = prefix[i-1] + arr[i];
```

---

## ✨ Range Sum

```java
sum = prefix[r] - prefix[l-1];
```

---

## ⭐ Remember

- Preprocessing → O(n)
- Query → O(1)

---

## 🎯 Used In

- Range Sum Query
- Subarray Sum
