var minDiv = 1;
var maxDiv = 20;

function isEvenlyDivisible(num) {
  for(i = minDiv; i < maxDiv; i++) {
    if(num % i != 0)
      return false;
  }

  return true;
}

var mul = 2;
var smallMulti = maxDiv * mul;

while(!isEvenlyDivisible(smallMulti)) {
  mul++;
  smallMulti = maxDiv * mul;
}

console.log(smallMulti);
