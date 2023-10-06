package Personnage;

import facteursPremiers.FacteursPremiers;
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

class PersonnageTest {

    private Personnage unPersonnage;
    private String sens;

    @BeforeEach
    void setUp(){
        unPersonnage = new Personnage();
        sens = "";
    }

    @AfterEach
    void tearDown(){
        unPersonnage = null;
        sens = null;
    }

    @Test
    void tourner_personnage_une_fois(){
        //Given
        int fois = 1;

        //When
        sens = unPersonnage.tourner(fois);

        //Then
        assertThat(sens).isEqualTo("est");
    }

    @Test
    void tourner_personnage_deux_fois(){

    }

    @Test
    void tourner_personnage_trois_fois(){

    }
}