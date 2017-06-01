function isPalindrome(num) {
  var strNum = num.toString(); // rude number to string conversion
  for (var i = 0; i < strNum.length; i++) {
    if(strNum.charAt(i) != strNum.charAt(strNum.length - i - 1))
      return false
  }
  return true;
}

var lowLimit = 100;
var highLimit = 999;

function getProduct() {
  var maxProduct = 0;
  
  for(var i = highLimit; i >= lowLimit ; i--) {
    for (var j = highLimit; j >= lowLimit; j--) {
      var num = i * j;
      if(isPalindrome(num) && num > maxProduct)
        maxProduct = num;
    }
  }

  return maxProduct;
}

console.log(getProduct());
