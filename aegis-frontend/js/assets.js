console.log("Asset JS Loaded");


const table = document.getElementById("assetTable");


assets.forEach(asset => {

    table.innerHTML += `

    <tr>

        <td>${asset.assetName}</td>

        <td>${asset.assetType}</td>

        <td>${asset.cpuUsage}%</td>

        <td>${asset.memoryUsage}%</td>

        <td>${asset.location}</td>

        <td>${asset.status}</td>

    </tr>

    `;

});