const API = "http://localhost:8072/api/alerts";

fetch(API)

.then(response => response.json())

.then(data => {

    let table = "";

    data.forEach(alert => {

        let severityClass = alert.severity.toLowerCase();

        table += `

        <tr>

            <td>${alert.id}</td>

            <td>${alert.assetName}</td>

            <td>${alert.alertType}</td>

            <td class="${severityClass}">
                ${alert.severity}
            </td>

            <td>${alert.message}</td>

        </tr>

        `;

    });

    document.getElementById("alertTable").innerHTML = table;

});