package Structural.adapter;

// Target interface
interface MediaPlayer {
    void playAudio(String filePath);
}

// Adaptee interface (incompatible)
interface OldFormatPlayer {
    void play(String filePath);
}

// Adapter class (Class Adapter)
class OldFormatMediaPlayerAdapter implements MediaPlayer {
    private OldFormatPlayer oldPlayer;

    public OldFormatMediaPlayerAdapter(OldFormatPlayer oldPlayer) {
        this.oldPlayer = oldPlayer;
    }

    @Override
    public void playAudio(String filePath) {
        this.oldPlayer.play(filePath); // Translate playAudio to play
    }
}
