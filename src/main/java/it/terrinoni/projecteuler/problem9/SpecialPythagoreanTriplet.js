var s = 1000;

for(var a = 3; a < (s - 3)/3; a++) {
  for(var b = a+1; b < (s - 1 - a)/2; b++) {
    var c = s - a - b;
    if(Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
      console.log(a + "," + b + "," + c);
      console.log("prod: ", a * b * c);
    }
  }
}
