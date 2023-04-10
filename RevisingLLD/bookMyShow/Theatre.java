class  Theatre{
    int id;
    String address;
    List<Screen> screen= new ArrayList<>();
    List<Show>shows = new ArrayList<>();

    public int getTheatreId(int id) {
        return id;
    }
    public void setTheatreId (int id){
        this.id = id;
    }
    public String getAdrres (int id){
        this.id = id;
    }

    public List<Screen> getScreen() {
        return screen;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public java.lang.String getAddress() {
        return address;
    }

    public void setScreen(List<Screen> screen) {
        this.screen = screen;
    }
}