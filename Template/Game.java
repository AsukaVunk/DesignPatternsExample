package Template;

public abstract class Game {
    abstract void intialize();
    abstract void startPlay();
    abstract void endPlay();
    /* 模板 */
    public final void play(){
        intialize();
        startPlay();
        endPlay();
    }
}
