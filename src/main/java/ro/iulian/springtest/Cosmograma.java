package ro.iulian.springtest;

public class Cosmograma implements CompactDisc {

    private String artist = "Flying Lotus";
    private String title = "Cosmograma";

    @Override
    public void play() {
        System.out.println("Playing cd " + title + "by artist " + artist);
    }
}
