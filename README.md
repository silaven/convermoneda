<h1 align=center>Conversor de Moneda</h1>
<h3>•	Descripción del proyecto</h3>
Proyecto en desarrollo para el curso Java orientado a objetos dentro de la formación Back End ONE de Alura Latam.
La aplicación consiste en un conversor de monedas en tiempo real, despliega en consola un menú con ocho opciones para que el usuario seleccione el cambio que desea entre diferentes monedas. A continuación se solicita la cantidad o monto a convertir.

![Conversor](https://github.com/silaven/convermoneda/assets/87791988/c93ec09c-3a44-4adb-b6a1-51dca407d3d9)

<h3>•	Funcionalidades</h3>
Dependiendo de la opción ingresada la aplicación devuelve el cambio de la cantidad de moneda base que el usuario ingreso al valor de la moneda destino. Se utilizó  la API Exchange Rate, con la funcionalidad de Conversión de pares donde se envía un par de códigos y un monto en la solicitud, así se obtiene el tipo de cambio entre los códigos y la conversión del importe incluido. Adicionalmente, nos entrega la fecha actual y hora en que se realizó la consulta. Aquí se despliega nuevamente el menú para realizar otra conversión o si se prefiere salir digitando la opción “9”. Si el usuario digita una opción inválida el programa le informará y solicitará que vuelva a digitar una opción válida.

![Conversor2](https://github.com/silaven/convermoneda/assets/87791988/786af255-5dc1-42c2-9ce6-ab691116d50e)


<h3>•	Cómo pueden usarlo los usuarios</h3>
El proyecto se desarrolló en la versión de Java 17.0.10, con el entorno de desarrollo integrado IntelliJ IDEA. La aplicación se despliega teniendo instalado el IDE y el archivo del código “convermoneda” abierto. Se ejecuta la opción “Run” estando dentro de la clase “Principal.java”, después de compilarse se presenta el menú del Conversor de monedas como se ve en la imagen.

<h3>• Tecnologías utilizadas</h3>
<ul>
  <li>Java 17.0.10</li>
  <li>IntelliJ IDEA Community Edition</li>	
  <li>GitHub</li>
  <li>Biblioteca Gson 2.10.1</li>
  <li>ExchangeRate API</li>
</ul>

<h3>•	Autor del proyecto</h3>
María Silvia Avendaño estudiante del curso Java Orientado a Objetos de ALURA Latam, Oracle ONE G7.
