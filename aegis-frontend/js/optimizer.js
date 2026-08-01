const API = "http://localhost:8072/api/optimizer";

fetch(API)

.then(response => response.json())

.then(data => {

document.getElementById("strategy").innerHTML =
data.deploymentStrategy;

document.getElementById("server").innerHTML =
data.recommendedServer;

document.getElementById("risk").innerHTML =
data.expectedRisk;

document.getElementById("downtime").innerHTML =
data.estimatedDowntime;

document.getElementById("recovery").innerHTML =
data.estimatedRecovery;

document.getElementById("confidence").innerHTML =
data.confidence;

});