<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <link rel="stylesheet" href="../css/register.css"> <!-- Link to external CSS if needed -->
</head>
<body>
	
	<c:if test=${not empty successMessege}>
		<h4 style="color:green"> ${successMessege} </h4>
		
	</c:if>

	<c:if test=${not empty errMessege}>
		<h4 style="color:red"> ${errMessege} </h4>
		
	</c:if>
		
	
    <form action="regForm" method="post">
    	<h3>Register Here</h3>
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" required><br>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required><br>

        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required><br>

        <label for="phone">Phone no:</label>
        <input type="number" name="phone" id="phone" required><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>
