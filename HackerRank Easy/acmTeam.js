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

// Complete the acmTeam function below.
/*
4 5
10101
11100
11010
00101

5
2
*/
function acmTeam(topic) {

    let count = 1
    let max = 0
    let newArr = []
    for (let i = 0; i < topic.length - 1; i++) {
        for (let j = i + 1; j < topic.length; j++) {
            let temp = 0
            for (let k = 0; k < topic[i].length; k++) {
                if (topic[i][k] == '1' || topic[j][k] == '1') {
                    temp++
                }
                if (temp > max) {
                    max = temp
                    count = 1
                } else if (temp == max) {
                    count++
                }
            }
        }
    }
    newArr.push(max)
    newArr.push(count)
    return newArr
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nm = readLine().split(' ');

    const n = parseInt(nm[0], 10);

    const m = parseInt(nm[1], 10);

    let topic = [];

    for (let i = 0; i < n; i++) {
        const topicItem = readLine();
        topic.push(topicItem);
    }

    let result = acmTeam(topic);

    ws.write(result.join("\n") + "\n");

    ws.end();
}
