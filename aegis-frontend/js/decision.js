const API = "http://localhost:8072/api/decision";

fetch(API)

.then(response => response.json())

.then(data => {

document.getElementById("asset").innerHTML =
data.asset;

document.getElementById("cpu").innerHTML =
data.currentCpu + "%";

document.getElementById("risk").innerHTML =
data.risk;

document.getElementById("action").innerHTML =
data.recommendedAction;

document.getElementById("confidence").innerHTML =
data.confidence;

document.getElementById("downtime").innerHTML =
data.predictedDowntime;

});