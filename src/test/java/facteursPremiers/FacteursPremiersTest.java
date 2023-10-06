package facteursPremiers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

class FacteursPremiersTest {
    private List<Integer> resultat;
    private FacteursPremiers instance;

    @BeforeEach
    void setUp(){
        List<Integer> resultat = new ArrayList<>();
        instance = new FacteursPremiers();
    }

    @AfterEach
    void tearDown(){
        resultat = null;
        instance = null;
    }

    @Test
    void generate_avec_1(){
        try {
            //Given
            int nbr = 1;

            //When
            resultat = instance.generate(nbr);
        }

        catch(IllegalArgumentException e){
            //Then
           assertEquals(" Le nombre doit être supérieur à1", e.getMessage());
        }

    }

    @Test
    void generate_avec_2(){

        //Given
        int nbr = 2;

        //When
        resultat = instance.generate(nbr);

        //Then
        assertThat(resultat).containsExactlyInAnyOrderElementsOf(List.of(2));
    }

    @Test
    void generate_avec_6(){

        //Given
        int nbr = 6;

        //When
        resultat = instance.generate(nbr);

        //Then
        assertThat(resultat).containsExactlyInAnyOrderElementsOf(List.of(2,3));
    }
    @Test
        void generate_avec_8(){

        //Given
        int nbr = 8;

        //When
        resultat = instance.generate(nbr);

        //Then
        assertThat(resultat).containsExactlyInAnyOrderElementsOf(List.of(2,2,2));
    }

     @Test
        void generate_avec_nombre_negatif(){
         try {
             //Given
             int nbr = -8;

             //When
             resultat = instance.generate(nbr);
         }

         catch(IllegalArgumentException e){
             //Then
             assertEquals(" Le nombre doit être supérieur à1", e.getMessage());
         }

     }


     @Test
        void generate_avec_grand_nombre_positif(){
         //Given
         int nbr = 110;

         //When
         resultat = instance.generate(nbr);

         //Then
         assertThat(resultat).containsExactlyInAnyOrderElementsOf(List.of(2,5,11));
     }
}