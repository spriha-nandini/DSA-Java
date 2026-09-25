# 🗄️ SQL

> ⏱ 2 min revision

---

## ✨ Create Table

```sql
CREATE TABLE Student(
    id INT,
    name TEXT,
    marks INT
);
```

## ✨ Insert

```sql
INSERT INTO Student VALUES
(1,'Spriha',95);
```

## ✨ Select

```sql
SELECT * FROM Student;

SELECT name FROM Student;

SELECT name, marks FROM Student;
```

---

## ⭐ Keywords

| Keyword | Purpose |
|---------|----------|
| CREATE | Create table |
| INSERT | Add rows |
| SELECT | Retrieve data |
| FROM | Select table |

## ✨ WHERE

### Greater Than

```sql
SELECT * FROM Student
WHERE marks > 90;
```

### Equal

```sql
SELECT * FROM Student
WHERE name = 'Rahul';
```

### Less Than

```sql
SELECT * FROM Student
WHERE marks < 80;
```

## ✨ WHERE Operators

| Operator | Meaning |
|----------|---------|
| = | Equal |
| != | Not Equal |
| > | Greater Than |
| < | Less Than |
| >= | Greater or Equal |
| <= | Less or Equal |
| BETWEEN | Between two values |
| IN | Match multiple values |
| LIKE | Pattern matching |
| AND | Both conditions |
| OR | Either condition |
| NOT | Opposite condition |

---

### BETWEEN

```sql
SELECT * FROM Student
WHERE marks BETWEEN 80 AND 95;
```

### IN

```sql
SELECT * FROM Student
WHERE name IN ('Anu','Rahul');
```

### LIKE

```sql
SELECT * FROM Student
WHERE name LIKE 'S%';
```

### AND

```sql
SELECT * FROM Student
WHERE marks > 80 AND marks < 95;
```

### OR

```sql
SELECT * FROM Student
WHERE name = 'Rahul' OR name = 'Meera';
```

### NOT

```sql
SELECT * FROM Student
WHERE NOT marks = 88;
```

## ✨ Text Constraints

| Operator | Meaning |
|----------|---------|
| = | Exact match |
| != / <> | Not equal |
| LIKE | Pattern match |
| NOT LIKE | Opposite of LIKE |
| % | Any number of characters |
| _ | Exactly one character |
| IN() | Match from list |
| NOT IN() | Not in list |

---

### Exact Match

```sql
SELECT * FROM Student
WHERE name = 'Rahul';
```

### Starts With

```sql
SELECT * FROM Student
WHERE name LIKE 'S%';
```

### Ends With

```sql
SELECT * FROM Student
WHERE name LIKE '%a';
```

### Contains

```sql
SELECT * FROM Student
WHERE name LIKE '%ee%';
```

### One Character

```sql
SELECT * FROM Student
WHERE name LIKE '_nu';
```

### IN

```sql
SELECT * FROM Student
WHERE name IN ('Anu','Rahul');
```

### NOT IN

```sql
SELECT * FROM Student
WHERE name NOT IN ('Rahul');
```

## ✨ ORDER BY

| Query | Purpose |
|--------|---------|
| `ORDER BY col` | Ascending |
| `ORDER BY col ASC` | Ascending |
| `ORDER BY col DESC` | Descending |

### Ascending

```sql
SELECT * FROM Student
ORDER BY marks;
```

### Descending

```sql
SELECT * FROM Student
ORDER BY marks DESC;
```

---

## ✨ LIMIT

### First 5 rows

```sql
SELECT * FROM Student
LIMIT 5;
```

### Top scorer

```sql
SELECT * FROM Student
ORDER BY marks DESC
LIMIT 1;
```

### Top 3

```sql
SELECT * FROM Student
ORDER BY marks DESC
LIMIT 3;
```

---

## ⭐ Remember

- `ASC` → Small → Large
- `DESC` → Large → Small
- `LIMIT` → Number of rows

## ✨ OFFSET

Skip first 5 rows

```sql
SELECT * FROM Student
LIMIT 5 OFFSET 5;
```

### LIMIT + OFFSET

| Query | Purpose |
|--------|---------|
| `LIMIT 5` | First 5 rows |
| `LIMIT 5 OFFSET 5` | Next 5 rows |
| `LIMIT 1 OFFSET 2` | 3rd row |

### Example

```sql
SELECT * FROM Student
ORDER BY marks DESC
LIMIT 2 OFFSET 1;
```

> Returns the 2nd and 3rd highest marks.


## ✨ Expressions

| Operator | Purpose |
|----------|---------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus |

---

### Calculate Value

```sql
SELECT title,
       length_minutes + 10
FROM Movies;
```

### Alias (Rename Column)

```sql
SELECT title,
       length_minutes AS duration
FROM Movies;
```

### Multiple Expressions

```sql
SELECT title,
       year - 1900 AS released_after
FROM Movies;
```

---

## ⭐ Remember

- `AS` → Rename output column
- Expressions work only in the result, not the table
