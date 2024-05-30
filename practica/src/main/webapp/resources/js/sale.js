
var jTabla =[];




function addProduct(){
var r = newRow();

jTabla.push(r);

renderTable();


}

function newRow(){
return row= {
         "producto":"",
         "precio":0,
         "cantidad":0,
         "precioUnitario":0,
         "total":0
         }
}


function consultar (){
renderTable();

}


function renderTable(){

var totalProductos=0;
var totalVenta=0;
var html = "";


html="<table class='tablaProductos'>" +
"<tr>" +
"<th>No</th>" +
"<th>Producto</th>" +
"<th>Cantidad</th>" +
"<th>PrecioUnitario</th>" +
"<th>Total</th>" +
"</tr>" +
"<tbody id='tbodyProducts'>";


$(jTabla).each(function(ix,row){

var no = ix+1;

 html=html  + "<tr><td>" + no +  "</td><td><input type ='text' onchange='updateProducto(this.value,"+ ix + ")' value ='" + row.producto +  "' id ='tbxProducto_" + ix  + "'/> </td>"+
"<td><input type ='number' value ='" + row.precio +  "' id ='tbxPrecio_" + ix  + "' onchange='updatePrecio(this.value,"+ ix + ")' /> </td>" +
"<td><input type ='number' value ='" + row.cantidad +  "' id ='tbxCantidad_" + ix + "' onchange='updateCantidad(this.value,"+ ix + ")' /> </td>" +
"<td><input type ='number' readonly='' value ='" + row.total +  "' class='totalV' id ='tbxTotal_" + ix  + "' /></td>" +
"<td><input type ='button'  value ='Eliminar' id ='btnEliminar_" + ix + 1 + "' onclick='deleteRow(" +  ix + " )'/> </td></tr>";



});


html = html + "</tbody></table>";



$("#tablarender").html(html);


$("#totalProductos").val(jTabla.length);



}


function updateProducto(valor,ixRow){
jTabla[ixRow].producto = valor;
}
function updateCantidad(valor,ixRow){
jTabla[ixRow].cantidad = valor;
jTabla[ixRow].total = jTabla[ixRow].precio  * jTabla[ixRow].cantidad;
$("#tbxTotal_" + ixRow).val(jTabla[ixRow].total);
sumTotalVenta();
}
function updatePrecio(valor,ixRow){
jTabla[ixRow].precio = valor;
jTabla[ixRow].total = jTabla[ixRow].precio  * jTabla[ixRow].cantidad;
$("#tbxTotal_" + ixRow).val(jTabla[ixRow].total);
sumTotalVenta();
}

function sumTotalVenta(){
var total=0.0;
$(".totalV").each(function(ix,txt){
     total= total + parseInt($(txt).val());
});
$("#totalVenta").val(total)


}

function deleteRow(ix){

    jTabla.splice(ix,1);

renderTable();



}




