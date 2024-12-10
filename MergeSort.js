const MergeSort = () => {
  let arr = [73, 57, 49, 99, 133, 20, 1, 64, 34, 25, 12, 22, 11, 90];
  sorting(arr, 0, arr.length - 1);
  console.log("Sorted Array:", arr);
};

const sorting = (arr, l, r) => {
  if (l < r) {
    let mid = Math.floor((l + r) / 2);
    sorting(arr, l, mid);
    sorting(arr, mid + 1, r);
    return merge(arr, l, mid, r);
  }
};

const merge = (arr, l, m, r) => {
  let n1 = m - l + 1;
  let n2 = r - m;

  let ar1 = new Array(n1);
  let ar2 = new Array(n2);

  for (let i = 0; i < n1; i++) ar1[i] = arr[l + i];
  for (let i = 0; i < n2; i++) ar2[i] = arr[m + 1 + i];

  let k = l,
    i = 0,
    j = 0;

  while (i < n1 && j < n2) {
    if (ar1[i] <= ar2[j]) {
      arr[k] = ar1[i];
      i++;
    } else {
      arr[k] = ar2[j];
      j++;
    }
    k++;
  }

  while (i < n1) {
    arr[k] = ar1[i];
    i++;
    k++;
  }

  while (j < n2) {
    arr[k] = ar2[j];
    j++;
    k++;
  }
  //   console.log([...arr]);
  //   return (newArr = [...arr]);
  //   console.log(arr);
};

MergeSort();
