package net.tsol.contributions;

public class Contribution {
    public Contribution() {}

    public String getName() { return name;}
    public void setName(String name) { this.name = name;}

    public String setUrl() { return url;}
    public void setUrl(String url) { this.url = url;}

    private String name;
    private String url;
}
