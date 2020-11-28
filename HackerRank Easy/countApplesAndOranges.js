'use strict';

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

// Complete the countApplesAndOranges function below.
function countApplesAndOranges(s, t, a, b, apples, oranges) {

    //     // s t 7 11
    // 7-15=-8; 11-15=-4;
    // convert to relative distance
    // The fourth line contains 
    // space-separated integers denoting
    //  the respective distances that each apple falls from point .
    // The fifth line contains  space-separated integers
    // denoting the respective distances that each 
    // orange falls from point .
    const appleDistance = [s-a, t-a];
    const orangeDistance = [s-b, t-b];
    const applesInTheHouse = apples.filter(item => appleDistance[0] <= item && item <= appleDistance[1] );
    const orangesInTheHouse = oranges.filter(item => orangeDistance[0] <= item && item <= orangeDistance[1]);
    console.log(applesInTheHouse.length);
    console.log(orangesInTheHouse.length);
}

function main() {
    const st = readLine().split(' ');

    const s = parseInt(st[0], 10);

    const t = parseInt(st[1], 10);

    const ab = readLine().split(' ');

    const a = parseInt(ab[0], 10);

    const b = parseInt(ab[1], 10);

    const mn = readLine().split(' ');

    const m = parseInt(mn[0], 10);

    const n = parseInt(mn[1], 10);

    const apples = readLine().split(' ').map(applesTemp => parseInt(applesTemp, 10));

    const oranges = readLine().split(' ').map(orangesTemp => parseInt(orangesTemp, 10));

    countApplesAndOranges(s, t, a, b, apples, oranges);
}
