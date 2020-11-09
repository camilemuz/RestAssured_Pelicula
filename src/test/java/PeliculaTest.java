import Model.Pelicula;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import org.junit.Test;
import org.testng.Assert;
import java.lang.String;
import io.restassured.response.Response;



import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
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




}
