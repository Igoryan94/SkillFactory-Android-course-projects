class Typer extends Thread {
    private static Object lock;
    private final String message;

    public Typer(String message) {
        this.message = message;
        Typer.lock = this;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                // Проходим по символам в сообщении
                for (int i = 0; i < message.length(); i++) {
                    // Печатаем текущий символ
                    System.out.print(message.charAt(i));
                    // Ждем 500 миллисекунд
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}