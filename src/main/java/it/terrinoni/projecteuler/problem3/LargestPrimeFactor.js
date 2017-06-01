var evilNum = 600851475143;

function primeFacor(num) {
  var factor, lastFactor;

  factor = 2;
  lastFactor = 1;

  var maxFactor = Math.sqrt(num);

  while(num > 1 && factor < maxFactor) {
    if(num % factor == 0) {
      lastFactor = factor;
      num /= factor;
      while(num % factor == 0) { // reduction for the same factor
        num /= factor;
      }
    }

    factor++;
  }

  return lastFactor;
}

console.log(primeFacor(evilNum));
