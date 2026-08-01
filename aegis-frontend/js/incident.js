const API = "http://localhost:8072/api/incidents";

fetch(API)

.then(response => response.json())

.then(data => {

let html = "";

data.forEach(item => {

html += `

<div class="card">

<h2>${item.incidentId}</h2>

<p><b>Asset :</b> ${item.asset}</p>

<p><b>Problem :</b> ${item.problem}</p>

<p><b>Solution :</b> ${item.solution}</p>

<p><b>Resolution Time :</b> ${item.resolutionTime}</p>

<p><b>Status :</b> ${item.status}</p>

</div>

`;

});

document.getElementById("incidentContainer").innerHTML = html;

});