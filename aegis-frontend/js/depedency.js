const API = "http://localhost:8072/api/dependency";

fetch(API)

.then(response => response.json())

.then(data => {

document.getElementById("assetName").innerHTML =
data.asset;

let html="";

data.dependencies.forEach(item=>{

html+=`<li>🔗 ${item}</li>`;

});

document.getElementById("dependencyList").innerHTML=
html;

});