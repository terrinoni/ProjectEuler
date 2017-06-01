var limit = 4000000;

function fibonacci(x) {
  if(x <= 1) {
    return 1;
  } else {
    return fibonacci(x-1) + fibonacci(x-2)
  }
}

var sum = 0;
var currVal = 0;
var i = 2;

//for (var i = 2; currVal < limit; i++) {
//  currVal = fibonacci(i);
//  if(currVal % 2 == 0) {
//    sum += currVal;
//    console.log("currVal is " + currVal);
//  }
//}

while((currVal = fibonacci(i)) < limit) {
  if(currVal % 2 == 0) {
    sum += currVal;
    console.log("currVal is " + currVal);
  }
  i++;
}

console.log(sum);
