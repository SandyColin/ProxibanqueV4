<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link href="css/surveys.css" rel="stylesheet">

</head>

<body id="page-top">

	<!-- Header -->
	<header class="masthead">
		<div class="container">
			<div class="intro-text"
				style="padding-top: 150px; padding-bottom: 200px;">
				<div class="intro-lead-in">Bienvenue sur le syst�me
					d'information</div>
				<div class="intro-heading text-uppercase">PROXIBANQUE</div>
			</div>
		</div>
	</header>

	<!-- Affichage des clients -->
	<section id="surveys-display">
		<h1 class="page-title">Liste des sondages</h1>
		<div class="survey-display">
			
			<table class="table table-hover">
				<thead>
					<tr>
						<th class="liste">Date de d�but de sondage</th>
						<th class="liste">Date de fin de sondage</th>
						<th class="listecompte">Nombre d'avis Positifs</th>
						<th class="listecompte">Nombre d'avis n�gatifs</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="response" items="${responseSurvey}">

						<tr>
							<td class="listesurveys">${response.openDate}</td>
							<td class="listesurveys">${response.endDate}</td>
							<td class="listesurveys">${response.nbPos}</td>
							<td class="listesurveys">${response.nbNeg}</td>


						</tr>
					</c:forEach>
				</tbody>
			</table>

			<div>
				<a href="index.html">
					<button class="btn btn-warning">Revenir � l'accueil</button>
				</a>
			</div>
		</div>
	</section>
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