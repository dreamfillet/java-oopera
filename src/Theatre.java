import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Ivan", "Petrov", Gender.MALE, 170);
        Actor actor2 = new Actor("Alla", "Lapshina", Gender.FEMALE, 160);
        Actor actor3 = new Actor("Alex", "Oliver", Gender.MALE, 180);
        Director director1 = new Director("Nikolay", "Semenov", Gender.MALE,10);
        Director director2 = new Director("Jane", "Star", Gender.FEMALE, 20);
        MusicAuthor musicAuthor = new MusicAuthor("Maxim", "Bodrov", Gender.MALE);
        Choreographer choreographer = new Choreographer("Semen", "Lamin", Gender.MALE);

        Show show = new Show("Spektakl", 120, director1, new ArrayList<>());
        Opera opera = new Opera("Opera", 150, director2, new ArrayList<>(), musicAuthor, "Либретто1", 30);
        Ballet ballet = new Ballet("Ballet", 200, director2, new ArrayList<>(), musicAuthor, "Либретто2", choreographer);

        show.addNewActor(actor1);
        show.addNewActor(actor2);
        opera.addNewActor(actor1);
        opera.addNewActor(actor3);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);

        System.out.println("Список актеров в обычном спектакле:");
        show.printListOfActors();
        System.out.println();
        System.out.println("Список актеров в оперном спектакле:");
        opera.printListOfActors();
        System.out.println();
        System.out.println("Список актеров в баллетном спектакле:");
        ballet.printListOfActors();
        System.out.println("_______");

        System.out.println("Список актеров в обычном спектакле при замене:");
        show.replaceActorToAnother(actor3, "Petrov");
        show.printListOfActors();
        System.out.println("_______");

        System.out.println("Замена в оперном спектакле на несуществующего актера:");
        opera.replaceActorToAnother(actor2, "Kuzmin");
        System.out.println("_______");

        System.out.println("Текст либретто для оперного спектакля:");
        opera.printLibretto();
        System.out.println("Текст либретто для баллетного спектакля:");
        ballet.printLibretto();
        System.out.println("_______");

        System.out.println("Печать информации о режиссере спектаклей");
        System.out.println("Обычный спектакль:");
        show.printDirectorName();
        System.out.println("Оперный спектакль:");
        opera.printDirectorName();
        System.out.println("Баллетный спектакль:");
        ballet.printDirectorName();



    }
}
