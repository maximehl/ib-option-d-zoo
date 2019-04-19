public class Genus {
    private String genusName;

    public Genus(String g){
        setGenusName(g);
    }

    public String getGenusName(){
        return this.genusName;
    }

    public void setGenusName(String g) {
        this.genusName = g;
    }

    public String toString(){
        return "Genus: " + this.getGenusName();
    }
}
