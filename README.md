1. Create & Traverse List - Create a singly linked list from [1,2,3,4,5] and print all elements. Input: arr = [1,2,3,4,5] Output: 1 2 3 4 5
2. Length of List - Return the number of nodes. Do iteratively, then recursively. Input: 1->2->3->4->5 Output: 5
3. Search an Element - Given x, return true if exists, else false. Input: head=1->2->3, x=3 Output: true. Input: head=1->2->3, x=7 Output: false
4. Insert at Head - Insert val at beginning. Input: head=2->3->4, val=1 Output: 1->2->3->4
5. Insert at Tail - Insert val at end. Input: head=1->2->3, val=4 Output: 1->2->3->4
6. Insert at Position - Insert val at 0-based index pos. Handle pos=0 and pos=length. Input: head=1->2->4, val=3, pos=2 Output: 1->2->3->4. Input: head=1->2->3, val=0, pos=0 Output: 0->1->2->3
7. Delete at Head - Remove first node. Handle empty. Input: head=1->2->3 Output: 2->3. Input: head=null Output: null
8. Delete at Tail - Remove last node. Handle single-node. Input: head=1->2->3 Output: 1->2. Input: head=5 Output: null
9. Delete at Position - Delete node at 0-based index pos. Handle head deletion and invalid positions. Input: head=1->2->3->4, pos=1 Output: 1->3->4. Input: head=1->2->3, pos=0 Output: 2->3
10. Delete by Value - Delete first occurrence of val. Input: head=1->2->3->2, val=2 Output: 1->3->2. Input: head=1->2->3, val=9 Output: 1->2->3 (no change)
11. Find Middle Node - Return middle. If even, return second middle. Hint: slow moves 1, fast moves 2. Input: 1->2->3->4->5 Output: 3. Input: 1->2->3->4 Output: 3
12. Nth Node from End - Return Nth node from end in one pass. Hint: gap of N between two pointers. Input: head=1->2->3->4->5, N=2 Output: 4
13. Remove Nth Node from End - Delete Nth from end. Handle N=length. Input: head=1->2->3->4->5, N=2 Output: 1->2->3->5. Input: head=1->2->3, N=3 Output: 2->3
14. Detect Cycle - Return true if cycle. Use Floyd's. Input: 3->2->0->-4 with tail connecting back to node 2 Output: true. Input: 1->2->3 Output: false
15. Find Cycle Start - If cycle exists, return start node. Hint: after meeting, reset one pointer to head. Input: 3->2->0->-4 with tail back to node 2 Output: Node with value 2
16. Cycle Length - If cycle exists, return length. Else 0. Input: 3->2->0->-4 with tail back to node 2 Output: 3
17. Palindrome Linked List - Return true if reads same forward/backward. Hint: find middle, reverse second half, compare. Input: 1->2->2->1 Output: true. Input: 1->2->3 Output: false
18. Intersection of Two Lists - Two lists merge at a node. Return intersection node. Hint: align lengths, then move together. Input: A=4->1->8->4->5, B=5->6->1->8->4->5 Output: Node with value 8
19. Reverse List (Iterative) - Reverse entire list using 3 pointers. Do 10 times. Input: 1->2->3->4->5 Output: 5->4->3->2->1
20. Reverse List (Recursive) - Same as #19 using recursion. Input: 1->2->3 Output: 3->2->1
21. Reverse Sublist (m to n) - Reverse only nodes from m to n (1-based). Input: head=1->2->3->4->5, m=2, n=4 Output: 1->4->3->2->5
22. Reverse in Groups of K - Reverse every K nodes. If remaining < K, leave as is. Input: head=1->2->3->4->5, K=2 Output: 2->1->4->3->5. Input: head=1->2->3->4->5, K=3 Output: 3->2->1->4->5
23. Reverse Alternate K Nodes - Reverse first K, skip next K, repeat. Input: head=1->2->3->4->5->6->7->8, K=2 Output: 2->1->3->4->6->5->7->8
24. Swap Nodes in Pairs - Swap every two adjacent nodes. Input: 1->2->3->4 Output: 2->1->4->3. Input: 1 Output: 1
25. Merge Two Sorted Lists - Merge two sorted lists. Use dummy node. Input: l1=1->2->4, l2=1->3->4 Output: 1->1->2->3->4->4. Input: l1=null, l2=0 Output: 0
26. Merge K Sorted Lists - Merge K sorted lists. Use priority queue AND divide & conquer. Input: lists=[1->4->5, 1->3->4, 2->6] Output: 1->1->2->3->4->4->5->6. Input: lists=[] Output: null
27. Sort a Linked List - Sort in O(n log n) using merge sort. Input: 4->2->1->3 Output: 1->2->3->4. Input: -1->5->3->4->0 Output: -1->0->3->4->5
28. Add Two Numbers (Reverse Order) - Lists in reverse order (e.g., 2->4->3 = 342). Return sum as list. Handle carry. Input: l1=2->4->3 (342), l2=5->6->4 (465) Output: 7->0->8 (807)
29. Add Two Numbers II (Forward Order) - Same as #28 but digits forward. Hint: reverse or stack. Input: l1=7->2->4->3 (7243), l2=5->6->4 (564) Output: 7->8->0->7 (7807)
30. Flatten a Multilevel List - Each node may have child pointer. Flatten to single level. Input: 1->2->3->4, 2 has child 7->8->10, 8 has child 9 Output: 1->2->7->8->9->10->3->4
31. Print Reverse - Print all elements in reverse without reversing list. Do recursively and iteratively. Input: 1->2->3->4 Output: 4 3 2 1
32. Count Occurrences - Count how many times val appears. Input: head=1->2->2->3->2, val=2 Output: 3
33. Remove Duplicates from Sorted List - Delete duplicates so each appears once. Input: 1->1->2->3->3 Output: 1->2->3
34. Remove Duplicates from Sorted List II - Delete all nodes with duplicate numbers, leaving only distinct. Input: 1->2->3->3->4->4->5 Output: 1->2->5. Input: 1->1->1->2->3 Output: 2->3
35. Remove Duplicates from Unsorted List - Remove duplicates from unsorted. Do with HashSet and O(n^2). Input: 1->3->2->3->1->4 Output: 1->3->2->4
36. Move Last Node to Front - Move last node to front. Input: 1->2->3->4->5 Output: 5->1->2->3->4
37. Segregate Even and Odd Nodes - All even-valued nodes before odd, keeping relative order. Input: 17->15->8->12->10->5->4->1 Output: 8->12->10->4->17->15->5->1
38. Segregate 0s, 1s, and 2s - Sort list of only 0s,1s,2s. Input: 1->2->0->1->0->2 Output: 0->0->1->1->2->2
39. Delete Middle Node - Delete middle. If even, delete second middle. Input: 1->2->3->4->5 Output: 1->2->4->5. Input: 1->2->3->4 Output: 1->2->4
40. Delete Node Without Head - Given only pointer to node (not tail), delete it. Input: node=3 in 1->2->3->4->5 Output: 1->2->4->5. Hint: copy next value, skip next.
41. Swap Kth Node from Beginning and End - Swap Kth from beginning with Kth from end by changing links. Input: head=1->2->3->4->5, K=2 Output: 1->4->3->2->5. Input: head=1->2->3->4->5, K=1 Output: 5->2->3->4->1
42. Pairwise Swap by Changing Links - Swap every two adjacent nodes by changing links, not values. Input: 1->2->3->4->5 Output: 2->1->4->3->5
43. Rotate List Right by K - Rotate right by K places. Input: head=1->2->3->4->5, K=2 Output: 4->5->1->2->3. Input: head=0->1->2, K=4 Output: 2->0->1
44. Rotate List Left by K - Rotate left by K places. Input: head=1->2->3->4->5, K=2 Output: 3->4->5->1->2
45. Reorder List - Reorder to L0->Ln->L1->Ln-1->L2->Ln-2... Input: 1->2->3->4 Output: 1->4->2->3. Input: 1->2->3->4->5 Output: 1->5->2->4->3
46. Partition List - All nodes < x before nodes >= x, keeping relative order. Input: head=1->4->3->2->5->2, x=3 Output: 1->2->2->4->3->5
47. Odd Even Linked List - Group odd-indexed nodes first, then even-indexed (1-based). Input: 1->2->3->4->5 Output: 1->3->5->2->4
48. Remove Nodes Greater on Right - Remove every node which has a node with strictly greater value to its right. Input: 5->2->13->3->8 Output: 13->8
49. Remove Zero Sum Consecutive Nodes - Remove consecutive sequences summing to 0. Input: 1->2->-3->3->1 Output: 3->1. Input: 1->2->3->-3->4 Output: 1->2->4
50. Split List into Parts - Split into K consecutive parts. Earlier parts >= later parts in size. Input: head=1->2->3->4->5->6->7->8->9->10, K=3 Output: [1->2->3->4, 5->6->7, 8->9->10]
51. Reverse First K Nodes - Reverse only first K nodes. Input: head=1->2->3->4->5, K=3 Output: 3->2->1->4->5
52. Reverse Last K Nodes - Reverse only last K nodes. Input: head=1->2->3->4->5, K=3 Output: 1->2->5->4->3
53. Reverse Between Two Positions Twice - Reverse sublist, then reverse another sublist of new list. Input: head=1->2->3->4->5, reverse [2,4] then [1,3]. Solve step by step and print final list.
54. Reverse in Groups of K (Variation) - If remaining < K, reverse them too. Input: head=1->2->3->4->5, K=3 Output: 3->2->1->5->4
55. Reverse Even Length Groups - Group sizes 1,2,3,4... Reverse groups with even size. Input: 1->2->3->4->5->6->7->8 Output: 1->3->2->4->5->6->8->7
56. Reverse Nodes in Even Positions - Reverse only nodes at even positions. Input: 1->2->3->4->5->6 Output: 1->4->3->2->5->6
57. Palindrome Check Without Extra Space - Check palindrome in O(1) space by reversing second half, comparing, then restoring. Input: 1->2->3->2->1 Output: true
58. Reverse a Doubly Linked List - Reverse a doubly linked list (both next and prev). Input: 1<->2<->3<->4 Output: 4<->3<->2<->1
59. Merge Two Lists Alternately - Merge two lists by alternating nodes. Input: l1=1->2->3, l2=4->5->6 Output: 1->4->2->5->3->6
60. Merge Sort Linked List (Full Walkthrough) - Sort using merge sort. Find middle, split, sort both, merge. Input: 10->4->2->8->1 Output: 1->2->4->8->10
61. Merge K Sorted Lists (Divide & Conquer Only) - Same as #26 but only divide and conquer (no heap). Input: lists=[1->4->5, 1->3->4, 2->6] Output: 1->1->2->3->4->4->5->6
62. Subtract Two Numbers - Two numbers as reverse-order lists. Return difference (first - second, >=0). Input: l1=5->0->0 (500), l2=1->2 (21) Output: 9->7->4 (479)
63. Multiply Two Numbers - Multiply two reverse-order lists. Input: l1=2->3 (32), l2=4->5 (54) Output: 8->2->7->1 (1728)
64. Add 1 to a Number - Digits in forward order, add 1. Input: 1->2->9 Output: 1->3->0. Input: 9->9->9 Output: 1->0->0->0
65. Sort List of 0s, 1s, 2s (Dutch Flag) - Sort only 0s,1s,2s in one pass. Input: 0->1->2->0->1->2 Output: 0->0->1->1->2->2
66. Union of Two Lists - Return union (distinct) in sorted order. Input: l1=1->2->3, l2=2->3->4 Output: 1->2->3->4
67. Intersection of Two Lists (Values) - Return common distinct elements in sorted order. Input: l1=1->2->3->4, l2=2->4->5 Output: 2->4
68. Flatten a Sorted Multilevel List - Same as #30 but each level sorted. Merge into one sorted flat list. Input: 1->4->7, 4 has child 2->5->8 Output: 1->2->4->5->7->8
69. Design Linked List - Class with get(index), addAtHead, addAtTail, addAtIndex, deleteAtIndex. Example: addAtHead(1) -> 1; addAtTail(3) -> 1->3; addAtIndex(1,2) -> 1->2->3; get(1) -> 2; deleteAtIndex(1) -> 1->3; get(1) -> 3
70. Design LRU Cache - Fixed capacity using HashMap + Doubly Linked List. get and put in O(1). Example: LRUCache(2); put(1,1); put(2,2); get(1)->1; put(3,3) evicts 2; get(2)->-1
71. Design LFU Cache - Least Frequently Used cache with O(1) get and put. Example: LFUCache(2); put(1,1); put(2,2); get(1)->1; put(3,3) evicts 2; get(2)->-1
72. Design Browser History - visit(url), back(steps), forward(steps) using doubly linked list. Example: BrowserHistory("[leetcode.com](https://leetcode.com/)"); visit("[google.com](https://google.com/)"); visit("[facebook.com](https://facebook.com/)"); back(1)->"[google.com](https://google.com/)"; forward(1)->"[facebook.com](https://facebook.com/)"
73. Design Stack Using Linked List - push, pop, peek, isEmpty. Example: push(1); push(2); peek()->2; pop()->2; pop()->1
74. Design Queue Using Linked List - enqueue, dequeue, peek, isEmpty. Example: enqueue(1); enqueue(2); peek()->1; dequeue()->1
75. Design Deque Using Linked List - addFirst, addLast, removeFirst, removeLast in O(1). Example: addFirst(1); addLast(2); removeFirst()->1
76. Decimal Equivalent of Binary List - List represents binary (MSB first). Return decimal. Input: 1->0->1->1 Output: 11
77. Convert Decimal to Linked List - Given decimal, build list where each node is a digit (MSB first). Input: n=1234 Output: 1->2->3->4
78. Josephus Circle Problem - N people in circle, kill every Kth. Return survivor (use circular list). Input: N=5, K=2 Output: 3
79. Circular Linked List - Insert - Insert node at beginning of circular list. Input: 1->2->3->1 (circular), val=0 Output: 0->1->2->3->0 (circular)
80. Circular Linked List - Delete - Delete first node of circular list. Input: 1->2->3->1 (circular) Output: 2->3->2 (circular)
81. Josephus with List - Solve Josephus using circular linked list. Input: n=7, k=3 Output: 4
82. Check if List is Circular - Return true if circular (cycle back to head), else false. Input: 1->2->3->1 (back to head) Output: true. Input: 1->2->3->null Output: false
83. Find Length of Loop - Same as #16 but return -1 if no loop. Input: list with loop of length 4 Output: 4
84. Count Rotations in Sorted Circular List - Given sorted circular list, find rotations. Input: 4->5->6->1->2->3 Output: 3
85. Sorted Insert in Sorted Circular List - Insert val in sorted circular list so it remains sorted. Input: head=1->2->4->5->1 (circular), val=3 Output: 1->2->3->4->5->1 (circular)
86. Copy List with Random Pointer - Each node has next and random. Return deep copy. Input: 7->13->11->10->1 with random pointers set arbitrarily. Output: Deep copy with same structure.
87. Flatten a Binary Tree to Linked List - Given binary tree, flatten to right-skewed linked list (in-place, pre-order). Input: 1 with left 2 (left 3, right 4) and right 5 (right 6). Output: 1->2->3->4->5->6
88. Linked List in Binary Tree - Check if linked list is a subpath in binary tree. Input: head=4->2->8, tree contains path 4->2->8 Output: true
89. Convert Sorted List to BST - Given sorted linked list, build balanced BST. Input: -10->-3->0->5->9 Output: 0 (left -3 (left -10), right 9 (left 5))
90. Merge In Between Linked Lists - Remove nodes between a and b, insert another list. Input: list1=0->1->2->3->4->5, a=3, b=4, list2=100->101 Output: 0->1->2->100->101->5
91. Insert GCD in Linked List - Between every adjacent pair, insert GCD. Input: 18->6->10->3 Output: 18->6->6->2->10->1->3
92. Convert Binary Number in List to Integer - Same as #76 but input LSB first. Input: 1->0->1->1 (LSB first) Output: 13
93. Double a Number Represented as List - Double a number stored as list (MSB first). Input: 1->8->9 Output: 3->7->8
94. Next Greater Node in Linked List - Return array where ans[i] is next greater value. If none, 0. Input: 2->1->5 Output: [5,5,0]
95. Delete Nodes from List Present in Array - Remove all nodes whose value exists in array. Input: head=1->2->3->4->5, nums=[1,3] Output: 2->4->5
96. Reverse Nodes in K-Group (Hard Version) - Reverse every K nodes preserving original pointer structure using recursion + iteration hybrid. Input: head=1->2->3->4->5, K=2 Output: 2->1->4->3->5
97. Merge K Sorted Lists (Optimized Heap) - Merge K sorted lists using min-heap. O(N log K). Input: lists=[1->4->5, 1->3->4, 2->6] Output: 1->1->2->3->4->4->5->6
98. Sort List with Constant Space - Sort in O(n log n) and O(1) space (bottom-up merge sort). Input: -1->5->3->4->0 Output: -1->0->3->4->5
99. LFU Cache (Hard) - Design LFU with O(1) get and put using hashmap + doubly linked list of frequency buckets. Example: LFUCache(2); put(1,1); put(2,2); get(1)->1; put(3,3) evicts 2; get(2)->-1
100. Split Linked List in Parts (Equal Size) - Split into K parts where no two differ by more than 1 in length, earlier parts bigger. Input: head=1->2->3, K=5 Output: [[1],[2],[3],[],[]]. Input: head=1->2->3->4->5->6->7->8->9->10, K=3 Output: [[1,2,3,4],[5,6,7],[8,9,10]]

PRACTICE RITUAL (FOR EVERY PROBLEM)

1. Draw on paper - boxes + arrows. Always.
2. Write edge cases first: empty, 1 node, 2 nodes, head/tail ops.
3. Code locally - plain text editor, no autocomplete.
4. Test with your own cases - don't just trust compilation.
5. Re-solve from scratch the next day without looking.
6. Only then open LeetCode and compare.

RECOMMENDED ORDER TO SOLVE\
Phase A (weeks 1-2): 1 to 50 - Fundamentals + Two Pointers + Reversal + Merge/Sort\
Phase B (weeks 3-4): 51 to 75 - Advanced Reversal + Design problems\
Phase C (week 5): 76 to 100 - Math, Circular lists, Advanced patterns, Hard problems
