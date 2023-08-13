package hw_s.ui.commands;

import hw_s.ui.Console;

public class SortName extends Command {
    public SortName(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сортировка семьи по имени.";
    }

    @Override
    public void execute() {
        getConsole().sortFamilyName();
    }
}
