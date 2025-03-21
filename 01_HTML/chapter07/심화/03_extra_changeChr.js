// 숫자를 입력받아 한글로 변환하는 함수를 작성하세요.

// 예시:
// numberToKorean(1234) => "일천이백삼십사"
// numberToKorean(5000) => "오천"
// numberToKorean(10200) => "일만이백"

// 조건:
// - 1 ~ 99999 사이의 숫자 처리  (아닐경우 범위를 벗어난 숫자입니다. (1~99999) 출력)
// - 0은 표시하지 않음 (삼천공백십 -> 삼천십)
// - 단위: 만, 천, 백, 십
// - 숫자: 일, 이, 삼, 사, 오, 육, 칠, 팔, 구
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = '';

rl.question('값을 입력하세요 : ', (answer) => {
  input = answer;

  rl.close();
});

let tenTh = '';
let th = '';
let hund = '';
let ten = '';
let num = '';

let temp;
let quotient;
let rest;
let result;
let count = [10000, 1000, 100, 10, 1];

rl.on('close', () => {
  for (let i of count) {
    quotient = Math.floor(input / i);
    rest = input % i;
    switch (quotient) {
      case 1:
        result = '일';
        break;
      case 2:
        result = '이';
        break;
      case 3:
        result = '삼';
        break;
      case 4:
        result = '사';
        break;
      case 5:
        result = '오';
        break;
      case 6:
        result = '육';
        break;
      case 7:
        result = '칠';
        break;
      case 8:
        result = '팔';
        break;
      case 9:
        result = '구';
        break;
    }
    input = rest;

    if (quotient == 0) {
      continue;
    }
    if (result != undefined) {
      if (i == 10000) {
        tenTh = result + '만';
      } else if (i == 1000) {
        th = result + '천';
      } else if (i == 100) {
        hund = result + '백';
      } else if (i == 10) {
        ten = result + '십';
      } else {
        num = result;
      }
    }
    if (rest == 0) {
      break;
    }
  }
  console.log(tenTh + th + hund + ten + num);

  process.exit();
});

// for (let i of [10000, 1000, 100, 10]) {
//   console.log(Math.floor(1234 / i));
//   console.log(1234 % i);
// }
