# Generador-de-Contrase-as
Programa que genera contraseñas con la longitud deseada por el usuario

## Características

- Manejo de errores
- Conteo de victorias, perdidas y empates
- Bucle continuo para jugas varias veces
- Opción clara para salir escribiendo `salir`

## Requisitos

- Java 11 o superior

## Tecnologías utilizadas

- Java

## Cómo ejecutar el proyecto

1. Clona el repositorio:
```bash
git clone https://github.com/JavFloresDev/Generador-de-Contrase-as
```
2. Entrar a la carpeta del proyecto:
```bash
cd Generador-de-Contrase-as
```
3. Compila el programa:
```bash
javac --release 11 src/GeneradorContrasenias.java
```
4. Ejecuta el programa: 
```bash
java -cp src GeneradorContrasenias
```

## Ejemplo de uso

**PIEDRA, PAPEL O TIJERA**\
ingresa la palabra e intenta ganar\
 escribe 'salir' para hacerlo\
Piedra, papel o tijera!!!...\
-----> piedra\
Empate\
Piedra, papel o tijera!!!...\
-----> papel\
Ganaste\
Piedra, papel o tijera!!!...\
-----> papel\
Empate\
Piedra, papel o tijera!!!...\
-----> tijera\
Perdiste\
Piedra, papel o tijera!!!...\
-----> salir\
_______________________\
Victorias: 1\
Derrotas: 1\
Empates: 2\


## Estructura del proyecto

```
Piedra-Papel-Tijera/
├── src/
│   └── PiedraPapelTijera.java
├── README.md
└── LICENSE
```

## Capturas de pantalla

Funcionamiento del Juego\
![Juego de adivinar](images/juego.png)

## Autor

JavFloresDev — Jhonny Flores

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE [blocked] para más detalles.

