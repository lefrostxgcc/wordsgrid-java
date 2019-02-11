public class Program {
    Frame frame;

    public static void main(String[] args) {
	Program program = new Program();
	program.start();
    }

    public void start() {
	frame = new Frame("Words in boxes");
    }
}
