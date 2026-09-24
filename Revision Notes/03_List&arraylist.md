# 🟣 List & ArrayList

> ⏱ 2 min revision

---

## ✨ Declaration

```java
List<Integer> list = new ArrayList<>();

ArrayList<Integer> arr = new ArrayList<>();
```

## ✨ Input

```java
list.add(sc.nextInt());
```

---

## ✨ Functions

| Task | Syntax |
|------|--------|
| Add | `list.add(x)` |
| Get | `list.get(i)` |
| Update | `list.set(i,x)` |
| Remove | `list.remove(i)` |
| Size | `list.size()` |

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
- HackerRank List Questions
- Dynamic Array Problems
