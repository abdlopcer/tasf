<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>App Abd</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>

<body>
<%@include file="templates/nav.jsp"%>




<div class="container">

<div>
    <label class="error">${error}</label>
</div>

<form class="form" method="post" action="login">

<table>
    <tr>
    <td>
        <label for="password"  > Password </label>
    </td>
    <td>
        <input type="email" id="userName" name="username" placeholder="User Name" required/>
    </td>
    </tr>

    <tr>
        <td>
            <label for="password"  > Password </label>
        </td>
        <td>
            <input type="password" id="password" name="password" placeholder="Password" required />
        </td>
     </tr>
     </table>

    <div class="row">
        <input type="submit" value="Login"/>
        <a href="/login/register" > Registrarse <a/>
    </div>
</form>

</di>


</body>

</html>
