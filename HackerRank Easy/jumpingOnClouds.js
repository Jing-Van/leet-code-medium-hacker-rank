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

// Complete the jumpingOnClouds function below.
function jumpingOnClouds(c) {
  let minNumberOfSteps = 0;
  let i =0; 
  
  while ( i < c.length - 1){
    
    if (c[i + 1] === 1){ // if next index value is 1 thunder cloud!! then jump two
      i += 2;
      minNumberOfSteps += 1;
      console.log("i at the double jump over thundercloud",i)
    } else if(c[i + 1] === 0 && c[i + 2] === 0){
      i += 2;
      minNumberOfSteps += 1;
      console.log("i at the double jump over dub zeros",i);
    } else if (c[i + 1] === 0 && c[i + 2] === 1){
      i += 1;
      minNumberOfSteps += 1;
      console.log("i at the single jump over thunder cloud",i);
    } else if (c[i + 1] === 0){
      i+= 1;
      minNumberOfSteps += 1;
    }
    
  }
  return minNumberOfSteps;

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine(), 10);

    const c = readLine().split(' ').map(cTemp => parseInt(cTemp, 10));

    let result = jumpingOnClouds(c);

    ws.write(result + "\n");

    ws.end();
}
