import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage

        boolean running = true;
        while (running){
        System.out.print("$ ");
        
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        String [] segments = command.split(" ", 2);

        if (command.equals("exit")) {
            System.exit(0);

        } else if (segments.length > 1) {

            String firstWord = segments[0];// for echo
            String messages = segments[1];// for words after the first words

            if (firstWord.equals("echo")){
                System.out.println(messages);
                continue;
            }
        }

        System.out.println(command + ": command not found");
        }
    }
}
