//import os from 'os';

function getos()
{

/*var detectedOS = "Unknown OS";

if (navigator.appVersion.indexOf("Mac") != -1) 
    detectedOS = "MacOS";

if (navigator.appVersion.indexOf("Win") != -1) 
    detectedOS = "Windows";

if (navigator.appVersion.indexOf("Linux") != -1) 
    detectedOS = "Linux";
*/
//console.log(os.arch());

let str=navigator.platform
    
    document.getElementById("htag").innerHTML=str;
}