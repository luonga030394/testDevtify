<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>

	<div class="container">
		<div class="row">
			<div class="col-sm-2"></div>

			<div class="col-sm-8">

				<div class="row">
					<c:forEach items="${listP}" var="o">
						<div class="col-12 col-md-6 col-lg-4">
							<div >
								<img class="card-img-top" src="${o.image}" alt="Card image cap">
								<div class="card-body">
									<h6 class="card-title show_txt">
										<a href="detail?pid=${o.id }" title="View Product">${o.title}</a>
									</h6>



								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</body>