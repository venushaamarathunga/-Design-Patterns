const SelectionSort = () => {
  let arr = [73, 57, 49, 99, 133, 20, 1, 64, 34, 25, 12, 22, 11, 90];
  let sortedArr = sorting(arr);
  console.log(sortedArr);
};

const sorting = (arr) => {
  let min_index, temp;

  for (let i = 0; i < arr.length - 1; i++) {
    min_index = i;
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[min_index]) {
        min_index = j;
      }
    }
    temp = arr[min_index];
    arr[min_index] = arr[i];
    arr[i] = temp;
  }
  return (newArr = [...arr]);
};

SelectionSort();
