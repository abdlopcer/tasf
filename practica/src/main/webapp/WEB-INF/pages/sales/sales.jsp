<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>App Abd</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
     <link rel="stylesheet" href="/resources/css/site.css" />


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script type="application/javascript" src="/resources/js/sale.js"></script>
</head>

<body>
<%@include file="../templates/nav.jsp"%>



<div class="container">

 <fieldset>
   <div class="row">
      <label for="folio"   >Folio de Venta</label>

      <input type="number" id="folio" />
      <input type ="button" value ="Consultar" onclick="consultar();"/>
    </div>


  </fieldset>

  <div id ="tablaproductos">

<input type ="button" value="Agregar Producto" onclick="addProduct();"/>
<input type ="button" value="Generar PDF"/>


<div id ="tablarender">

</div>



  </div>




</div>



 <div>
      <label for="totalProductos"   >Total Productos</label>
      <input type="number" readonly="" id="totalProductos" />
    </div>

<div>
      <label for="totalVenta">Total Venta</label>
      <input type="number" readonly="" id="totalVenta" />
    </div>

</body>

</html>
