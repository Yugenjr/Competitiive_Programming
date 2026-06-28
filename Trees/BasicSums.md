Perfect. Trees are actually where Linked Lists pay off.

A Tree is just a Node with **more than one reference**.

In Linked List:

```java
class Node {
    int val;
    Node next;
}
```

In Binary Tree:

```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
```

That's it.

The scary chapter title "Trees" is hiding behind two extra pointers.

---

# 1. What is a Tree?

Example:

```text
        10
       /  \
      5    20
     / \   / \
    2   7 15 30
```

Terminology:

```text
10 = Root

5,20 = Children of 10

10 = Parent of 5,20

2,7,15,30 = Leaf Nodes
```

---

# 2. Binary Tree Node

Java template:

```java
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val)
    {
        this.val = val;
    }
}
```

Memorize this.

---

# 3. MOST IMPORTANT THING

Tree Traversals.

Everything starts here.

There are only 3 DFS traversals.

---

## Inorder

```text
Left
Root
Right
```

Example:

```text
        10
       /  \
      5    20
```

Visit:

```text
5 10 20
```

Code:

```java
public void inorder(TreeNode root)
{
    if(root == null)
        return;

    inorder(root.left);

    System.out.print(root.val + " ");

    inorder(root.right);
}
```

---

## Preorder

```text
Root
Left
Right
```

Visit:

```text
10 5 20
```

Code:

```java
public void preorder(TreeNode root)
{
    if(root == null)
        return;

    System.out.print(root.val + " ");

    preorder(root.left);
    preorder(root.right);
}
```

---

## Postorder

```text
Left
Right
Root
```

Visit:

```text
5 20 10
```

Code:

```java
public void postorder(TreeNode root)
{
    if(root == null)
        return;

    postorder(root.left);
    postorder(root.right);

    System.out.print(root.val + " ");
}
```

---

# Assessment Hack

Memorize:

```text
Inorder

L R R
No!

Left Root Right
```

```text
Preorder

Root Left Right
```

```text
Postorder

Left Right Root
```

Most beginners mix these up every 30 seconds.

---

# 4. Why Recursion Works

Suppose:

```text
        10
       / \
      5  20
```

Call:

```java
inorder(10)
```

Java automatically does:

```text
go left

print

go right
```

The recursion stack handles everything.

No need to manually track nodes.

---

# 5. Height of Tree ⭐⭐⭐⭐⭐

Very common.

Question:

```text
How many levels?
```

Example:

```text
        10
       / \
      5  20
     /
    2
```

Height:

```text
3
```

Code:

```java
public int height(TreeNode root)
{
    if(root == null)
        return 0;

    return 1 +
        Math.max(
            height(root.left),
            height(root.right)
        );
}
```

Pattern:

```text
1 + max(left,right)
```

---

# 6. Count Nodes ⭐⭐⭐⭐

```java
public int count(TreeNode root)
{
    if(root == null)
        return 0;

    return 1
        + count(root.left)
        + count(root.right);
}
```

Pattern:

```text
1 + left + right
```

---

# 7. Sum of Nodes ⭐⭐⭐⭐

```java
public int sum(TreeNode root)
{
    if(root == null)
        return 0;

    return root.val
        + sum(root.left)
        + sum(root.right);
}
```

---

# 8. Level Order Traversal ⭐⭐⭐⭐⭐

Uses Queue.

Tree's most famous BFS.

```java
Queue<TreeNode> q = new LinkedList<>();

q.offer(root);

while(!q.isEmpty())
{
    TreeNode node = q.poll();

    System.out.print(node.val + " ");

    if(node.left != null)
        q.offer(node.left);

    if(node.right != null)
        q.offer(node.right);
}
```

---

# First 5 Tree Questions You Must Know

1. Inorder Traversal
2. Preorder Traversal
3. Postorder Traversal
4. Height of Tree
5. Level Order Traversal

If you understand these 5, you've already understood about 60% of beginner tree questions.

---

### Tiny Mental Trick

Linked List:

```text
10 -> 20 -> 30
```

One direction.

Tree:

```text
      10
     /  \
    5   20
```

Two directions.

That's the only conceptual jump.

Tomorrow, if you see a tree question, first ask:

```text
Is this:
- Traversal?
- Height?
- Count?
- Sum?
- BFS(Level Order)?
```

A shocking number of assessment questions are just one of these wearing a longer problem statement. The tree itself isn't hard. The names around it are often scarier than the code. 🌳
