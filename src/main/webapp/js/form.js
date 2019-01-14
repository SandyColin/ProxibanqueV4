// var title = document.getElementById("title")
var title = $("#startingDate")[0];
var content = $("#provisionalDate")[0];

function validateForm(event) {
	console.log("Evenement de soumission du form : ", event);
	if (!startingDate.value || !provisionalDate.value) {
		event.preventDefault();
		alert("Veuillez remplir les champs avant de valider");
	}
}