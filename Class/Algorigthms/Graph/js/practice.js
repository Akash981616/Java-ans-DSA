var name = "Akash";
//curring infinite loop
function add(a) {
  return function (b) {
    if (b) return add(a + b);
    return a;
  };
}
console.log(add(1)(2)(3)(4)());

//closure
var sum = function (a, b, c) {
  return {
    getSum: function () {
      return a + b;
    },
    getReturn: function () {
      return b + c;
    },
  };
};
var store = sum(1, 2, 3);
console.log(store.getSum());
console.log(store.getReturn());

///caching 
let sum=0;
const cal=(n)=>{
    for(let i=0;i<n;i++){
     sum +=i;
    }
    return sum;
}
const memo=(fun)=>{
let cache={};
return function(...args){
    let n=args[0];
    if(n in cache){
        console.log("cache");
        return cache[n];
    }else{
        console.log("calcuating first Time");
        let result=fun(n);
        cache[n]=result;
        return result;''
    }

}
}
console.time();
const effiecnt=mem(cal);
console.log(effiecnt(5))
console.timeEnd();

// pulyfill map
let arr=[1,3,5,6,7,8,];
Array.prototype.myMap=function(cb){
    let temp=[];
    for(let i=0;i<this.length;i++){
        temp.push(cb(this[i],i,this));
    }
return temp;
}
const multiplyby3=arr.myMap((e,i,arr)=>{
    return e*3;
})
console.log(multiplyby3)

// first task
const reveresString=(string)=>{
  const words=string.split(' ')
  for(let i=0;i<words.length;i++){
    if(words[i].length>=5){
      words[i]=words[i].split("").reverse().join("");
  }}
  const newString=words.join(' ');
  return newString;
}
const ans=reveresString('Hey fellow warriors')
console.log(ans)

  const  findError=(str)=>{
    const insertAt = (str, sub, pos) => `${str.slice(0, pos)}${sub}${str.slice(pos)}`;
    string = str.replace(/\s+/g,' ').trim();
    var res = "";
    for(let i=0;i<string.length-1;i++)
    {
        if (string[i] == " " && string[i+1] == string[i+1].toUpperCase() && string[i-1] != ".") {
            res = insertAt(string, '.', i)
            string = res
        }
        if (string[i] == "." && string[i+2] == string[i+2].toLowerCase()){
            res = string.replace(string[i+2], string[i+2].toUpperCase());
            string = res}
            }
    if (string[string.length-1] != "."){
        res = insertAt(string, '.', string.length)
        string = res
    }
    return string
}
var corrString=findError("John have   an apple The sky is blue.  they get a coin")
document.getElementById("demo").innerHTML = corrString;

//100000 ml is 1Hl
const package = [
  { id: 1, title: "kegs", size: 30000 }, // size in milliliter
  { id: 2, title: "bottle", size: 330 }, // size in milliliter
  { id: 3, title: "can", size: 300 }, // size in milliliter
  { id: 4, title: "container", size: 1000000 }, // size in milliliter
];
const calcLiquorConsumption = (input) => {
  ({ packaging, orderFrequency, quantityPerOrder } = input);

  currentPackage = package[packaging - 1];

  totalVolume = orderFrequency * (quantityPerOrder / 100) * 48; //4 weeks * 12 months]

  (unitsPerOrderValue = (quantityPerOrder * 1000) / currentPackage.size),
    (result = {
      totalVolumeInYear: totalVolume,
      packaging: currentPackage.title + "s",
      unitsPerOrder: unitsPerOrderValue,
    });
  return result;
};

input = {
  id: 1,
  title: "Beer for a pub",
  packaging: 2, // id of the packaging
  orderFrequency: 3, // order frequency in weeks
  quantityPerOrder: 1000, // quantity per order in litres
  createdAt: 1589265720000,
};
console.log(calcLiquorConsumption(input));