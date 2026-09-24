# 🌳 DFS (Depth First Search)

> ⏱ 3 min revision

---

## ✨ Template

```java
void dfs(Node node){

    if(node == null)
        return;

    // Visit
    System.out.print(node.val + " ");

    dfs(node.left);
    dfs(node.right);
}
```

---

## ✨ Grid DFS

```java
void dfs(int r, int c){

    if(r<0 || c<0 || r>=n || c>=m)
        return;

    if(vis[r][c])
        return;

    vis[r][c] = true;

    dfs(r+1,c);
    dfs(r-1,c);
    dfs(r,c+1);
    dfs(r,c-1);
}
```

---

## ⭐ Remember

- DFS = Go **Deep First**
- Uses **Recursion** or **Stack**
- Always mark **visited** before exploring

---

## 🎯 Used In

- Number of Islands
- Flood Fill
- Tree Traversal
- Graph Traversal
