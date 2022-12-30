public class DVD
{
    String name;
    int releaseYear;
    String director;
    
    DVD(String name, int releaseYear, String director){
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }
    
    public String toString(){
        return this.name+", Directed by: "+this.director+", Released in: "+this.releaseYear;
    }
    
    public static void main(String[] args){
        DVD[] dvdCollection = new DVD[15];

        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        
        dvdCollection[0] = avengersDVD;
        dvdCollection[1] = incrediblesDVD;
        dvdCollection[5] = findingDoryDVD;
        dvdCollection[9] = lionKingDVD;
        
        System.out.println(dvdCollection[1]);
        System.out.println(dvdCollection.length);
    }
}