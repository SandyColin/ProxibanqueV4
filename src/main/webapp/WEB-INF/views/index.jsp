<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Proxibanque SI</title>
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
</head>
<body>

	<section id="index-display">
		<h1 class="page-title"></h1>
		<div>
			<c:if test="${survey.isActive }">
			</c:if>
		</div>
		<div class="client-display">

			<div class="button-container">
				<div>
					<a href="surveys.html">
						<button class="button">Afficher les donn�es des sondages</button>
					</a>
				</div>
				<div>
					<a href="form.html">
						<button class="button">Cr�er un sondage</button>
					</a>
				</div>
				<div>
					<a href="close.html?id= ${survey.id}">
						<button class="button">Cloturer un sondage</button>
					</a>
				</div>

			</div>
		</div>

	</section>
	<section class="bg-light" id="team">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2 class="section-heading text-uppercase">Sexy &amp; Chocolat
						Dream Team</h2>
					<h3 class="section-subheading text-muted">D�couvrez notre
						superbe �quipe !</h3>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
						<h4>Jessica Di Marco</h4>
						<p class="text-muted">Lead Designer</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/2.jpg" alt="">
						<h4>Sarah Ourabah</h4>
						<p class="text-muted">Lead CandySeller</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/3.jpg" alt="">
						<h4>Axel Co�non</h4>
						<p class="text-muted">Lead Grifter</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
						<h4>Leila Bouzidi</h4>
						<p class="text-muted">Lead Conceptor</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/2.jpg" alt="">
						<h4>Vincent Darcq</h4>
						<p class="text-muted">Lead Development</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/3.jpg" alt="">
						<h4>Marie Boulez</h4>
						<p class="text-muted">Lead Chocolate Eater</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
						<h4>Quentin Jouhault</h4>
						<p class="text-muted">Lead Tech</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/2.jpg" alt="">
						<h4>Bixente Olasaguirre</h4>
						<p class="text-muted">Lead Recatcher</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/3.jpg" alt="">
						<h4>Omar Boughanem</h4>
						<p class="text-muted">Lead Couscous Cooker</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
						<h4>Julien Chapel</h4>
						<p class="text-muted">Lead Granny</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/2.jpg" alt="">
						<h4>Sidney Scelli</h4>
						<p class="text-muted">Lead Dreamer</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/3.jpg" alt="">
						<h4>Benoit Darenne</h4>
						<p class="text-muted">Lead Married</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
						<h4>Ahmed Belmouden</h4>
						<p class="text-muted">Lead Tachter</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/2.jpg" alt="">
						<h4>Sandy Colin</h4>
						<p class="text-muted">Lead Lego Builder</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="team-member">
						<img class="mx-auto rounded-circle" src="img/team/2.jpg" alt="">
						<h4>Nexpresso</h4>
						<p class="text-muted">Lead Coffee Awakener!</p>
						<ul class="list-inline social-buttons">
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-twitter"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-facebook-f"></i>
							</a></li>
							<li class="list-inline-item"><a href="#"> <i
									class="fab fa-linkedin-in"></i>
							</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-8 mx-auto text-center">
					<p class="large text-muted">Notre team est � votre �coute,
						n'h�sitez pas � nous contacter.</p>
				</div>
			</div>
		</div>
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