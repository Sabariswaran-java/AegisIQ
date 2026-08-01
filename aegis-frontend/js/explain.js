const API = "http://localhost:8072/api/explain";

fetch(API)

.then(response => response.json())

.then(data => {

document.getElementById("action").innerHTML =
data.recommendedAction;

document.getElementById("reason1").innerHTML =
data.reason1;

document.getElementById("reason2").innerHTML =
data.reason2;

document.getElementById("reason3").innerHTML =
data.reason3;

document.getElementById("confidence").innerHTML =
data.confidence;

document.getElementById("downtime").innerHTML =
data.estimatedDowntime;

});