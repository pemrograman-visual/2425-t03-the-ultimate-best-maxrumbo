//122S24037-Maxwell Rumahorbo
//12S24030-Swasti Sihombing

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, tahunterbit, penerbit, formatbuku, kategori, kategoridiskon, kategoribuku;
        int stok;
        double hargabeli, minimummargin, rating, penilaianbuku;

        kategori = " ";
        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = input.nextLine();
                penerbit = input.nextLine();
                if (penerbit.equals("---")) {
                    penerbit = "---";
                } else {
                    penerbit = penerbit;
                }
                formatbuku = input.nextLine();
                hargabeli = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
                if (minimummargin > 0) {
                    kategoridiskon = "---";
                } else {
                    if (minimummargin < -(hargabeli * 40 / 100)) {
                        kategoridiskon = "Once in a lifetime";
                    } else {
                        if (minimummargin < -(hargabeli * 20 / 100)) {
                            kategoridiskon = "Never come twice";
                        } else {
                            kategoridiskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                kategori = "Average";
                            } else {
                                if (rating < 3.0) {
                                    kategori = "Low";
                                }
                            }
                        }
                    }
                }
                if (kategoridiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                    kategoribuku = "The ultimate best";
                } else {
                    kategoribuku = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargabeli + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori + "|" + kategoridiskon + "|" + kategoribuku);
            }
        } while (!iSBN.equals("---"));
    }
}
