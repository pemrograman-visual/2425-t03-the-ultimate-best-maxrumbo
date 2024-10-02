//12S24037-Maxwell Rumahorbo
//12S24030-Swasti Sihombing

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stok, tahunterbit;
        String isbn, judul, penulis, penerbit, formatbukuelektrik, none, kategori, kategorirate, ending, kategoridiskon;
        double hargabeli, minimummargin, rating;

        kategorirate = "";
        do {
            isbn = input.nextLine();
            if (isbn.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatbukuelektrik = input.nextLine();
                hargabeli = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
                if (minimummargin > 0) {
                    kategoridiskon = "---";
                } else {
                    if (minimummargin < -(hargabeli * 0.4)) {
                        kategoridiskon = "Once in a lifetime";
                    } else {
                        if (minimummargin < -(hargabeli * 0.2)) {
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
                                if (rating >= 0 && rating < 3.0) {
                                    kategori = "Low";
                                } else {
                                    kategori = "none";
                                }
                            }
                        }
                    }
                }
            }
            if (kategoridiskon.equals("Once in a lifetime") && kategorirate.equals("Best Pick")) {
                ending = "The Ultimate Best";
            } else {
                ending = "---";
            }
            System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektrik + "|" + hargabeli + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori + "|" + kategorirate + "|" + kategoridiskon + "|" + ending);
        } while (isbn.equals("---"));
    }
}
