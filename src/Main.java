import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // užduotis.

        ArrayList<Book> library = new ArrayList<>();

        Book knyga = new Book();
        knyga.setTitle("Panama labai grazi");
        knyga.setPages(20);
        knyga.setReleaseYear(2000);

        Book knyga2 = new Book();
        knyga2.setTitle("Kakė Makė");
        knyga2.setPages(10);
        knyga2.setReleaseYear(19999);

        Book knyga3 = new Book();
        knyga3.setTitle("Laimė yra lapė");
        knyga3.setPages(15);
        knyga3.setReleaseYear(2023);

        Book book1 = new Book("pavadinimas",10,10);
        Book book2 = new Book ("pavadinimas", 10, 19999);
        Book book3 = new Book("pavadinimas", 15, 2023);

        library.add(knyga);
        library.add(knyga2);
        library.add(knyga3);
        library.add(book1);
        library.add(book2);
        library.add(book3);

        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).getTitle() + " " + library.get(i).getPages() + " " + library.get(i).getReleaseYear() );
        }


        //System.out.println(knyga.getTitle() + "" + knyga.pages + "" + knyga.releaseYear);

//        ArrayList<String> title = new ArrayList<>();
//        title.add("simtas pavasariu");
//
//
//        ArrayList<Integer> pages = new ArrayList<>();
//        pages.add(40);
//
//        ArrayList<Integer> releaseYear = new ArrayList<>();
//        releaseYear.add(knyga);










    }


    }








