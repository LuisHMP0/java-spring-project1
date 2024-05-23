package com.example.cRuD.model;

// Classe dos Filmes
class Media {
    private String title;
    private String genre;
    private int year;
    private int duration;
    private double relevance;
    private String synopsis;
    private String trailer;

    // Reconhecer variaveis
    public Media(String title, String genre, int year, int duration, double relevance, String synopsis, String trailer) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.relevance = relevance;
        this.synopsis = synopsis;
        this.trailer = trailer;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public double getRelevance() {
        return relevance;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getTrailer() {
        return trailer;
    }

    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "Gênero: " + genre + "\n" +
                "Ano: " + year + "\n" +
                "Duração: " + duration + " minutos\n" +
                "Relevância: " + relevance + "\n" +
                "Sinopse: " + synopsis + "\n" +
                "Trailer: " + trailer + "\n";
    }
}
