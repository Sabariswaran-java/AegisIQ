const API="http://localhost:8072";

fetch(API+"/api/dashboard")

.then(response=>response.json())

.then(data=>{

document.getElementById("totalAssets").innerHTML=data.totalAssets;

document.getElementById("activeAssets").innerHTML=data.activeAssets;

document.getElementById("criticalAssets").innerHTML=data.criticalAssets;

document.getElementById("systemHealth").innerHTML=data.systemHealth;

});