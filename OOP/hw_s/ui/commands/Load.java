package hw_s.ui.commands;

import hw_s.ui.Console;

public class Load extends Command {
    public Load(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Загрузить древо семьи.";
    }

    @Override
    public void execute() {
        getConsole().loadFamily();
    }
}
