function MakePyramid(num) {
  let pyramid = '';

  for (let i = 1; i <= num; i++) {
    for (let space = 1; space <= num - i; space++) {
      pyramid += ' ';
    }

    for (let j = 1; j <= i; j++) {
      pyramid += i + ' ';
    }
    pyramid += '\n';
  }
  console.log(pyramid);
}

let num = 4;

MakePyramid(4);
