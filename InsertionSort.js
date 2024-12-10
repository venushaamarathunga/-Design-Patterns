const InsertionSort = () => {
  let arr = [64, 34, 25, 12, 22, 11, 90];

  let sortedArr = sorting(arr);
  console.log(sortedArr);
};

const sorting = (arr) => {
  let j = 0,
    temp;
  let newArr = [];
  for (let i = 0; i < arr.length; i++) {
    j = i;
    while (j > 0 && arr[j - 1] > arr[j]) {
      temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;
      j--;
    }
  }
  return (newArr = [...arr]);
};

InsertionSort();
