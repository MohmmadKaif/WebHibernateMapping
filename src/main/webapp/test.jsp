<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
    crossorigin="anonymous">

 <link rel="stylesheet" type="text/css" href="test.css">
</head>
<body>

 <!-- This is our navigation bar.... -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">InterviewExperience</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item">
						<a class="nav-link " aria-current="page" href="home.html">Home</a>
					</li>
					<li class="nav-item">
						<a class="nav-link " href="">About Us</a>
					</li>
					<li class="nav-item">
						<a class="nav-link " href="">Contact Us</a>
					</li>
					<li class="nav-item ">
						<a class="nav-link right_shift active" href="ShareExp.html">Share Experience</a>
					</li>
					<li class="nav-item">
						<a class="nav-link active" href="">Access Experience</a>
					</li>
					
					  <li class="nav-item">
              <a class="nav-link active" href="">Show Companies</a>
            </li>
				</ul>
				
			</div>
		</div>
	</nav>
  <!-- Navbar ends here... -->





<div class="cominfo">

<div  class="infoholder">  

<div class="comname">
Company-Name:  Amazon.
</div>
<div class="comid">
    Company-id:  com1000.
</div>
</div>
</div>



<div class="main">
<div class="holder">



 
 <c:forEach var="i"  begin="1"  end="9">
<div class="cont">
    <div class="intro">
      Name:Mohammad Kaif Altaf Sayyed.
      <br>
      <br>
      Visit Date:25 March 2020.
      <br>
      CTC:40lpa.
      <br>
      No Of Rounds:4.
      <br>
      Posted On: 22 Feb 2022
      <br>
</div>
    <div class="exp">
     <p>
        Lorem ipsum dolor sit amet consectetur adipisicing, elit. Esse accusamus vel, ducimus eos, quisquam hic sit perferendis illo magnam. Quod expedita quis fugiat laboriosam suscipit placeat soluta odio ex id, dicta eius voluptatibus, voluptatum consequuntur debitis non nisi aut temporibus corporis rerum.
     <br>
     <br>
     <br>
     <br>
     Delectus labore exercitationem minima reprehenderit dolorem neque magni deleniti atque nisi debitis laudantium eaque rerum voluptatum sapiente consectetur, cum repellat, nam recusandae, velit. Atque rem ratione consequatur, eveniet sed illo minus. At animi eos delectus quam sed esse ipsa laudantium temporibus? Vero temporibus perferendis et magnam, architecto, minima in modi reprehenderit dolorem facere recusandae nostrum necessitatibus quae nisi, deserunt aut id. Vitae, animi dolorum maiores, est mollitia aliquid eveniet quasi, nulla placeat laborum eius. Pariatur eaque aliquam, facere animi quas omnis commodi a quasi? Quasi, nulla ex delectus totam pariatur, ut dolore, nisi tempore incidunt impedit nihil maxime quia unde eos quibusdam explicabo sequi dicta recusandae! Quae cumque, natus voluptatibus nobis, eaque at tempora quia molestias et quas reprehenderit, sequi aliquid temporibus adipisci ab eum accusamus maiores. Nostrum, iure suscipit eaque dignissimos. Repudiandae esse optio voluptas, tempore dolores, nesciunt dolor cum nobis, laudantium vero perferendis accusamus odit saepe consequuntur blanditiis recusandae exercitationem praesentium perspiciatis enim officia possimus tempora! Deleniti quia omnis cumque, perferendis incidunt earum corrupti, eaque non mollitia saepe, unde dicta quisquam. Nobis animi debitis inventore ut laudantium ullam.
      <br>
      <br>
      <br>
      Iste voluptatem adipisci numquam praesentium, saepe deserunt, possimus ratione, laborum explicabo et est autem ex dignissimos veniam libero qui vel quam voluptas? Minima fugit atque pariatur expedita nulla non vero repellat itaque adipisci! Maxime ipsum iure, nostrum tempore incidunt quae voluptatum. Eveniet illo nam exercitationem repellendus repellat molestiae rerum, vero, temporibus incidunt fuga perspiciatis, impedit autem sapiente! Natus magnam quisquam aliquid qui, dolorum est sequi asperiores quae, optio unde enim odit corporis atque? Autem velit facere commodi veniam.
  </p>
    </div>

</div>
</c:forEach>  
  
</div>
</div>


</body>
</html>