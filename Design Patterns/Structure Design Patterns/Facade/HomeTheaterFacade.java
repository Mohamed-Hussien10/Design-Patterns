class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(DVDPlayer dvd, Projector proj) {
        this.dvdPlayer = dvd;
        this.projector = proj;
    }

    public void watchMovie() {
        dvdPlayer.turnOn();
        projector.turnOn();
        projector.focus();    
        dvdPlayer.play();
    }
}