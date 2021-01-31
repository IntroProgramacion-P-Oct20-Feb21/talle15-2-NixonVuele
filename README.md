# taller 15 - 2
## Escritura de Archivos

- Use el proyecto de Netbeans denominado **Taller152** para resolver las siguientes problemáticas

*** 

### Problema01
* Use el paqueteuno para realizar generar un archivo con la siguiente estructura:

```
Ecuador, con capital Quito tiene una población de 17643054
Colombia, con capital Bogotá tiene una población de 51152371
Perú, con capital Lima tiene una población de 33050325
Venezuela, con capital Caracas tiene una población de 28435940
Chile, con capital Santiago tiene una población de 19116201
Bolivia, con capital La Paz tiene una población de 11673021
```

Para ello use los siguientes arreglos

```
String[] paises = {"Ecuador", "Colombia", "Perú", "Venezuela", "Chile", 
            "Bolivia"};
        
String[] capitales = {"Quito", "Bogotá", "Lima", "Caracas", "Santiago", 
            "La Paz"};
        
int[] poblacion = {17643054, 51152371, 33050325, 28435940, 19116201,
            11673021};
```


*** 

### Problema02

Use el paquetedos; que permita ingresar por teclado equipos de basket. El programa de permitir ingresar los equipos hasta que el usuario decida ya no hacerlo. Por cada equipo se debe solicitar el nombre, presupuesto anual y nombre del estadio. Usted debe almacenar esa información en una cadena acumuladora.
Luego, usar dicha cadena y enviar a guardar en un archivo.

Un ejemplo como debe quedar el archivo:

``` 
Boston Celtics, presupuesto 50348701.2; estadio The Celtics
Phoenix Suns‎, presupuesto 40148821.4; estadio The Suns
Chicago Bulls‎, presupuesto 80111121.9; estadio The Bulls‎
```

*** 

### Problema03

En paquetetres; genere una solución para una biblioteca muy pequeña. Los libros, autores e identificativos de los libros para los préstamos están expuestos en las siguientes estructuras:

```
String[] libros = {"El camino a un mejor programador", 
            "Scrum & eXtreme Programming", 
            "Lógica de programación", 
            "Metodología programación orientada a objetos", 
            "Java Como Programar", 
            "Python 3 al descubierto"};
        
String[] autores = {"Anónimo", 
            "Eugenia Bahit", 
            "Omar Iván Trejos Buriticá", 
            "López Román Leobardo", 
            "Dietel, P. y Dietel, H", 
            "Fernández Arturo"};
        
int[] clave1 = {2, 1, 0, 2, 0, 1};
        
int[] clave2 = {1, 1, 1, 2, 2, 0};
        
int[][] identificativoLibro = {
            {8761, 12334, 34567},
            {65431, 43211, 7890},
            {123890, 12344, 2345}
        };
```

Atención; que las posiciones se corresponden; la posición 0 de libros se corresponder con: posición 0 de autores, posición 0 de clave1  y posición 0 de clave2; así sucesivamente.

El proceso para solicitar un libro es el siguiente:
- Se presenta al usuario un menú de la siguiente forma:

```
Libros a prestar:

El camino a un mejor programador opción 0
Scrum & eXtreme Programming  opción 1
Lógica de programación opción 2
Metodología programación orientada a objetos opción 3
Java Como Programar opción 4 
Python 3 al descubierto opción 5

```

- Se solicita al usuario que ingrese un valor por teclado; entre 0 y 5 (solo existen 6 libros en nuestra biblioteca).
- Si el usuario ingresa por teclado el número 1; se asume que quiere el préstamo del texto Scrum & eXtreme Programming.
- Si el usuario ingresa un un valor fuera del rango se presenta un mensaje de error.
- Se debe crear un archivo con la información del libro a prestar que incluya:
	- Nombre del libro
	- Autor del libro
	- Identificativo del libro
- Para encontrar el identificativo del libro se debe usar las estructuras clave1 y clave2
	* Seguimos ejemplifcando si el usuario selecciona opción 1
	* Se toma de clave1 el valor que le corresponda en la posición 1, para el ejemplo es 1.
	* Se toma de clave2 el valor que le corresponda en la posición 1, para el ejemplo es 1.
	* Con clave1 y clave2 se tiene la posición del arreglo identificativoLibro  [1][1], cuyo valor es: 43211
- Se genera la cadena reporte
	* Se le presta el libro Scrum & eXtreme Programming cuyo autor es Eugenia Bahit y tiene un identificativo de 43211
- Dicha cadena debe ser enviada a un archivo.

*** 

