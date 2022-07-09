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

