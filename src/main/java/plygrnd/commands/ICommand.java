package plygrnd.commands;

import plygrnd.util.CommandStatus;

public interface ICommand {
    public String getGuid();
    public CommandStatus getStatus();
}
