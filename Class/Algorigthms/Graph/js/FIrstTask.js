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
document.getElementById("demo").innerHTML = ans;



const plusMinus = (num) => {
  let arr = num.toString().split('').map(num => parseInt(num));
  
  return plusMinusRec(arr, 0);

  function plusMinusRec(arr, target){
    if(arr.length == 1){
      if(arr[0] == target){
        return  ""
      } else {
        return "not possible";
      } 
    }

    let s1 = plusMinusRec(arr.slice(1), arr[0]);
    if(s1 != "not possible"){
      return "-" + s1;
    }
    let s2 = plusMinusRec(arr.slice(1), arr[0] * -1);
    if(s2 != "not possible"){
      return "+" + s2;
    }
    return "not possible";
  }  
}