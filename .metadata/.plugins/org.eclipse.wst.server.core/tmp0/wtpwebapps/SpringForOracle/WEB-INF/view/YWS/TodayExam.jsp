<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
=========================================================
* Paper Dashboard 2 - v2.0.1
=========================================================

* Product Page: https://www.creative-tim.com/product/paper-dashboard-2
* Copyright 2020 Creative Tim (https://www.creative-tim.com)

Coded by www.creative-tim.com

 =========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
-->
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="/resources/assets/img/apple-icon.png">
<link rel="icon" type="image/png"
	href="/resources/assets/img/favicon.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Today Highlight English</title>
<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no'
	name='viewport' />
<!--     Fonts and icons     -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200"
	rel="stylesheet" />
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
	rel="stylesheet">
<!-- CSS Files -->
<link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" />
<link href="/resources/assets/css/paper-dashboard.css?v=2.0.1"
	rel="stylesheet" />
<!-- CSS Just for demo purpose, don't include it in your project -->
<link href="/resources/assets/demo/demo.css" rel="stylesheet" />
</head>

<body class="">
	<div class="wrapper ">
		<%@ include file="/WEB-INF/view/sidebar.jsp"%>
		<div class="main-panel">
			<!-- Navbar -->
			<nav
				class="navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent">
				<div class="container-fluid">
					<div class="navbar-wrapper">
						<div class="navbar-toggle">
							<button type="button" class="navbar-toggler" id="navbar-toggler">
								<span class="navbar-toggler-bar bar1"></span> <span
									class="navbar-toggler-bar bar2"></span> <span
									class="navbar-toggler-bar bar3"></span>
							</button>
						</div>
						<a class="navbar-brand" href="javascript:;">Today Highlight
							English</a>
					</div>
					<div class="collapse navbar-collapse justify-content-end"
						id="navigation">
						<form>
							<div class="input-group no-border">
								<input type="text" value="" class="form-control"
									placeholder="Search...">
								<div class="input-group-append">
									<div class="input-group-text">
										<i class="nc-icon nc-zoom-split"></i>
									</div>
								</div>
							</div>
						</form>
						<ul class="navbar-nav">
							<li class="nav-item"><a class="nav-link btn-magnify"
								href="javascript:;"> <i class="nc-icon nc-layout-11"></i>
									<p>
										<span class="d-lg-none d-md-block">Stats</span>
									</p>
							</a></li>
							<li class="nav-item btn-rotate dropdown"><a
								class="nav-link dropdown-toggle" href="http://example.com"
								id="navbarDropdownMenuLink" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false"> <i
									class="nc-icon nc-bell-55"></i>
									<p>
										<span class="d-lg-none d-md-block">Some Actions</span>
									</p>
							</a>
								<div class="dropdown-menu dropdown-menu-right"
									aria-labelledby="navbarDropdownMenuLink">
									<a class="dropdown-item" href="#">Action</a> <a
										class="dropdown-item" href="#">Another action</a> <a
										class="dropdown-item" href="#">Something else here</a>
								</div></li>
							<li class="nav-item"><a class="nav-link btn-rotate"
								href="javascript:;"> <i class="nc-icon nc-settings-gear-65"></i>
									<p>
										<span class="d-lg-none d-md-block">Account</span>
									</p>
							</a></li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- End Navbar -->
			<!-- 뉴스 기사 삽입. -->
			<div class="content">
				<div class="card">
					<div class="card-header">
						<h4 class="mt-0 mb-0 text-center"><b>The New York Times</b></h4>
					</div>
					<hr>
					<div class="card-body">
						<h6 style="color:orange">Today Exam</h6>
						<br>
						<h3 class="card-text"><b>Pros and Cons of 5G Technology</b></h3>
						<h6 style="color:grey">Writer's name</h6>
						<h6 style="color:grey">2020, Dec 11</h6>
						
						
						<p class="m-4" style="font-size:1.5em">
						Self-diriving cars, smart cities, fully 
						connected homes, robots. This is the future and it will 2be powered
						by 5G. The G stands for 3generation as in next <input type="textbox" value="빈 칸에 들어갈 알맞은 단어는?"> wireless network
						and it's going to be fast. 
						<!--  The G stands for 3generation as in next <b>generation</b> wireless network
						and it's going to be fast. About 10 times faster than 4G network on your phone
						right now. Today it takes about six minutes to download a 3D movies with 4G.
						With 5G, it will be 30 seconds. but 5G is about more than just super fast downloads
						and fewer dropped calls, really about connecting the 4 Internet of things. All those... -->
						</p>
						
						<hr>
						
						<br>
						<h6 style="color:orange">Answer</h6>
						<br>
						<!-- 1. Submit하면 결과 창으로 문제를 전송.
							 2. Submit하면 바로 결과를 보여주고 이동. -->
						<input type="textbox">
						<br><input type="submit">
					</div>
				</div>
			<!-- 뉴스 기사 끝. -->
			<!-- 다음으로 넘어가는 버튼 만들기  -->
			<div>
			<input style="float:right;" class="btn btn-outline-warning" type="button" value="Next"  onclick="location='YWS/TodayRecord.do'">
			</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
			
		
			<!-- --------------------------------------------------------------------------- -->
			<!-- footer -->
			<footer class="footer footer-black  footer-white ">
				<div class="container-fluid">
					<div class="row">
						<nav class="footer-nav">
							<ul>
								<li><a href="https://www.creative-tim.com" target="_blank">Creative
										Tim</a></li>
								<li><a href="https://www.creative-tim.com/blog"
									target="_blank">Blog</a></li>
								<li><a href="https://www.creative-tim.com/license"
									target="_blank">Licenses</a></li>
							</ul>
						</nav>
						<div class="credits ml-auto">
							<span class="copyright"> © <script>
								document.write(new Date().getFullYear())
							</script>, made with <i class="fa fa-heart heart"></i> by Creative Tim
							</span>
						</div>
					</div>
				</div>
			</footer>
		</div>
	</div>
	<!--   Core JS Files   -->
	<script src="/resources/assets/js/core/jquery.min.js"></script>
	<script src="/resources/assets/js/core/popper.min.js"></script>
	<script src="/resources/assets/js/core/bootstrap.min.js"></script>
	<script
		src="/resources/assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
	<!--  Google Maps Plugin    -->
	<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
	<!-- Chart JS -->
	<script src="/resources/assets/js/plugins/chartjs.min.js"></script>
	<!--  Notifications Plugin    -->
	<script src="/resources/assets/js/plugins/bootstrap-notify.js"></script>
	<!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
	<script src="/resources/assets/js/paper-dashboard.min.js?v=2.0.1"
		type="text/javascript"></script>
	<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
	<script src="/resources/assets/demo/demo.js"></script>
	<script>
		$(document).ready(function() {
			// Javascript method's body can be found in assets/assets-for-demo/js/demo.js
			demo.initChartsPages();
		});

		$("#navbar-toggler").on('click', function() {
			if ($(this).hasClass("toggled")) {
				$(this).removeClass("toggled");
				$("html").first().removeClass("nav-open");
			} else {
				$(this).addClass("toggled");
				$("html").first().addClass("nav-open");

			}

		})
	</script>
</body>

</html>
