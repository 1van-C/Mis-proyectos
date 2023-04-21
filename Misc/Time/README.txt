Carlos Iv�n Canto Varela 								      315649888

Time

* Descripci�n

 Es un programa para calcular la duraci�n de un juego con dos horas como entrada.

* Prerrequisitos

Se necesita tener Java (versi�n 14 en adelante) con el JDK de OpenJDK. Las paqueter�as utilizadas vienen por defecto en la instalaci�n inicial del JDK.

* Ejecuci�n

El primer paso es descargar la carpeta en un directorio elegido. Luego, en la terminal (Windows), se utilizar� el comando
cd path="directorio\de\la\carpeta".

Es crucial asegurarse que el directorio contiene el archivo Time.java. El siguiente y �ltimo paso es ejecutar el programa con el comando

java Time.java

El resultado final no se visualizar� pues fue construido con la implementaci�n de Beecrowd en mente.

* Funcionamiento 
Se construy� un lector BufferedReader de la clase hom�nima para tratar los datos con el formato de entrada de Beecrowd; tambi�n se implement� un bucle while que corre el programa siempre y cuando haya una l�nea nueva en la entrada

Ya que la entrada es en forma de una cadena con cuatro n�meros (dos para la hora y dos para los minutos), se toma cada n�mero, se convierte a clase entero y se ingresa en una lista. Luego, una serie de comparaciones se hacen sobre las horas iniciales y finales (primera y tercera entrada en la lista) para determinar la operaci�n a realizar. Despu�s de comparar las horas, se comparan los minutos y, seg�n el caso, se les asigna un valor a las variables hours y minutes. Estas, mediante una operaci�n a definir por las comparaciones ya mencionadas, contienen el valor final de las horas y minutos que llev� el juego en cuesti�n. Finalmente, las variables anteriores son convertidas a cadenas y se imprime "O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)" seg�n los requisitos de Beecrowd.


* Notas adicionales

El programa utilizado en Beecrowd lleva como nombre de clase �Main� por los requisitos de Beecrowd. Sin embargo, para su escritura y prueba en el sistema de origen, fue llamada �Time�.
