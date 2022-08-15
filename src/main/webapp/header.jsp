
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--begin of menu-->
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
	<div class="container">
		<a class="navbar-brand" href="#">Kênh 14</a>


		<div class="collapse navbar-collapse justify-content-end"
			id="navbarsExampleDefault">
			<ul class="navbar-nav m-auto">

				<li class="nav-item"><a class="nav-link" href="#"> TV Show
				</a></li>


				<li class="nav-item"><a class="nav-link" href="#"> Đời Sống</a></li>


				<li class="nav-item"><a class="nav-link" href="login.jsp">Học
						Đường</a>
				<li class="nav-item"><a class="nav-link" href="Signup.jsp">Xã
						Hội</a>
			</ul>

			<form action="search" method="post" class="form-inline my-2 my-lg-0">
				<div class="input-group input-group-sm">
					<input  name="txt" type="text" class="form-control"
						aria-label="Small" aria-describedby="inputGroup-sizing-sm"
						placeholder="Search...">
					<div class="input-group-append">
						<button type="submit" class="btn btn-secondary btn-number">
							<i class="fa fa-search"></i>
						</button>
					</div>
				</div>
				
			</form>
		</div>
	</div>
</nav>

<!--end of menu-->