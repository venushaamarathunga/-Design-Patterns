// sort array
// get length after count 0 and print it after print 1
// two point approch

function Rearang() {
  let arr = [1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1];
  let i = 0;
  let j = arr.length - 1;

  while (i < j) {
    if (arr[i] === 1 && arr[j] === 0) {
      let temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    } else if (arr[i] === 0) i++;
    else if (arr[j] === 1) j--;
    else {
      i++;
      j--;
    }
  }

  console.log(arr);
}

Rearang();
