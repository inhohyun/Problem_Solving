// copilot: disable
const Input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n");

const N = parseInt(Input[0]);
// console.log(N);

let arr = Input[1].split(" ").map(Number);

// console.log(arr);

//연산자들
let operator = Input[2].split(" ").map(Number);

// console.log(operator);
let max = Number.MIN_SAFE_INTEGER;
let min = Number.MAX_SAFE_INTEGER;
const dfs = (index, result, add, sub, mul, div) => {
  if (index === N) {
    max = Math.max(max, result);
    min = Math.min(min, result);
    return;
  }

  if (add) {
    dfs(index + 1, result + arr[index], add - 1, sub, mul, div);
  }

  if (sub) {
    dfs(index + 1, result - arr[index], add, sub - 1, mul, div);
  }

  if (mul) {
    dfs(index + 1, result * arr[index], add, sub, mul - 1, div);
  }

  if (div) {
    dfs(index + 1, parseInt(result / arr[index]), add, sub, mul, div - 1);
  }
};
dfs(1, arr[0], operator[0], operator[1], operator[2], operator[3]);
if (max === -0) max = 0;
if (min === -0) min = 0;
console.log(max);
console.log(min);
