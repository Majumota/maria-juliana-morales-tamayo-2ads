María Juliana Morales Tamayo 
Fecha de entrega: 01/10/2021
Parcial Corte 2

1) Explicación general del programa desarrollado, indicando qué necesidad busca resolver. Incluya algunos detalles técnicos como el lenguaje usado y el IDE en que se desarrolla e instrucciones generales para ejecutar la aplicación en entorno local.

El problema a desarrollar, se basará en un sistema de alarmas para el hogar, en donde el usuario podrá indicar el tipo de alarma(Principal o Garaje) que quiere activar o desactivar, así como también indicar si el sistema requiere algún mantenimiento, lo que le indicara que se enviara un mensaje para informar el estado de la alarma. El programa fue desarrollado haciendo uso del IDE de Eclipse Jee Photon en el lenguaje de Java. 

Para hacer uso del programa, el usuario debe acceder al main "SistemaAlarmas", allí al correr el programa encontrara un Menú presentado en la consola y a partir de ahí debe seleccionar la opción que requiera. 

2) Indique el nombre del primer patrón de diseño que usa: State 

a) Justifique la selección y aplicación del patrón de diseño, es decir, qué necesidad
concreta tiene la aplicación y por qué escogió ese patrón para resolverla.

El patrón de diseño State, es un patrón de comportamiento, el cual permite alterar el estado de un objeto, por esto es útil para dar solución al problema considerando que se busca activar o desactivar la alarma en caso de requerir mantenimiento. Por esta razón, el patrón se adaptaba a la solución. 

b) Indique los archivos y líneas de código en que se evidencia el uso del patrón

El patrón se evidencia en los archivos: 
	• Activa.java
	• Estado.java
	• Mantenimiento.java
	• Alarma.java

3) Indique el nombre del segundo patrón de diseño que usa: Adapter

a) Justifique la selección y aplicación del patrón de diseño, es decir, qué necesidad
concreta tiene la aplicación y por qué escogió ese patrón para resolverla.

El patrón de diseño Adapter, es un patrón de diseño estructural, el cual permite la colaboración entre objetos. Teniendo en cuanta el problema que se quiere solucionar y considerando que se tienen dos tipos de alarmas, la principal y la del garaje. Este patrón ayuda a que la interfaz del objeto, pueda ser entendida por otro. Lo que favorecía la solución del problema.

b) Indique los archivos y líneas de código en que se evidencia el uso del patrón

El patrón se evidencia en los archivos: 
	• Adapter.java
	• AlarmaGaraje.java
	• AlarmaPrinciopal.java
	• miAlarma.java
