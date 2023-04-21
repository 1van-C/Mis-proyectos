Carlos Iv�n Canto Varela 								      315649888

Password

* Descripci�n

 Es un programa para validar contrase�as. Se asegura que estas lleven al menos una letra may�scula, una min�scula y un n�mero; adem�s debe tener entre 6 a 32 caracteres y no llevar ning�n car�cter especial (puntuaci�n, acentos o espacios).

* Prerrequisitos

Se necesita tener Java (versi�n 14 en adelante) con el JDK de OpenJDK. Las paqueter�as utilizadas vienen por defecto en la instalaci�n inicial del JDK.

* Ejecuci�n

El primer paso es descargar la carpeta en un directorio elegido. Luego, en la terminal (Windows), se utilizar� el comando
cd path="directorio\de\la\carpeta".

Es crucial asegurarse que el directorio contiene el archivo Password.java. El siguiente y �ltimo paso es ejecutar el programa con el comando

java Password.java

El resultado final no se visualizar� pues fue construido con la implementaci�n de Beecrowd en mente.

* Funcionamiento 

Primero se construye un m�todo para comparar dos cadenas mediante expresiones regulares (regex). La cadena modelo se construy� para tener una letra may�scula, una min�scula y un decimal. Adem�s, se filtr� de modo que s�lo acepte este tipo de caracteres. Este m�todo se denomin� validatePassword.

Despu�s, se construy� un lector BufferedReader de la clase hom�nima para tratar los datos con el formato de entrada de Beecrowd. Se implement� un bucle while que corre el programa siempre y cuando haya una l�nea nueva en la entrada.

Cada una de estas l�neas es comparada con el m�todo definido anteriormente y, mediante un if, si la l�nea est� en el formato deseado se imprime la frase �Senha valida.� De otra forma, se imprime �Senha invalida.� Esto se hace para cada l�nea ingresada por Beecrowd.

* Notas adicionales

El programa utilizado en Beecrowd lleva como nombre de clase �Main� por los requisitos de Beecrowd. Sin embargo, para su escritura y prueba en el sistema de origen, fue llamada �Password�.
