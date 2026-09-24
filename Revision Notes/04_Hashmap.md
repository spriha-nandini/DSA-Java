# 🟢 HashMap

> ⏱ 2 min revision

---

## ✨ Declaration

```java
HashMap<String,Integer> map = new HashMap<>();
```

---

## ✨ Functions

| Task | Syntax |
|------|--------|
| Add / Update | `map.put(k,v)` |
| Get Value | `map.get(k)` |
| Check Key | `map.containsKey(k)` |
| Check Value | `map.containsValue(v)` |
| Remove | `map.remove(k)` |
| Size | `map.size()` |
| Empty | `map.isEmpty()` |
| Clear | `map.clear()` |

---

## ✨ Frequency Pattern ⭐

```java
if(map.containsKey(ch)){
    map.put(ch,map.get(ch)+1);
}else{
    map.put(ch,1);
}
```

### Short Version

```java
map.put(ch,map.getOrDefault(ch,0)+1);
```

---

## ✨ Traversal

### Keys

```java
for(String key : map.keySet()){
    System.out.println(key);
}
```

### Key + Value

```java
for(String key : map.keySet()){
    System.out.println(key+" "+map.get(key));
}
```

---

## 🎯 Used In

- Sparse Arrays
- Ransom Note
- Two Sum
- Frequency Count
