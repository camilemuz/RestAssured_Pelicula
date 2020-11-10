import Model.Pelicula;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import org.junit.Test;
import org.testng.Assert;
import java.lang.String;
import io.restassured.response.Response;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertTrue;

import org.testng.Assert;


public class PeliculaTest {
    public static String url = "http://localhost:3000/peliculas";
   private static Gson gson = new Gson();

   //TEST 1 Para ver toda la lista completas de las peliculas de la API que cree yo
    @Test
    public  void getAllPeliculas(){
        String response = given().when().get(url).asString();
        Pelicula[] peliculas = gson.fromJson(response, Pelicula[].class);
        Response response1 = RestAssured.get("http://localhost:3000/peliculas");
        int estadoCode = response1.getStatusCode();
        Assert.assertEquals(estadoCode, 200);
        System.out.println(response1.statusCode());

        for (Pelicula pelicula : peliculas){
            System.out.println(pelicula.getId());
            System.out.println(pelicula.getNombre());
            System.out.println(pelicula.getDirector());
            System.out.println(pelicula.getClasificacion());
        }
    }


        //Test 2 Si se encuentra el  ID de la película, sale 200
        @Test
        public void getSiEstaTalPelicula()
    {
            given().get("http://localhost:3000/peliculas").then().
                    body("id[1]", equalTo(2)).
                    statusCode(200).
                    log().all();

        }

        //Test 3 Validación del Tiempo en segundos
        @Test
        public void getTodaLaLista(){
        long timeRequest = get("http://localhost:3000/peliculas").
                timeIn(TimeUnit.SECONDS);
                System.out.println(timeRequest);
                assertTrue(timeRequest<=4);
        }


    }





