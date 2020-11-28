// https://codingwithmanny.medium.com//
// how-to-solve-the-alternating-characters-code-challenge-160b37ef2ee9

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

// Complete the alternatingCharacters function below.
function alternatingCharacters(s) {

     let result = 0;
 
     if (s.length >= 1 && s.length <= 100000) {
          let arr = s.split(''); // ['A','A','A','B','B','B']
          
          let past = arr[0]; // 'A'
          
          arr = arr.filter((item, key) => {
               if (item !== past && key !== 0) {
                    // redefine past as the current item
                    past = item;
                    // 'A' != 'A', 0 !== 0 = false
                    // 'A' != 'A', 1 !== 0 = false
                    // 'A' != 'A', 2 !== 0 = false
                    // 'B' != 'A', 3 !== 0 = true
                    // 'B' != 'B', 4 !== 0 = false
                    // 'B' != 'B', 5!== 0 = false 
                    return item; 
               }  
          });
          // ['B']
          result = s.length - [ s.charAt(0), ...arr ].length;
          // 'AAABBB'.length - ['A', 'B'].length
     }
     
     return result;
     // 2
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const q = parseInt(readLine(), 10);

    for (let qItr = 0; qItr < q; qItr++) {
        const s = readLine();

        let result = alternatingCharacters(s);

        ws.write(result + "\n");
    }

    ws.end();
}
