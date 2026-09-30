package com.xadrex.xadrez.dominio;

public class Tabuleiro {

    private char[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int a = 0; a < 8; a++) {
                tabuleiro[i][a] = ' ';
            }
        }
    }

public void imprimir() {

    
    for (int fileira = 0; fileira < 8; fileira++) {
        for (int coluna = 0; coluna < 8; coluna++) {
            System.out.print(tabuleiro[fileira][coluna] + " ");
         }
         System.out.println();
            }
        }
    }