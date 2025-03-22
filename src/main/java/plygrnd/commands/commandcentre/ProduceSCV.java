package plygrnd.commands.commandcentre;

import plygrnd.commands.ICommand;
import plygrnd.util.CommandStatus;

public class ProduceSCV implements ICommand {
    private String Guid;
    private CommandStatus Status;

    @Override
    public String getGuid() {
        return this.Guid;
    }

    @Override
    public CommandStatus getStatus() {
        return this.Status;
    }

    public CommandStatus ProduceSCV() {
        // method here to issue command to MQ to produce SCV
        this.Status = CommandStatus.Initialized;
        return this.Status;
    }
}
