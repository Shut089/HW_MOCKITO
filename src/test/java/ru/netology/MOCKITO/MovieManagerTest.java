package ru.netology.MOCKITO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test // Вывод всех фильмов
    public void allFilms(){
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

   @Test // Добавление 1 фильма
    public void addFilm(){
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

       String[] expected = {"Бладшот"};
       String[] actual = manager.findAll();
       Assertions.assertArrayEquals(expected, actual);
   }

    @Test // Добавление 3 фильма
    public void addFilm3(){
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test // Фильмы в обратном порядке
    public void findLast(){
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");

        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}