let data = [];
const filename = "./triangle";

// get first raw data format
data = require('fs').readFileSync(filename, 'utf-8')
  .split("\n")
  .filter(Boolean);

// extract the various elements
for(var i = 0; i < data.length; i++) {
  let tmp = data[i].split(" ");
  data[i] = tmp;
}

// enforce the elements to be a integer
for(var i = 0; i < data.length; i++) {
  for(var j = 0; j < data[i].length; j++) {
    data[i][j] = parseInt(data[i][j]);
  }
}

for (var i = data.length-2; i >= 0; i--) {
  for (var j = 0; j <= i; j++) {
    data[i][j] += (Math.max(data[i+1][j], data[i+1][j+1]));
  }
}
console.log(data);

let sum = data[0][0];

console.log("max sum is " + sum);
