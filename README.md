![image](https://github.com/user-attachments/assets/b95eb840-c418-4518-bda8-8e2d5ddf8355)

# TriviaConChatGPTYBaseDeDatos

## Descripción
Este proyecto fue creado para aprender Spring Boot, conectarse a la API de ChatGPT y manejar una base de datos.

## Tecnologías Utilizadas
- **Spring Boot**: Un framework para crear aplicaciones Java basadas en Spring.
- **JUnit**: Un framework para realizar pruebas unitarias en Java.
- **HTTPURLConnection**: Una clase de Java para manejar conexiones HTTP.

## Métodos Principales

### ChatGptClient
- **extractQuestion(String pregunta)**: Envía una solicitud POST a la API de OpenAI y devuelve la respuesta como una cadena.

### ServletInitializer
- **configure(SpringApplicationBuilder application)**: Configura la aplicación Spring Boot.

### MiTriviaApplicationTests
- **contextLoads()**: Un método de prueba que verifica si el contexto de la aplicación se carga correctamente.

### TriviaController
- **categories()**: Devuelve un arreglo de objetos Category con información sobre diferentes categorías.
- **getQuestionAndCategory(String categoria)**: Llama al método extractQuestion de ChatGptClient para obtener una pregunta de trivia basada en la categoría proporcionada y devuelve la respuesta JSON.

## Instalación
1. Clona el repositorio
   ```bash
   git clone https://github.com/cirolpz/TriviaConChatGPTYBaseDeDatos.git

```

1.  Navega al directorio del proyecto
    
    ```bash
    cd TriviaConChatGPTYBaseDeDatos
    
    ```
    
2.  Construye el proyecto con Gradle
    
    ```bash
    ./gradlew build
    
    ```
    

## Uso

1.  Ejecuta la aplicación
    
    ```bash
    ./gradlew bootRun
    
    ```
    
2.  Accede a la aplicación en tu navegador en  `http://localhost:8080`

## Contribución

1.  Haz un fork del repositorio.
2.  Crea una nueva rama (`git checkout -b feature/nuevaCaracteristica`).
3.  Realiza tus cambios y haz commit (`git commit -am 'Agrega nueva característica'`).
4.  Sube tus cambios a la rama (`git push origin feature/nuevaCaracteristica`).
5.  Abre un Pull Request.
