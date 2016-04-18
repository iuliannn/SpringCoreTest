package ro.iulian.springtest;

public class CDPlayer  {


    private CompactDisc cd;

    public void playCD(){
        cd.play();
    }

    public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
