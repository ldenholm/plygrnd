package plygrnd.terran.commands;

import plygrnd.util.Status;

import java.util.UUID;

public interface ICommand {
    public UUID getGuid();
    public Status getStatus();
}
