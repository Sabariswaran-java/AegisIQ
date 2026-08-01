const API = "http://localhost:8072/api/scenario";

fetch(API)

.then(response => response.json())

.then(data => {

let html="";

data.forEach(item=>{

html += `

<div class="card">

<h2>${item.scenario}</h2>

<p><b>Risk :</b> ${item.risk}</p>

<p><b>Downtime :</b> ${item.downtime}</p>

</div>

`;

});

document.getElementById("scenarioContainer").innerHTML = html;

});