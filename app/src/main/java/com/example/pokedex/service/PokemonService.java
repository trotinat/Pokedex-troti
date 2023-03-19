package com.example.pokedex.service;

import com.example.pokedex.models.PokemonListAPI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonService {

    @GET("pokemon")
    Call<PokemonListAPI> getListPokemon(@Query("limit") int limit,
                                        @Query("offset") int offset);
}
