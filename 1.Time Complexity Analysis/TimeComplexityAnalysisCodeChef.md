# TIME COMPLEXITY ANALYSIS.


### Q1

Average case time complexity of quicksort?

- [ ] O(n)
- [x] O(n log n)
- [ ] O(n²)
- [ ] O(n³)

---

### Q2
Worst case time complexity of quicksort?

- [ ] O(n)
- [ ] O(n log n)
- [x] O(n²)
- [ ] O(n³)

---

### Q3
Time complexity of binary search?

- [ ] O(1)
- [x] O(log n)
- [ ] O((log n)²)
- [ ] O(n)

---

### Q4

```
def f():
ans = 0
for i = 1 to n:
for j = 1 to log(i):
    ans += 1
print(ans)
```
Time Complexity of this program:

- [ ] O(n)
- [X] O(n log n)
- [ ] O(n²)
- [ ] O(n³)

---

### Q5

```
def f():
a = 0
for i = 1 to n:
a += i;
b = 0
for i = 1 to m:
b += i;
```
Time Complexity of this program:

- [ ] O(m)
- [ ] O(n)
- [x] O(n+m)
- [ ] O(n*m)

---

### Q6

```
def f():
a = 0
for i = 1 to n:
a += random.randint();			
b = 0
for j = 1 to m:
    b += random.randint();
```
Time Complexity of this program:

- [ ] O(m)
- [ ] O(n)
- [ ] O(n+m)
- [X] O(n*m)

---

### Q7

```
def f():
int a[n][n]
// Finding sum of elements of a matrix that are above or on the diagonal.
sum = 0
for i = 1 to n:
for j = i to n:
    sum += a[i][j]
print(sum)
```
Time Complexity of this program:

- [ ] O(n)
- [ ] O(n log n)
- [X] O(n²)
- [ ] O(n³)

---

### Q8

```
def f():
	int a[n][n]
	sum = 0
	// Finding sum of elements of a matrix that are strictly above the diagonal.
	for i = 1 to n:
		for j = i to n:
			sum += a[i][j]
	print(sum)
	
	for i = 1 to n:
		sum -= a[i][i]
```
Time Complexity of this program:

- [ ] O(n)
- [ ] O(n log n)
- [x] O(n²)
- [ ] O(n³)

---

### Q9

```
def f():
	ans = 0
	for i = 1 to n:
		for j = n to i:
			ans += (i * j)
	print(ans)
```
Time Complexity of this program:

- [ ] O(n)
- [ ] O(n log n)
- [x] O(n²)
- [ ] O(n³)

---

### Q10

```
def f():
	int a[N + 1][M + 1][K + 1]
	sum = 0
	for i = 1 to N:
		for j = i to M:
			for k = j to K:
				sum += a[i][j]
	print(sum)
```
Time Complexity of this program:

- [ ] O(N+M+K)
- [x] O(N\*M\*K)
- [ ] O(N*M+K)
- [ ] O(N+M*K)

---

### Q11

```
def f(n):
	ans = 0
	while (n > 0):
		ans += n
		n /= 2;
	print(ans)
```
Time Complexity of this program:

- [x] O(log n)
- [ ] O(n)
- [ ] O(n log n)
- [ ] O(n²)

---

### Q12

```
// Find the sum of digits of a number in its decimal representation.
def f(n):
	ans = 0
	while (n > 0):
		ans += n % 10
		n /= 10;
	print(ans)
```
Time Complexity of this program:

- [ ] O(log2n)
- [ ] O(log3n)
- [x] O(log10n)
- [ ] O(n)

---

### Q13

```
def f():
	ans = 0
	for (i = n; i >= 1; i /= 2):
		for j = m to i:
			ans += (i * j)
	print(ans)
```
Time Complexity of this program:

- [ ] O(n+m)
- [ ] O(n*m)
- [x] O(m log n)
- [ ] O(n log m)

---

### Q14

```
def f():
	ans = 0
	for (i = n; i >= 1; i /= 2):
		for (j = 1; j <= m; j *= 2)
			ans += (i * j)
	print(ans)
```
Time Complexity of this program:

- [ ] O(n*m)
- [x] O(logm logn)
- [ ] O(m log n)
- [ ] O(n log m)

---

### Q15

```
// Finding gcd of two numbers a, b.
def gcd(a, b):
	if (a < b) swap(a, b)
	if (b == 0) return a;
	else return gcd(b, a % b)
```
Time Complexity of this program:

Let **n = max{a,b}**

- [ ] O(1)
- [x] O(log n)
- [ ] O(n)
- [ ] O(n²)

---

### Q16

```
// Binary searching in sorted array for finding whether an element exists or not.
def exists(a, x):
	// Check whether the number x exists in the array a.
	lo = 0, hi = len(a) - 1
	while (lo <= hi):
		mid = (lo + hi) / 2
		if (a[mid] == x): return x;
		else if (a[mid] > x): hi = mid - 1;
		else lo = mid + 1;
	return -1; // Not found.
```
Time Complexity of this program:

Let **n=len(a)**

- [ ] O(1)
- [x] O(log n)
- [ ] O(n)
- [ ] O(n²)

---

### Q17

// Given a sorted array a, find the number of occurrence of number x in the entire array.

```
def count_occurrences(a, x, lo, hi):
	if lo > hi: return 0
	mid = (lo + hi) / 2;
	if a[mid] < x: return count_occurrences(a, x, mid + 1, hi)
	if a[mid] > x: return count_occurrences(a, x, lo, mid - 1)
	return 1 + count_occurrences(a, x, lo, mid - 1) + count_occurrences(a, x, mid + 1, hi)

// in the main function, we call it as
count_occurrences(a, x, 0, len(a) - 1)
```
Time Complexity of this program:

Let **n=len(a)**

- [ ] O(1)
- [x] O(log n)
- [ ] O(n)
- [ ] O(n²)

---

### Q18

```
// Finding fibonacci numbers.
def f(n):
	if n == 0 or n == 1: return 1
	return f(n - 1) + f(n - 2)
```
Time Complexity of this program:

- [ ] O(log n)
- [ ] O(n)
- [ ] O(n²)
- [x] O(2ⁿ)

---

### Q19

```
Create array memo[n + 1]

// Finding fibonacci numbers with memoization.
def f(n):
	if memo[n] != -1: return memo[n]
	if n == 0 or n == 1: ans = 1
	else: ans = f(n - 1) + f(n - 2)
	memo[n] = ans
	return ans

// In the main function.
Fill the memo array with all values equal to -1.
ans = f(n)
```
Time Complexity of this program:

- [ ] O(log n)
- [x] O(n)
- [ ] O(n²)
- [ ] O(2ⁿ)

---

### Q20

```
def f(a):
	n = len(a)
	j = 0
	for i = 0 to n - 1:
		while (j < n and a[i] < a[j]):
			j += 1
```
Time Complexity of this program:

- [ ] O(log n)
- [x] O(n)
- [ ] O(n log n)
- [ ] O(n²)

---

### Q21

```
def f():
	ans = 0
	for i = 1 to n:
		for j = i; j <= n; j += i:
			ans += 1
	print(ans)
```
Time Complexity of this program:

- [ ] O(log n)
- [ ] O(n)
- [x] O(n log n)
- [ ] O(n²)

---