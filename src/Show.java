import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor>listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    //Распечатка список всех актёров, участвующих в спектакле.
    public void printListOfActors() {
        for (Actor actor : this.getListOfActors()) {
            System.out.println(actor.getName() + " " + actor.getSurname() + "(" + actor.getHeight() + ")");
        }
    }


    //Добавление нового актера в список спектакля
    public void addNewActor(Actor actor){
        for (Actor existingActor: listOfActors){
            if(existingActor.equals(actor)){
                System.out.println("Такой актер уже есть в списке");
                return;
            }
        }
        listOfActors.add(actor);
    }

    //Замена одного актёра в спектакле на другого
    public void replaceActorToAnother(Actor newActor, String previousActorSurname)
    {
        boolean flag = false;

        for (int i=0;i< listOfActors.size();i++){
            Actor actor = listOfActors.get(i);
            if(actor.getSurname().equals(previousActorSurname)){
             listOfActors.set(i,newActor);
             flag = true;
             break;
            }
        }
        if(!flag) {
            System.out.println("Актера с такой фамилией в списке нет");
        }

    }

    //Распечатка информации о режиссере спектакля
    public void printDirectorName(){
        System.out.println(director.getName() +" " + director.getSurname());

    }


}
