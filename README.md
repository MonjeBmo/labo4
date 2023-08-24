# Sistema de Reservas de Boletos - Cineflix

Este es un programa en Java que simula un sistema de reservas de boletos para funciones de cine en Cineflix. El programa utiliza conceptos de interfaces, clases, herencia y manejo de excepciones para lograr su funcionamiento.

## Instrucciones de Uso

1. Ejecute el programa `Main.java` para iniciar la aplicación.
2. Se mostrará una lista de películas disponibles con sus respectivos horarios.
3. Elija una película y un horario ingresando el número correspondiente.
4. Ingrese la cantidad de boletos que desea reservar.
5. Si la reserva es exitosa, se mostrará un mensaje con la información de la reserva y el costo total.
6. Si hay algún problema con la reserva, se mostrará un mensaje de error apropiado.

## Estructura del Código Fuente

El código fuente se encuentra en el directorio `src`. La estructura de archivos es la siguiente:

- `Main.java`: Punto de entrada del programa.
- `mov.java`: Interfaz que define métodos para obtener el nombre y duración de la película.
- `movie.java`: Clase padre de pelicula.
- `movieDubbed.java`: Clase que implementa la interfaz `mov` para películas dobladas.
- `movie3D.java`: Clase que implementa la interfaz `mov` para películas en 3D.
- `Funcion.java`: Clase que representa una función de cine con película, horario y cantidad de boletos disponibles.


