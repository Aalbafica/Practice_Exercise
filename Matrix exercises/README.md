Estare subiendo por esta carpeta algunos ejercicios sobre matrices hechos en java con el Apache Netbeans IDE.

Si quiere visualizarlos puede usar el IDE mencionado anteriormente y tener instalado el JDK en su computadora.

Detalles de cada ejericio
1. Matrices.java
Ejercicio donde se llena una matriz de enteros, su dimension es de 3x3 (3 filas y 3 columnas). El usuario tendra que digitar por teclado los numeros que quiere guardar en la matriz y el programa le mostrara el resultado final de como quedo la matriz llena con los datos ingresados. El programa:
- Define una matriz de igual dimension.
- Le pide al usuario los numero de tipo entero que quiera ingresar y guardar en la matriz.
- Se imprime la matriz para su completa visualizacion.

2. Matriz_Notas.java
Ejercicio donde se llena una matriz de 4x4 con algunas notas de algunos estudiantes que son digitados por el usuario donde se calcula el promedio de las notas de cada estudiante y el resultado se guarda en la ultima columna de cada fila de la matriz.
El programa:
- Define una matriz de iguales dimensiones.
- Se le pide al usuario que digite los datos y se guarde en la matriz, pero no se llenara por completo ya que se dejo la ultima columna de cada fila libre para el promedio que se iba a calcular (Esto se hace sumando cada nota y dividiendo por la cantidad de notas ingresadas por cada fila).
- Se imprime la matriz junto con las notas digitadas por el usuario y el calculo del promedio en la ultima columna.

3. MatrizDeVuelos.java
Una compañia de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno por la mañana, otro al mediodia y otro por la noche. Para administrar estos datos, utiliza una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de asientos disponibles. Por ejemplo:
![image](https://github.com/Aalbafica/Practice_Exercise/assets/162754467/2619cde3-1759-448b-9476-4627d993a1b5).

Puntos clave del ejercicio:
- El programa debe permitir la carga de la matriz con la cantidad de asientos para cada vuelo y horario.
- El programa debe permitir al usuario ingresar el numero de destino y el numero de vuelo (dependiendo del horario) y la cantidad de pasajes que necesita.
- Dependiendo de la solicitud del usuario, el programa le avisara si habra asientos disponibles segun la cantidad de pasajes que digito. En caso tal que asi sea se le mostrara un mensaje de "EXITO" y se descontara del total de asientos que se registro en la matriz, en caso tal que no se le avisara que no se pudo y lo vuelva a intentar.

El programa:
- Se crea una matriz de 6x3 (6 filas y 3 columnas).
- Se crea un metodo donde se carga la matriz con los datos que estan almacenados en las columnas de mañana, mediodia y noche.
- Se crean varios metodos con el objetivo de reutilizar y tener mas organizado el codigo.
