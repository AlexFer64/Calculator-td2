package facteursPremiers;

import java.util.HashSet;
import java.util.Set;

public class FacteursPremiers {
    public Set<Integer> generate(int n){
        Set<Integer> facteursPremiers = new HashSet<>();
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
