// sort array
// get length after count 0 and print it after print 1
// two point approch

function Plusminus() {
  let arr = [-1, 4, 2, -5, 8, -4, 2, -9, -3, 4, 1];
  let i = 0;
  let j = arr.length - 1;

  while (i <= j) {
    if (arr[i] < 0 && arr[j] > 0) {
      let temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    } else if (arr[i] > 0) i++;
    else if (arr[j] < 1) j--;
    else {
      i++;
      j--;
    }
  }

  console.log(arr);
}

Plusminus();
