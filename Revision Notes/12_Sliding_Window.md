
# 🪟 Sliding Window

> ⏱ 3 min revision

---

## ✨ Template

```java
int left = 0;

for(int right = 0; right < arr.length; right++){

    // Expand window

    while(condition){
        // Shrink window
        left++;
    }

    // Update answer
}
```

---

## ✨ Variables

| Purpose | Variable |
|---------|----------|
| Left Pointer | `left` |
| Right Pointer | `right` |
| Window Size | `right-left+1` |

---

## ✨ Fixed Window

```java
for(int right=0; right<arr.length; right++){

    if(right-left+1 == k){
        // Process window
        left++;
    }
}
```

---

## ✨ Window Size

```java
int size = right - left + 1;
```

---

## ⭐ Remember

- Expand → `right++`
- Shrink → `left++`
- Window Size → `right-left+1`

---

## 🎯 Used In

- Maximum Sum Subarray
- Longest Substring
- Fruits Into Baskets
- Minimum Window Substring
