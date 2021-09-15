package hello;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import java.util.Objects;

public class Main {

    final MainCLIParameters mainArgs = new MainCLIParameters();

    public static void main(String[] args) {
        Main demo = new Main();
        demo.handleInputArgs(args);
    }

    void handleInputArgs(String args[]) {
        JCommander jCommander = new JCommander(mainArgs);
        jCommander.setProgramName("HelloWorld");

        try {
            jCommander.parse(args);
        } catch (ParameterException exception) {
            System.out.println(exception.getMessage());
            showUsage(jCommander);
        }

        if (mainArgs.isHelp()) {
            showUsage(jCommander);
        }

        if (mainArgs.isCurrentTime()) {
            HelloWorld.printCurrentTime();
        }

        if (Objects.nonNull(mainArgs.getGreeter())) {
            Greeter.sayHello(mainArgs.getGreeter());
        }

        if (args == null || args.length == 0) {
            HelloWorld.printCurrentTime();
        }
    }

    void showUsage(JCommander jCommander) {
        jCommander.usage();
        System.exit(0);
    }
}
