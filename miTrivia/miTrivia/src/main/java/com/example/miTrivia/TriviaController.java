package com.example.miTrivia;

import com.example.miTrivia.entities.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/categories")
    public Category[] categories() {
        /*Query de manera manual
        return "[\n" +
                "    {\n" +
                "      \"category\": \"Ciencia\",\n" +
                "      \"description\": \"Preguntas sobre ciencia y descubrimientos científicos. Ejemplos: ¿Quién formuló la teoría de la relatividad? ¿Cuál es el proceso de la fotosíntesis?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"category\": \"Historia\",\n" +
                "      \"description\": \"Preguntas sobre eventos históricos y figuras históricas. Ejemplos: ¿Cuál fue la fecha de la independencia de tu país? ¿Quién fue Cleopatra?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"category\": \"Cine\",\n" +
                "      \"description\": \"Preguntas sobre películas y la industria cinematográfica. Ejemplos: ¿Quién dirigió la película 'El Padrino'? ¿Cuál es la película más taquillera de todos los tiempos?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"category\": \"Arte\",\n" +
                "      \"description\": \"Preguntas sobre diferentes formas de expresión artística. Ejemplos: ¿Quién es el autor de la obra 'La Noche Estrellada'? ¿Cuál es el estilo artístico de Picasso?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"category\": \"Deportes\",\n" +
                "      \"description\": \"Preguntas sobre deportes y eventos deportivos. Ejemplos: ¿Quién ganó la última Copa del Mundo de fútbol? ¿Cuál es el récord mundial de los 100 metros lisos?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"category\": \"Cultura\",\n" +
                "      \"description\": \"Preguntas sobre arte, música y tradiciones culturales. Ejemplos: ¿Quién pintó la Mona Lisa? ¿Cuál es el significado de la Oktoberfest?\"\n" +
                "    }\n" +
                "]";
 */
        Category cat = new Category();
        cat.setCategory("Arte");
        cat.setDescription("Me gusta el arte");
        Category cat2 = new Category();
        cat2.setCategory("Deportes");
        cat2.setDescription("Preguntas sobre deportes y eventos deportivos. Ejemplos: ¿Quién ganó la última Copa del Mundo de fútbol? ¿Cuál es el récord mundial de los 100 metros lisos?");
        Category[] categorias = {cat,cat2};
    return categorias;

    }
    /* Hacerlo de manera manual:
    @GetMapping("/question/{categoria}")
    public Question getQuestionAndCategory(@PathVariable String categoria) {
        Question preguntas = new Question();

        if (categoria.equalsIgnoreCase("cultura")) {
            preguntas.setCategory("Cultura");
            preguntas.setQuestion("¿Qué ingredientes se necesitan para hacer una buena michelada?");
            preguntas.setAnswer(0);
            preguntas.setExplanation("La michelada, originaria de México, se hace con cerveza, limón y un toque de picante en la categoría");
            String[] Opciones1 = {"Cerveza, limón, picante", "Limon, Sal, Dulce de Leche", "Limon, Whisky, picante", "Manzana, Pimienta, polvo picante"};
            preguntas.setOptions(Opciones1);
        }
        if (categoria.equalsIgnoreCase("deportes")) {
            preguntas.setCategory("Deporte");
            preguntas.setQuestion("¿Qué numero usaba Gerson?");
            preguntas.setAnswer(0);
            preguntas.setExplanation("El famoso youtuber Osvaldo mas conocido como Gerson, se caracteriza por usar siempre el mismo numero en su dorsal");
            String[] Opciones1 = {"10", "12", "7", "5"};
            preguntas.setOptions(Opciones1);
        }
        return preguntas;
    }
*/
    @GetMapping("/question/{categoria}")
    public String getQuestionAndCategory(@PathVariable String categoria) {
    ChatGptClient chatGpt = new ChatGptClient();
    String respuestaJson = chatGpt.extractQuestion("Estoy armando una trivia, necesito que me des una pregunta de la categoría " +categoria+ ", con la siguiente estructura de JSON (es sumamente importante que tu respuesta sea solo JSON, que no agregues ninguna aclaracion):\n" +
            "{\n" +
            "\"category\": \"aca va el nombre de la categoria\",\n" +
            "\"question\": \"aca va la pregunta\",\n" +
            "\"options\": [\n" +
            "\"aca va la opcion 1\",\n" +
            "\"aca va la opcion 2\",\n" +
            "\"aca va la opcion 3\"\n" +
            "],\n" +
            "\"answer\": aca va la respuesta correcta en caso de ser primera es el numero 0,\n" +
            "\"explanation\": \"aca va la explicacion\"\n" +
            "}");
    return respuestaJson;
    /*Convirtiendolo en objeto:
    ObjectMapper convertidor = new ObjectMapper();
    return convertidor.convertValue(respuestaJson,Question.class);
    */
    }



}
