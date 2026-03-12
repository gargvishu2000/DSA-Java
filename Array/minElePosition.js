const fs = require('fs');
const data = fs.readFileSync(0, 'utf8').trim().split(/\s+/).map(Number);

const n = data[0];
const a = data.slice(1, n + 1);



let minIndex=a.length-1;
let minValue=a[0];
for(let i=1;i<a.length;i++){
    if(a[i]<minValue){
         minValue=a[i];
         minIndex=i;
    }
}
minIndex++;
console.log(minValue +" "+ minIndex);
