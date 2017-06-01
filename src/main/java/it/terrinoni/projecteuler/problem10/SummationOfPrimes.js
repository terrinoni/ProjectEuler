var limit = 2000000;

function isPrime(n) {
  if(n <= 1)
    return false;
  else if(n <= 3)
    return true;
  else if((n % 2 == 0) || (n % 3 == 0))
    return false;

  let i = 5;
  while((i * i) <= n) {
    if((n % i == 0) || (n % (i + 2) == 0))
      return false;
    i += 6;
  }
  return true;
}

var sum = 0;
for(var i = 2; i < limit; i++) {
  if(isPrime(i))
    sum += i;
}

console.log(sum);
