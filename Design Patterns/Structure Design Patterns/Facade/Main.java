public class Main {

    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector);
        homeTheater.watchMovie(); // Simplified method call to start the movie
    }
}