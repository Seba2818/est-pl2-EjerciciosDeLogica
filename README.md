# Ejercicios - pilas - colas 
## Nombres:
Sebastian Alvarez
Sebastian Muñoz
Emilio Montaleza
---
## Descripción del proyecto: 

En esta práctica se trabajó con las estructuras de datos lineales *Pila (Stack)* y *Cola (Queue)*, aplicando sus operaciones fundamentales para resolver diferentes problemas propuestos. El objetivo principal fue comprender el funcionamiento de estas estructuras dinámicas y su utilidad en situaciones reales mediante la implementación de algoritmos en Java.

Las actividades desarrolladas permitieron reforzar conceptos como inserción, eliminación, recorrido y validación de datos, utilizando las características propias de cada estructura: LIFO (Last In, First Out) para las pilas y FIFO (First In, First Out) para las colas. Además, se analizaron distintos escenarios en los que estas estructuras ofrecen soluciones eficientes, fortaleciendo las habilidades de diseño y programación orientada a estructuras de datos.

---
## Ejercicio 1
Para resolver este problema se utilizó una estructura de datos Stack (Pila), la cual funciona bajo el principio LIFO (Last In, First Out), es decir, el último elemento que entra es el primero en salir.

El algoritmo recorre la cadena carácter por carácter. Cuando encuentra un símbolo de apertura ((, {, [), lo almacena en la pila utilizando la operación push().

Cuando encuentra un símbolo de cierre (), }, ]), verifica si la pila está vacía. Si la pila está vacía, significa que no existe un símbolo de apertura correspondiente y la cadena es inválida. En caso contrario, extrae el elemento superior mediante pop() y comprueba que ambos símbolos formen un par correcto.

Al finalizar el recorrido, si la pila se encuentra vacía, la cadena es válida; de lo contrario, existen símbolos de apertura sin cerrar y la cadena es inválida.

##  Funcionamiento del Algoritmo
Recorrer la cadena de izquierda a derecha.
Insertar en la pila cada símbolo de apertura encontrado.
Al encontrar un símbolo de cierre:
Verificar que la pila no esté vacía.
Extraer el elemento superior.
Comprobar que corresponda al tipo correcto de apertura.
Continuar hasta terminar la cadena.
Si la pila queda vacía, la cadena es válida.

### Captura del ejercicio 
![SignValidator](captura1.png)

---
## Ejercicio 2
En este ejercicio se implementó un algoritmo para ordenar una pila de números enteros utilizando únicamente las operaciones de la estructura Stack. El objetivo es que los elementos más pequeños queden en el tope de la pila.

La solución utiliza una pila auxiliar para almacenar temporalmente los elementos mientras se los coloca en el orden correcto. Una vez finalizado el proceso, los elementos se transfieren nuevamente a la pila original, quedando ordenados sin utilizar arreglos, listas u otras estructuras de datos.

### Restricciones cumplidas
- Se ordena la misma pila recibida como parámetro.
- No se retorna una nueva pila.
- Se utiliza únicamente una pila auxiliar.
- No se emplean arreglos, listas ni otras estructuras de datos.
- Solo se utilizan las operaciones push(), pop(), peek() e isEmpty().

### Captura del ejercicio 
![StackSorter](captura2.png)

---
## Ejercicio 3
Este ejercicio implementa un algoritmo para determinar si una cadena de texto es un palíndromo utilizando la estructura de datos Queue (Cola).

Un palíndromo es una palabra o texto que mantiene el mismo orden de caracteres al ser leído de izquierda a derecha o de derecha a izquierda.

### Captura del ejercicio 
![QueuePalindrome](captura3.png)

---
## Salidas esperadas de cada ejercicio 
![Resultados](captura4.png)



