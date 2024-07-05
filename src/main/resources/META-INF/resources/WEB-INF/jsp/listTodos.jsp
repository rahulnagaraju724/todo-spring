<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
  <head>
  	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <title>To Do Page</title>
  </head>
  <body>
  <div class="container">
    <div>Welcome to Todo - ${name}</div>
    <div>Your todos are</div>
    
    <table class="table">
	    <thead>
	     <tr>
	     	<th>id</th>
	     	<th>Description</th>
	     	<th>Due Date</th>
	     	<th> Is Done?</th>
	     </tr>
	    </thead>
	    
	    <tbody>
	    
 	    	<c:forEach items="${todos}" var="todo"> 
    	
	    		<tr>
	    			<td>${todo.id}</td>
	    			<td>${todo.description}</td>
	    			<td>${todo.dueDate}</td>
	    			<td>${todo.done}</td>
	    		</tr> 
	    		
	    	
    		</c:forEach>
	    
	    </tbody>
    	
    </table>
    </div>
    
   	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	
  </body>
</html>
