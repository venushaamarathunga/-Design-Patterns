const BubbleSort = () => {
  let arr = [64, 34, 25, 12, 22, 11, 90];

  let array = sorting(arr);

  console.log("Sorted array:");
  console.log(array);
};

const sorting = (arr) => {
  let swap;
  let stateAtRow = [];
  for (let i = 0; i < arr.length; i++) {
    swap = false;
    for (let j = 0; j < arr.length - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        swap = true;
      }
    }
    if (i + 1 === arr.length) {
      stateAtRow = [...arr];
    }

    if ((swap = false)) break;
  }

  return stateAtRow;
};

BubbleSort();
