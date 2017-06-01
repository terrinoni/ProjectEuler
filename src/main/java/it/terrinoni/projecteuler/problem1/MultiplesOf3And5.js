var count = 3;
var sum = 0;
var limit = 1000;

while (count < limit) {
  if((count % 3 == 0) || (count % 5 == 0)) {
    sum += count;
  }
  count++;
}

console.log("The sum is " + sum);
