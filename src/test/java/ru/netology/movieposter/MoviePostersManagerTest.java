package ru.netology.movieposter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviePostersManagerTest {
    MoviePosters item1 = new MoviePosters("Бладшот", "боевик", "https://user-images.githubusercontent.com/53707586/152697921-e71d853c-aa2e-482b-be61-39e6c2cfb0b1.png");
    MoviePosters item2 = new MoviePosters("Вперёд", "мульт", "https://www.kinopoisk.ru/picture/3511909/");
    MoviePosters item3 = new MoviePosters("Отель Белград", "комедия", "https://www.kinopoisk.ru/film/1206431/posters/");
    MoviePosters item4 = new MoviePosters("Джентельмены", "боевик", "https://www.kinopoisk.ru/film/1143242/posters/");
    MoviePosters item5 = new MoviePosters("Человек-невидимка", "ужасы", "https://www.kinopoisk.ru/film/420454/posters/");
    MoviePosters item6 = new MoviePosters("Тролли. Мировой тур", "мульт", "https://www.kinopoisk.ru/film/1040592/posters/");



    @Test
    public void PosterTest() {
        MoviePostersManager mov = new MoviePostersManager();
        mov.add(item1);
        mov.add(item2);
        mov.add(item3);
        mov.add(item4);
        mov.add(item5);
        mov.add(item6);

        MoviePosters[] expected = {item1, item2, item3, item4, item5, item6};
        MoviePosters[] actual = mov.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        MoviePostersManager mov = new MoviePostersManager();
        mov.add(item1);
        mov.add(item2);
        mov.add(item3);
        mov.add(item4);
        mov.add(item5);
        MoviePosters[] expected = {item5, item4, item3, item2, item1};
        MoviePosters[] actual = mov.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviePostersMaxTest() {
        MoviePostersManager mov = new MoviePostersManager(6);
        mov.add(item1);
        mov.add(item2);
        mov.add(item3);
        mov.add(item4);
        mov.add(item5);
        mov.add(item6);
        MoviePosters[] expected = {item1, item2, item3, item4, item5, item6};
        MoviePosters[] actual = mov.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviePostersMinTest() {
        MoviePostersManager mov = new MoviePostersManager();
        mov.add(item1);
        mov.add(item2);
        mov.add(item3);
        MoviePosters[] expected = {item3, item2, item1};
        MoviePosters[] actual = mov.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void PosterTestEmpty() {
        MoviePostersManager mov = new MoviePostersManager();
        MoviePosters[] expected = {};
        MoviePosters[] actual = mov.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}