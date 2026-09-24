# 🌲 Backtracking

> ⏱ 3 min revision

---

## ✨ Template

```java
void solve(){

    if(baseCase){
        return;
    }

    for(int i=0;i<n;i++){

        if(choiceInvalid)
            continue;

        choose();

        solve();

        unchoose();
    }
}
```

---

## ✨ 3 Steps

1. Choose
2. Explore
3. Backtrack (Undo)

---

## ✨ Visited Pattern

```java
vis[i] = true;

solve();

vis[i] = false;
```

---

## ⭐ Remember

- Uses Recursion
- Undo every change
- All possible combinations

---

## 🎯 Used In

- N Queens
- Sudoku Solver
- Rat in a Maze
- Permutations
