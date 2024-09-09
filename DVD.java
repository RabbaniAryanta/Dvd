package BuatBaru2;
public class DVD extends Produk2 {
    // variable
    private int length;
    private String studio;
    private String rating;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    //Override
    public void print() {
        super.print();
        System.out.println("Length\t :" + length);
        System.out.println("Studio\t :" + studio);
        System.out.println("Rating\t :" + rating);
    }



    
}
