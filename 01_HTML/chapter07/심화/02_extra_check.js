// checkBrackets

function checkBrackets(text) {
  let result = [];
  for (let i = 0; i < text.length; i++) {
    const char = text[i];
    if (char === '(' || char === '{' || char === '[') {
      result.push(char);
    } else if (char === ')' || char === '}' || char === '[') {
    }
  }
}

checkBrackets('(()){}[]');
checkBrackets('({)}');
checkBrackets('((()');
