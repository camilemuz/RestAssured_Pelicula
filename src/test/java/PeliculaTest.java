import com.google.gson.Gson;
import io.restassured.RestAssured;
import org.junit.Test;
import Model.Pelicula;






public class PeliculaTest {
    public static String url = "http://localhost:3000/peliculas";
   private static Gson gson = new Gson();
    @Test
    public  void getAllPeliculas(){
        String response = RestAssured.given().when().get(url).asString();
        Pelicula[] peliculas = gson.fromJson(response, Pelicula[].class);

        for (Pelicula pelicula : peliculas){
            System.out.println(pelicula.getId());
            System.out.println(pelicula.getNombre());
            System.out.println(pelicula.getDirector());
            System.out.println(pelicula.getClasificacion());
        }

    }


}
