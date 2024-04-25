El usuario tiene trabaja en gestionar cual es la programación que se verá en el canal de una televisora. En donde:
-	Recibe el nombre del programa y la hora/día en el que tiene que transmitir.
Ejemplo.

                Nombre del programa, horario y día, Duración, Canal
Dato 1:   Programa de Comida / 9.00am 17/04/2024, 1h, 5
Dato 2:   Programa de Ejercicio / 9.00am 17/03/2024, 2h, 2
Dato 3:   Película 1 / 02:00am 18/04/2023 , 2 1h, 2.


La intención es tener un servicio desde javaspring boot que reciba estos datos y que cumpla con las siguientes funcionalidades.

-	Almacenar el programa.
o	Si ya existe mandar un mensaje de que no puede haber duplicados o horarios que se encimen en un mismo canal.
o	Solo se tienen 3 canales.
-	Modificar el programa
o	Si algún programa por error requiere que se cambie su duración o día tiene que verificar que no se encime con el otro.
-	Elimine el programa
o	Si un programa que se encuentra justo en el horario que se esta ejecutando el servicio, mandara un mensaje de que no se puede modificar.
-	Consultar 
o	El proceso debería mostrar en orden cuales son los programas
