public class Timer extends Thread {
    private final TimerListener listener;

    public Timer(TimerListener listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.listener.signalPerformed();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
