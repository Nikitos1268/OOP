package hw_s.ui.commands;

import hw_s.ui.Console;

public class AddHuman extends Command {
    public AddHuman(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавление человека в семью.";
    }

    @Override
    public void execute() {
        getConsole().addHumanNew();
    }
}
