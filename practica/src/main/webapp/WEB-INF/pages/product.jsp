<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>App Abd</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="/resources/css/site.css" >

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script type="application/javascript" src="/webjars/jquery/jquery.min.js"></script>

</head>

<body>
<%@include file="templates/nav.jsp"%>



<div class="container">


<label class="error">${error}</label>

<form   class="form"   method="post" action="register">
<table>
    <tr>
        <td>
            <label for="description">UserName</label>
        </td>
        <td>
            <input type="text" id="description"  name="description" placeholder="Descripción" required />
        </td>
     </tr>

       <tr>
            <td>
                <label for="category" >Password</label>
            </td>
        <td>
            <input type="text" id="category" name="category" placeholder="Categoría" />
        </td>
        </tr>


</table>
             <div >
            <input type="submit" value="Guardar"/>
            </div>
</form>

</div>


</body>

</html>
