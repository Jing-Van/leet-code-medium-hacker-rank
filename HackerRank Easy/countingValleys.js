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
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

function countingValleys(steps, path) {
    // Write your code here
  if (isNaN(steps)) throw new TypeError('first input is NaN!');
  if (typeof path !== 'string') throw new TypeError('second input is not a string!');

  let elevation = 0;
  let valleysTraversed = 0;
  for (let i = 0; i < steps; i++) {
    if (path[i] === 'D') {
      --elevation;
    }
    else if (path[i] === 'U') {
      if (++elevation === 0) valleysTraversed++;
    }
  }

  return valleysTraversed;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const steps = parseInt(readLine().trim(), 10);

    const path = readLine();

    const result = countingValleys(steps, path);

    ws.write(result + '\n');

    ws.end();
}
