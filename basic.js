function fibonacci(n) {
  if (n <= 0) return 0;
  if (n === 1) return 1;
  
  let prev = 0;
  let curr = 1;
  
  for (let i = 2; i <= n; i++) {
    let temp = curr;
    curr = prev + curr;
    prev = temp;
  }
  
  return curr;
}

// Test cases
console.log(fibonacci(2));  // 1
console.log(fibonacci(3));  // 2
console.log(fibonacci(5));  // 5
console.log(fibonacci(10)); // 55
