# ❤️ Binary Search

> ⏱ 3 min revision

---

## ✨ Declaration

```java
int left = 0;
int right = arr.length - 1;
```

---

## ✨ Standard Template

```java
while(left <= right){

    int mid = (left + right) / 2;

    if(arr[mid] == target)
        return mid;

    else if(target < arr[mid])
        right = mid - 1;

    else
        left = mid + 1;
}

return -1;
```

---

## ✨ Update Rules

| Condition | Update |
|-----------|--------|
| Found | `return mid` |
| Target smaller | `right = mid - 1` |
| Target larger | `left = mid + 1` |

---

## ✨ Search Insert (LC 35)

If target is **not found**, return:

```java
return left;
```

> `left` = insertion position

---

## ✨ Sqrt(x) (LC 69)

```java
int ans = 0;

while(left <= right){

    int mid = (left + right) / 2;

    if((long)mid * mid <= x){
        ans = mid;
        left = mid + 1;
    }else{
        right = mid - 1;
    }
}

return ans;
```

⭐ Store `ans` because exact square may not exist.

---

## ✨ Perfect Square (LC 367)

```java
if((long)mid * mid == num)
    return true;
```

Use **long** to avoid overflow.

---

## ⭐ Remember

- `left <= right`
- `mid = (left + right) / 2`
- Use `(long) mid * mid`
- Search Insert → `return left`
- Sqrt → Maintain `ans`

---

## 🎯 Solved

- 35. Search Insert Position
- 69. Sqrt(x)
- 367. Valid Perfect Square
- 704. Binary Search
