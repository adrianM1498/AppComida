package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "alitas picantes", R.drawable.alitas, "precio: 30bs"));
        pokemons.add(new Pokemon(2, "hamburguesa de queso", R.drawable.hamburguesa, "precio: 30bs"));
        pokemons.add(new Pokemon(3, "tacos de cerdo", R.drawable.tacos, "precio: 40bs"));
        pokemons.add(new Pokemon(5, "sushi de langostinos", R.drawable.sushi, "precio: 60bs"));
        pokemons.add(new Pokemon(6, "bife a la parrilla", R.drawable.bife, "precio: 45bs"));
        pokemons.add(new Pokemon(7, "hotdog con mayonesa y ketchup", R.drawable.hotdog, "precio: 10 bs"));
        pokemons.add(new Pokemon(9, "ceviche de pejerrey", R.drawable.ceviche, "precio: 35bs"));
        pokemons.add(new Pokemon(10, "costillas e cerdo a la bbq", R.drawable.costillas, "precio: 40bs"));
        return pokemons;
    }
}
