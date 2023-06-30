package ru.netology.movieposter;

public class MoviePostersManager {
    private MoviePosters[] items = new MoviePosters[0];
    private int limit;

    public MoviePostersManager() {
        this.limit = 5;
    }

    public MoviePostersManager(int limit) {
        this.limit = limit;
    }

    public void add(MoviePosters item) {
        MoviePosters[] tmp = new MoviePosters[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public MoviePosters[] findAll() {
        return items;
    }

    public MoviePosters[] findLast() {
        int arrayLength;
        if (items.length < 5) {
            arrayLength = items.length;
        } else {
            arrayLength = 5;
        }
        MoviePosters[] tmp = new MoviePosters[arrayLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}
