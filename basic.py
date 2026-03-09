def fibonacci(n):
    if n <= 0:
        return 0
    if n == 1:
        return 1
    
    prev, curr = 0, 1
    
    for _ in range(2, n + 1):
        prev, curr = curr, prev + curr
    
    return curr

# Test cases
print(fibonacci(2))   # 1
print(fibonacci(3))   # 2
print(fibonacci(5))   # 5
print(fibonacci(10))  # 55
