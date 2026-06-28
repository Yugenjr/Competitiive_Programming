Good revision strategy. If you can write these from memory, you're ready for most Linked List coding rounds.

# Linked List Skeleton

```java
class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        size = 0;
    }

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
```

---

# Display

```java
public void display()
{
    Node curr = head;

    while(curr != null)
    {
        System.out.print(curr.val + " -> ");
        curr = curr.next;
    }

    System.out.println("END");
}
```

---

# Insert at First

```java
public void addFirst(int val)
{
    Node newNode = new Node(val);

    newNode.next = head;
    head = newNode;

    if(size == 0)
    {
        tail = head;
    }

    size++;
}
```

Time: `O(1)`

---

# Insert at Last

```java
public void addLast(int val)
{
    if(size == 0)
    {
        addFirst(val);
        return;
    }

    Node newNode = new Node(val);

    tail.next = newNode;
    tail = newNode;

    size++;
}
```

Time: `O(1)`

---

# Insert at Position

```java
public void addAtPos(int pos, int val)
{
    if(pos == 0)
    {
        addFirst(val);
        return;
    }

    if(pos == size)
    {
        addLast(val);
        return;
    }

    Node curr = head;
    int i = 0;

    while(i < pos - 1)
    {
        curr = curr.next;
        i++;
    }

    Node newNode = new Node(val, curr.next);
    curr.next = newNode;

    size++;
}
```

Time: `O(n)`

---

# Search Value

Returns node.

```java
public Node find(int val)
{
    Node curr = head;

    while(curr != null)
    {
        if(curr.val == val)
        {
            return curr;
        }

        curr = curr.next;
    }

    return null;
}
```

---

# Search Position

```java
public int search(int val)
{
    Node curr = head;
    int index = 0;

    while(curr != null)
    {
        if(curr.val == val)
        {
            return index;
        }

        curr = curr.next;
        index++;
    }

    return -1;
}
```

---

# Delete First

```java
public int deleteFirst()
{
    int val = head.val;

    head = head.next;

    if(head == null)
    {
        tail = null;
    }

    size--;

    return val;
}
```

Time: `O(1)`

---

# Delete Last

```java
public int deleteLast()
{
    if(size <= 1)
    {
        return deleteFirst();
    }

    Node curr = head;

    while(curr.next != tail)
    {
        curr = curr.next;
    }

    int val = tail.val;

    tail = curr;
    tail.next = null;

    size--;

    return val;
}
```

Time: `O(n)`

---

# Delete at Position

```java
public int deleteAtPos(int pos)
{
    if(pos == 0)
    {
        return deleteFirst();
    }

    if(pos == size - 1)
    {
        return deleteLast();
    }

    Node curr = head;
    int i = 0;

    while(i < pos - 1)
    {
        curr = curr.next;
        i++;
    }

    int val = curr.next.val;

    curr.next = curr.next.next;

    size--;

    return val;
}
```

Time: `O(n)`

---

# Get Node at Index

Very useful helper.

```java
public Node get(int index)
{
    Node curr = head;

    int i = 0;

    while(i < index)
    {
        curr = curr.next;
        i++;
    }

    return curr;
}
```

---

# Reverse Linked List (Interview Favorite)

```java
public void reverse()
{
    Node prev = null;
    Node curr = head;

    tail = head;

    while(curr != null)
    {
        Node next = curr.next;

        curr.next = prev;

        prev = curr;
        curr = next;
    }

    head = prev;
}
```

---

# Middle Node

```java
public Node middle()
{
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
```

---

# Cycle Detection

```java
public boolean hasCycle()
{
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast)
        {
            return true;
        }
    }

    return false;
}
```

---

# Most Important Functions for Assessment

Memorize these in order:

1. `addFirst()`
2. `addLast()`
3. `addAtPos()`
4. `deleteFirst()`
5. `deleteLast()`
6. `deleteAtPos()`
7. `search()`
8. `reverse()`
9. `middle()`
10. `hasCycle()`

If you can write these without looking, then most Linked List questions become variations of these operations. Interviewers love dressing up `reverse`, `middle`, and `slow-fast pointer` problems as if they've invented a new branch of mathematics. They haven't. It's usually the same three tricks wearing a fake moustache.
