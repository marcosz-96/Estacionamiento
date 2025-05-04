# Estacionamiento
**_ Practicando pilares de POO en Java _**

## Programa Gestion de Cochera

- El siguiente programa es una pequeña práctica realizada en clases, 
  consiste en desarrollar un programa básico que permite gestionar las entradas y salidas de una cochera.

### Las clases son: 

**'Cochera()':**
- Es la Clase que permite gestionar el conjunto de lugares en el estacionamiento
 Permitiendo estacionar, retirar y mostrar el estado actual de la cochera.
- Su atributo principal es ```lugares : Lugar[]```, es el arreglo que instancia a la clase 'Lugar()' en la cual
  se almacenan la cantidad de lugares disponibles en la cochera.

**'Vehiculos()':**
- Es la Clase que representa a los vehiculos que se estacionan en la cochera.
  Contiene la informacion necesaria de los mismos como ser _marca, modelo, patente y numero de contacto_
  permitiendo también registrar los horarios de entradas y salidas.

**'Lugar()':**
- En esta Clase se representan los lugares específicos dentro de la cochera.
  Contiene un número identificador y un objeto ```Estacionamineto``` instanciado de la clase **'Disponibilidad()'**
  que sirve para gestionar la ocupación y el vehículo estacionado.

**'Disponibilidad()':**
- Esta Clase intermedia representa al estado de ocupación de un lugar específico en la cochera.
  Contiene un vahículo que ocupa un lugar y gestiona el estado de los lugares mostrando si están 
  disponibles o no.

**'Clase Program'**
- Es la Clase principal que interactúa con el usuario permitiéndole gestionar la cochera.
