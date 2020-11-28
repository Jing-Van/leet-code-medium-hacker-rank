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

// Complete the equalizeArray function below.
function equalizeArray(arr) {

    let mostCommonHash = {};
    // map array to object key value pairs
    for (let i=0; i<arr.length; i++){
        if (mostCommonHash[arr[i]] === undefined){
        mostCommonHash[arr[i]] = 1;
        } else {
        mostCommonHash[arr[i]] += 1 
        }
    }
    // get max value in object 
    let valuesOfObject = Object.values(mostCommonHash);
    let max = Math.max(...valuesOfObject);

    // return the .length of the array - max which will give you number of deletions needed
    let numberOfDeletions = arr.length - max;
    return numberOfDeletions; 

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine(), 10);

    const arr = readLine().split(' ').map(arrTemp => parseInt(arrTemp, 10));

    let result = equalizeArray(arr);

    ws.write(result + "\n");

    ws.end();
}
