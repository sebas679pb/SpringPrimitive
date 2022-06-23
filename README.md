# Spring

## Autor

Jhon Sebastian Piñeros Barrera

## Fecha

22/06/2022

## Descripcion

Este proyecto consiste en realizar el diseño y construccion del juego picas y famas para posteriormente realizar su despliegue en heroku.

Para ejecutar la aplicacion de manera local por consola debemos digitar:

```
mvn package

java -jar target/SpringPrimitive-1.0-SNAPSHOT.jar
```

y posteriormente buscamos en el browser:

```
localhost:5000
```

### LOC/h

Se realizaron 257 lineas de codigo en aproximadamente 4 horas de trabajo, es decir, 64.25 lineas de codigo por hora.

### Prerrequisitos

- JAVA
- HTML
- Maven
- GIT
- Heroku

### Diagrama de clases

[![image.png](https://i.postimg.cc/Df1xT6jh/image.png)](https://postimg.cc/BtQT5Tf7)

### Descripcion diagrama de clases

En el diagrama de clases se puede observar que para el diseño de este proyecto se implementaron las clases:

- Game: Esta clase implementa el backend del juego picas y famas.
- WebSiteController: Esta clase implementa el controlador del sitio web con spring.

### Estructura del proyecto

```
C:.
└───main
    ├───java
    │      └───co
    │       └───edu
    │           └───escuelaing
    │               └───springprimitive
    │                   ├───Game.java
    │                   └───WebSiteController.java
    └───resources
        └───static
            ├───form.html
            ├───game.html
            ├───Game.js
            └───index.html

```

### Heroku Link

https://springarsw.herokuapp.com/

### JavaDoc

El javadoc se puede vizualizar con el comando 

```
mvn javadoc:javadoc
```

y posteriormente vamos a la carpeta de nuestro proyecto y buscamos en target/site/apidocs/index.html