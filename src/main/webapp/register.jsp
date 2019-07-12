<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register Here</title>
</head>
<body>

<center><h1>SIGNUP</h1></center>

<p></p>

<a href="/save"></a>

    <table>
        <form action="/saveuser" method="get">

            <input type="text" placeholder="UserName" name="username" required\>
            <input type="password" placeholder="PASSWORD" name="password" required/>
            <input type="text" placeholder="ROLE" name="role" required/>
            <input type="submit" value="SAVE" />

        </form>
    </table>

</body>
</html>