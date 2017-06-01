function getSumOfSquares(n) {
  return (n * (n + 1) * ((2 * n) + 1)) / 6;
}

function getSquareOfSum(n) {
  var sum = (n * (n + 1)) / 2;
  return Math.pow(sum, 2);
}

console.log(getSquareOfSum(100) - getSumOfSquares(100));
