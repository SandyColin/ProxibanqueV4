<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>ProxiBanque SI</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="css/agency.min.css" rel="stylesheet">
<link href="css/form.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body id="page-top">

	<!-- Header -->
	<header class="masthead">
		<div class="container">
			<div class="intro-text"
				style="padding-top: 150px; padding-bottom: 200px;">
				<div class="intro-lead-in">Bienvenue sur le système
					d'information</div>
				<div class="intro-heading text-uppercase">PROXIBANQUE</div>
			</div>
		</div>
	</header>
	<section>
		<form:form modelAttribute="survey" method="post" action="form.html"
			onsubmit="validateForm(event)">
			<div class="form-group">
				<label for="startingDate">Date de démarrage :</label>

				<!-- Utilisation d'un tag Spring pour lier un champ de saisie avec un 
				attribut de l'objet (classe Article) défini dans le modelAttribute du form:form. -->
				<form:input type="date" id="startingDate" path="startingDate"
					class="form-control" />
			</div>
			<div class="form-group">
				<label for="provisionalDate">Date de fin prévisionnelle :</label>
				<!-- Utilisation d'un tag Spring pour lier un champ de saisie avec un 
				attribut de l'objet (classe Article) défini dans le modelAttribute du form:form. -->
				<form:input type="date" id="provisionalDate" path="provisionalDate"
					class="form-control"></form:input>
			</div>
			<button class="btn btn-warning">Valider</button>
			<a href="index.html">Retour à l'accueil</a>
		</form:form>
	</section>
	<script src="js/form.js"></script>
	<footer>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<span class="copyright">Copyright &copy; Proxibanque 2018</span>
				</div>
				<div class="col-md-4">
					<ul class="list-inline quicklinks">
						<li class="list-inline-item"><a href="#">Privacy Policy</a></li>
						<li class="list-inline-item"><a href="#">Terms of Use</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>

</body>
</html>