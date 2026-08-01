 document.getElementById("change").textContent = localStorage.getItem("selectedChange") || "Database Upgrade";
        setTimeout(() => document.getElementById("bar").style.width = "100%", 300);



 function deploy() {
            alert("Deployment approved. AegisIQ has initiated the recommended deployment strategy.");
        }

        function stopDeployment() {
            alert("Deployment stopped. No infrastructure changes will be made.");
        }


function selectChange(change) {
            localStorage.setItem("selectedChange", change);
            window.location.href = "decision-twin.html";
        }