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
        System.out.println("Loading video..." + fileName);
    }
}

class ProxyVideo implements Playable {

    private ColorVideo video;
    private String fileName;

    public ProxyVideo(Playable p){
        p.play();
    }

    @Override
    public void play() {
        if(video == null){
            video = new ColorVideo(fileName);
        }
        video.play();
    }
}


class BlackAndWhiteVideo implements Playable {
    private String fileName;

    public BlackAndWhiteVideo(String fileName){
        this.fileName = fileName;
    } 
    
    @Override
    public void play() {
        System.out.println("Play black and white video " + fileName);
        
    }
}


public class Exercise3 {
    public static void main(String[] args) {
        Playable p = new BlackAndWhiteVideo("<<<black and white video>>>");
        ProxyVideo proxy = new ProxyVideo(p);
        
        p = new ColorVideo("<<<color video>>>");
        
        proxy = new ProxyVideo(p);
       
        
    }
}
