package facteursPremiers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FacteursPremiers {

    public List<Integer> generate (int n){
            if (n <= 1) {
                throw new IllegalArgumentException(" Le nombre doit être supérieur à1");
            }
            List<Integer> facteursPremiers = new ArrayList<>();
            int diviseur = 2;

            while (n > 1) {
                while (n % diviseur == 0) {
                    facteursPremiers.add(diviseur);
                    n /= diviseur;
                }
                diviseur++;
            }

            return facteursPremiers;
    }
}
