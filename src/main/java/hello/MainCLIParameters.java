package hello;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=") //space works too
public class MainCLIParameters {

    @Parameter(names = {"-h", "--help"},
            help = true, //if not then will get ..."The following option is required: -p, --profile"
            description = "Displays help information")
    private boolean help;

    @Parameter(names = {"-ct", "--currentTime"},
            description = "Displays the current time")
    private boolean currentTime;

    @Parameter(names = {"-g", "--greeter"},
            description = "Says hello world")
    private String greeter;

    public boolean isHelp() {
        return help;
    }

    public boolean isCurrentTime() {
        return currentTime;
    }

    public String getGreeter() {
        return greeter;
    }

}