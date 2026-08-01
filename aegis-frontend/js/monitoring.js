const API="http://localhost:8072/api/monitoring";

fetch(API)

.then(response=>response.json())

.then(data=>{

let table="";

data.forEach(asset=>{

table+=`

<tr>

<td>${asset.assetName}</td>

<td>${asset.cpuUsage}%</td>

<td>${asset.memoryUsage}%</td>

<td>${asset.healthStatus}</td>

</tr>

`;

});

document.getElementById("monitorTable").innerHTML=table;

});