package Model;

import com.fasterxml.jackson.annotation.*;


public class Pelicula {

        @JsonProperty("id")
        private Integer id;
        @JsonProperty("nombre")
        private String nombre;
        @JsonProperty("director")
        private String director;
        @JsonProperty("clasificacion")
        private String clasificacion;


        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        @JsonProperty("nombre")
        public String getNombre() {
            return nombre;
        }

        @JsonProperty("nombre")
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        @JsonProperty("director")
        public String getDirector() {
            return director;
        }

        @JsonProperty("director")
        public void setDirector(String director) {
            this.director = director;
        }

        @JsonProperty("clasificacion")
        public String getClasificacion() {
            return clasificacion;
        }

        @JsonProperty("clasificacion")
        public void setClasificacion(String clasificacion) {
            this.clasificacion = clasificacion;
        }




    }





