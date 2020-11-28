'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

function pickingNumbers(a) {
  let maxLength = 0;
  a.sort((a, b) => a - b);

  for (let i = 0; i < a.length; i++) {
    const tempArr = [a[i]];
    for (let j = i + 1; j < a.length; j++) {
      const valid = Math.abs(a[j] - a[j - 1]) <= 1;
      const validInsertion = Math.abs(a[j] - Math.min(...tempArr)) <= 1;
      if (valid && validInsertion) tempArr.push(a[j]);
      if (!valid || !validInsertion) break;
    }

    maxLength = tempArr.length > maxLength ? tempArr.length : maxLength;
    tempArr.length = 0;
  }

  return maxLength;

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    const a = readLine().replace(/\s+$/g, '').split(' ').map(aTemp => parseInt(aTemp, 10));

    const result = pickingNumbers(a);

    ws.write(result + '\n');

    ws.end();
}
