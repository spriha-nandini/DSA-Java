# 🔵 Stack

> ⏱ 2 min revision

---

## ✨ Declaration

```java
Stack<Integer> st = new Stack<>();
```

---

## ✨ Functions

| Task | Syntax |
|------|--------|
| Push | `st.push(x)` |
| Pop | `st.pop()` |
| Top | `st.peek()` |
| Empty | `st.isEmpty()` |
| Size | `st.size()` |
| Clear | `st.clear()` |

---

## ⭐ Remember

- `peek()` → Look only
- `pop()` → Remove + Return
- LIFO → Last In First Out

---

## ✨ Traversal

```java
while(!st.isEmpty()){
    System.out.println(st.pop());
}
```

---

## 🎯 Used In

- Valid Parentheses
- Min Stack
- Next Greater Element
- Queue Using Two Stacks
