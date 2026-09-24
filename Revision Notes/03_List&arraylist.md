# 🟣 List & ArrayList

> ⏱ 2 min revision

---

## ✨ Declaration

```java
List<Integer> list = new ArrayList<>();

ArrayList<Integer> arr = new ArrayList<>();
```

## ✨ Functions

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

## ✨ Conversion

### List → Array

```java
int[] arr = new int[list.size()];

for(int i=0;i<list.size();i++){
    arr[i]=list.get(i);
}
```

### Array → List

```java
for(int x:arr){
    list.add(x);
}
```

---

## 🎯 Used In

- Sparse Arrays
- Ransom Note
- HackerRank List
- Dynamic Array
