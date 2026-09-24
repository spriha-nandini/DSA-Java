# 🟣 List & ArrayList

> ⏱ 2 min revision

---

## ✨ Declaration

```java
List<Integer> list = new ArrayList<>();
ArrayList<Integer> arr = new ArrayList<>();
```

---

## ✨ List Functions

| Task | Syntax |
|------|--------|
| Add | `list.add(x)` |
| Insert | `list.add(i,x)` |
| Get | `list.get(i)` |
| Update | `list.set(i,x)` |
| Remove | `list.remove(i)` |
| Size | `list.size()` |
| Contains | `list.contains(x)` |
| Clear | `list.clear()` |
| Empty | `list.isEmpty()` |

---

## ✨ ArrayList Functions

| Task | Syntax |
|------|--------|
| Add End | `arr.add(x)` |
| Add Index | `arr.add(i,x)` |
| Get | `arr.get(i)` |
| Set | `arr.set(i,x)` |
| Remove Index | `arr.remove(i)` |
| Remove Value | `arr.remove(Integer.valueOf(x))` |
| Index Of | `arr.indexOf(x)` |
| Last Index | `arr.lastIndexOf(x)` |
| Sort | `Collections.sort(arr)` |
| Reverse | `Collections.reverse(arr)` |

---

## ✨ Conversion

### List → Array

```java
int[] a = new int[list.size()];

for(int i=0;i<list.size();i++)
    a[i]=list.get(i);
```

### Array → List / ArrayList

```java
for(int x : a)
    list.add(x);
```

---

## 🎯 Used In

- Sparse Arrays
- Ransom Note
- Dynamic Array
- HackerRank List Questions
- HackerRank List
- Dynamic Array
