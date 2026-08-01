const API = "http://localhost:8072";

/* Dashboard Summary */

fetch(API + "/api/dashboard")
.then(response => response.json())
.then(data => {

    document.getElementById("totalAssets").innerHTML =
    data.totalAssets;

    document.getElementById("activeAssets").innerHTML =
    data.activeAssets;

    document.getElementById("cpuAverage").innerHTML =
    data.cpuAverage + "%";

    document.getElementById("memoryAverage").innerHTML =
    data.memoryAverage + "%";

    document.getElementById("warningAssets").innerHTML =
    data.warningAssets;

    document.getElementById("criticalAssets").innerHTML =
    data.criticalAssets;

    document.getElementById("systemHealth").innerHTML =
    data.systemHealth;

});


/* Monitoring Table */

fetch(API + "/api/monitoring")
.then(response => response.json())
.then(data => {

    let table="";

    data.forEach(asset=>{

        table+=`

        <tr>

            <td>${asset.assetName}</td>

            <td>${asset.healthStatus}</td>

            <td>${asset.cpuUsage}%</td>

            <td>${asset.memoryUsage}%</td>

        </tr>

        `;

    });

    document.getElementById("activityTable").innerHTML=table;

});