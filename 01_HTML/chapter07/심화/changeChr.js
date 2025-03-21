function divide(num, digit) {
  let quotient = num / digit;
  let rest = num % digit;
  let chr = '';
  switch (digit) {
    case 10000:
      chr = '만';

    case 1000:
      chr = '천';

    case 100:
      chr = '백';

    case 10:
      chr = '십';
    case 1:
      chr = '일';
  }
  return [quotient, rest, chr];
}

let num = 1234;
digit = [10000, 1000, 100, 10, 1];
let change = '';
for (i of digit) {
  result = divide(num, digit,i);
  if (result[0] == 0) {
    continue;
  } else if (result[0] == 1) {
    result[0] = '일';
  } else if (result[0] == 2) {
    result[0] = '이';
  } else if (result[0] == 3) {
    result[0] = '삼';
  } else if (result[0] == 4) {
    result[0] = '사';
  } else if (result[0] == 5) {
    result[0] = '오';
  } else if (result[0] == 6) {
    result[0] = '육';
  } else if (result[0] == 7) {
    result[0] = '칠';
  } else if (result[0] == 8) {
    result[0] = '팔';
  } else if (result[0] == 9) {
    result[0] = '구';
  } else if (result[0] == 0) {
    continue;
  }
  num = result[1]
  change = 
}

//return [quotient, rest, chr];