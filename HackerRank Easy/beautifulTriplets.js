'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the beautifulTriplets function below.
// input 
// 7 3
// 1 2 4 5 7 8 10
function beautifulTriplets(d, arr) {
  let i = 0
  let map = {}

  for (; i < arr.length; i += 1) {
    const el = arr[i]
    map[el] = map[el] ? map[el] += 1 : 1
  }

  i = arr[0]
  const max = arr[arr.length - 1]

  let beautifulCount = 0

  while (i <= max) {
    const j = i + d
    const k = j + d

    if (map[i] && map[j] && map[k]) {
      beautifulCount += Math.max(map[i], map[j], map[k])
    }

    i += 1
  }

  return beautifulCount

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nd = readLine().split(' ');

    const n = parseInt(nd[0], 10);

    const d = parseInt(nd[1], 10);

    const arr = readLine().split(' ').map(arrTemp => parseInt(arrTemp, 10));

    let result = beautifulTriplets(d, arr);

    ws.write(result + "\n");

    ws.end();
}
