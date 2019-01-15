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
<link href="css/index.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body id="page-top">

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
<<<<<<< HEAD


	<section>
=======
<<<<<<< HEAD
	<section id="index-display">
		<h1 class="page-title"></h1>

		<div>
			<c:if test="${survey.isActive}">
				<div>
					<a href="close.html?id= ${survey.id}">
						<button class="button">Cloturer le sondage en cours</button>
					</a>
				</div>
			</c:if>
			<c:if test="${survey.isActive }">
				<p>Le sondage n°${survey.id} est en cours</p>
			</c:if>
=======
	
		
		<section>
>>>>>>> 902e6c11dfcd8d4aab7898c9302db40eda66af31
		<div class="message">

			<c:if test="${not empty message }">
				<h4 style="font-weight:bold">${message} </h4>
			</c:if>
			<c:if test="${not empty survey }">
				<h2>Le sondage n°${survey.id} est en cours</h2>
			</c:if>
			<c:if test="${empty survey}">
				<h2>Pas de sondage en cours</h2>
			</c:if>
<<<<<<< HEAD
=======
			
			

>>>>>>> 15da8aa0810ef5c3069f4537bf73d2a022589b8a
>>>>>>> 902e6c11dfcd8d4aab7898c9302db40eda66af31
		</div>
		<br />


		<div class="button-container">
			<div>
				<a href="surveys.html">
					<button class="button">Afficher les données des sondages</button>
					<br>
				</a>
				
			</div>
			
			<c:if test="${empty survey}"> 
			
			<div>
				<a href="form.html">
					<button class="button">Créer un sondage</button>
				</a>
			</div>
			</c:if>
			<c:if test="${not empty survey}">
				<div>
					<a href="close.html?id=${survey.id}">
						<button class="button">Cloturer le sondage</button>
					</a>
				</div>
<<<<<<< HEAD
			</c:if>

		</div>

=======
<<<<<<< HEAD
=======
				<c:if test="${survey.isActive}">
					<div>
						<a href="close.html?id= ${survey.id}">
							<button class="button">Cloturer un sondage</button>
						</a>
					</div>
				</c:if>

>>>>>>> 15da8aa0810ef5c3069f4537bf73d2a022589b8a
			</div>
		
>>>>>>> 902e6c11dfcd8d4aab7898c9302db40eda66af31

	</section>

	<!-- Footer -->
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

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Contact form JavaScript -->
	<script src="js/jqBootstrapValidation.js"></script>
	<script src="js/contact_me.js"></script>

	<!-- Custom scripts for this template -->
	<script src="js/agency.min.js"></script>



</body>
</html>