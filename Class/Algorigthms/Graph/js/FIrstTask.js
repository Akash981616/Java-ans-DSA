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