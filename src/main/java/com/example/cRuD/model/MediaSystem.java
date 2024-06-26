package com.example.cRuD.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaSystem {
    private static List<Media> mediaList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Add filmes e séries ao sistema
        mediaList.add(new Media("Tá Dando Onda", "Animação, Comédia, Esporte", 2007, 125, 9.3, "Cadu Maverick é um jovem pinguim, que tem o lendário surfista Big Z como ídolo. Um dia ele decide deixar sua família e sua cidade, Frio de Janeiro, na Antártida, para participar Memorial do Big Z.", "https://www.youtube.com/watch?v=hjjcJsr9_B4&ab_channel=SonyPicturesBrasil"));
        mediaList.add(new Media("Breaking Bad", "Crime, Drama, Thriller", 2008, 49, 9.5, "Um professor de química do ensino médio tornou-se parceiro produtor de metanfetaminas de um ex-aluno.", "https://www.youtube.com/watch?v=HhesaQXLuRY"));

        System.out.println("Bem-vindo ao Sistema de Informações de Filmes e Séries!");
        boolean running = true;

        while (running) {
            System.out.println("\nDigite o título do filme ou série que deseja ver os detalhes (ou 'sair' para encerrar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                running = false;
            } else {
                boolean found = false;
                for (Media media : mediaList) {
                    if (media.getTitle().equalsIgnoreCase(input)) {
                        System.out.println("\nInformações Detalhadas:");
                        System.out.println(media);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Filme ou série não encontrado. Tente novamente.");
                }
            }
        }

        System.out.println("Obrigado por usar o Sistema de Informações de Filmes e Séries!");
        scanner.close();
    }
}