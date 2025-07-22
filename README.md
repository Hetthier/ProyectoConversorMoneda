# ProyectoConversorMoneda
# Conversor de Monedas 

Un conversor de monedas en tiempo real desarrollado en Java que utiliza la API de ExchangeRate-API para obtener tasas de cambio actualizadas entre diferentes monedas latinoamericanas y el dólar estadounidense.

## Descripción

Este programa permite convertir entre las siguientes monedas:
- **USD** (Dólar estadounidense) ↔ **ARS** (Peso argentino)
- **USD** (Dólar estadounidense) ↔ **BOB** (Boliviano)
- **USD** (Dólar estadounidense) ↔ **BRL** (Real brasileño)
- **USD** (Dólar estadounidense) ↔ **CLP** (Peso chileno)
- **USD** (Dólar estadounidense) ↔ **COP** (Peso colombiano)

## Características

- **Consulta de API en tiempo real**: Obtiene tasas de cambio actualizadas desde ExchangeRate-API
- **Interfaz de consola interactiva**: Menú intuitivo para seleccionar conversiones
- **Manejo robusto de errores**: Validación de entrada y manejo de excepciones
- **Arquitectura orientada a objetos**: Código organizado en clases especializadas
- **Conversión bidireccional**: Permite convertir en ambas direcciones para cada par de monedas

##  Tecnologías Utilizadas

- **Java 11+**: Lenguaje de programación principal
- **HttpClient**: Cliente HTTP nativo de Java para consumo de API
- **Gson**: Librería de Google para deserialización JSON
- **ExchangeRate-API**: API externa para obtener tasas de cambio

##  Estructura del Proyecto
src/
├── principalProyecto.java    # Clase principal con el menú y lógica del programa
├── Iniciales.java           # Manejo de la interfaz de usuario (menú)
├── consultaMoneda.java      # Consumo de la API de tasas de cambio
├── Tratamiento.java         # Lógica de procesamiento de conversiones
└── Moneda.java             # Modelo de datos (record) para la respuesta de la API

## 🔧 Prerrequisitos

- **Java 11 o superior**
- **Conexión a Internet** (para acceder a la API)
- **Librería Gson** (para manejo de JSON)


## Ejemplo de uso:
**************************************************************************
Sea bienvenido/a al Conversor de Moneda =]

1) Dólar estadounidense =>> Peso argentino
2) Peso argentino =>> Dólar estadounidense
...
Elija una opción válida:
**************************************************************************
1
ingrese a valor que deseas convertir:
100
El valor 100 [USD] corresponde al valor final de =>> 35000.0 [ARS]

## Arquitectura
## Clases Principales

- principalProyecto: Clase principal que maneja el flujo del programa y el manejo de errores
- Iniciales: Encargada de mostrar el menú de opciones al usuario
- consultaMoneda: Maneja las peticiones HTTP a la API de ExchangeRate-API
- Tratamiento: Procesa los datos de conversión y determina las monedas de origen y destino
- Moneda: Modelo de datos que representa la respuesta de la API

Manejo de Errores

- IndexOutOfBoundsException: Valida que la opción seleccionada esté dentro del rango permitido
- NumberFormatException: Controla que solo se ingresen valores numéricos
- NullPointerException: Maneja casos donde no se obtienen datos de la API
- ConnectException: Controla problemas de conectividad con la API


## Autor
Andie Matthius Barreno Herrera - andiebarreno16082003@gmail.com
