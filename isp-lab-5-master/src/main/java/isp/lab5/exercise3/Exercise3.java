package isp.lab5.exercise3;

interface Playable {
    void play();
}

class ColorVideo implements Playable {

    private String fileName;

    public ColorVideo(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video... " + fileName);
    }
}

class BlackAndWhiteVideo implements Playable {
    private String fileName;
    
     public BlackAndWhiteVideo(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play black and white video " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading black and white video... " + fileName);
    }
}

class ProxyVideo implements Playable {

    private ColorVideo colorVideo;
    private String fileName;
    private BlackAndWhiteVideo grayVideo;
    public ProxyVideo(String fileName,BlackAndWhiteVideo grayVideo){
        this.fileName = fileName;
        this.grayVideo=grayVideo;
    }
    public ProxyVideo(String fileName,ColorVideo colorVideo){
        this.fileName = fileName;
        this.colorVideo=colorVideo;
    }

    @Override
    public void play() {
        if(colorVideo != null){
            colorVideo.play();
        }
        if(grayVideo != null)
        {
            grayVideo.play();
        }
    }
}

public class Exercise3 {
    public static void main(String[] args) {
    ColorVideo EldenRings = new ColorVideo("EldenRings");
    EldenRings.play();
    BlackAndWhiteVideo Tetris = new BlackAndWhiteVideo("Tetris");
    Tetris.play();
    ProxyVideo Game1 = new ProxyVideo("EldenRings",EldenRings);
    Game1.play();
    ProxyVideo Game2 = new ProxyVideo("Tetris",Tetris);
    Game2.play();
    }
}
