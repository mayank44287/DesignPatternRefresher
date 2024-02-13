package Structural.Facade;

interface VideoImporter{
    void importVideo(String filepath);
}

interface AudioEditor{
    void adjustVolume(double delta);
    void addSilence(int duration);
}

interface EffectsApplier{
    void applyFilter(String filtername);
    void addTransition(int start, int end);
}

class VideoImporterImpl implements VideoImporter {
    // ..implementation
}

class AudioEditorImpl implements AudioEditor {
    // ... implementation
}

class EffectsApplierImpl implements EffectsApplier {
    // ... implementation
}

// Facade providing simplified Interface
class VideoEditorFacade{
    private VideoImporter importer;
    private AudioEditor editor;
    private EffectsApplier applier;

    public VideoEditorFacade(){
        this.importer = new VideoImporterImpl();
        this.editor = new AudioEditorImpl();
        this.applier = new EffectsApplierImpl();
    }

    void createSimpleVideo(String filepath, String filter){
        importer.importVideo(filepath);
        editor.adjustVolume(0.5);
        applier.applyFilter(filter);
        // Additional simplified methods using underlying functionalities
    }
}

/***
 * The VideoEditorFacade hides the complexity of individual modules and provides a simple API for common video creation scenarios.
 * Clients like the Client class can easily create videos with minimal knowledge of the underlying subsystems.
 * Changes within a subsystem (e.g., audio editing) wouldn't directly impact the Client code as long as the facade interface remains consistent.
 */

class Client{
    public static void main(String[] args) {
        VideoEditorFacade editor = new VideoEditorFacade();
        editor.createSimpleVideo("my_video.mp4","grayscale");
    }
}