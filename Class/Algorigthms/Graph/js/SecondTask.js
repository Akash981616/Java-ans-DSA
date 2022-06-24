//secontTask
const  findError=(str)=>{
    const insertAt = (str, sub, pos) => `${str.slice(0, pos)}${sub}${str.slice(pos)}`;
    string = str.replace(/\s+/g,' ').trim();
    var res = "";
    for(let i=0;i<string.length-1;i++){
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

var corrString=findError("John have an apple The sky is blue.  they get a coin")
document.getElementById("demo").innerHTML = corrString;
