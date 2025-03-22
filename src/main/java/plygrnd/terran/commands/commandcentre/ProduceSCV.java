package plygrnd.terran.commands.commandcentre;

import plygrnd.terran.commands.ICommand;

import java.util.UUID;

public class ProduceSCV implements ICommand {
    private UUID Uuid;
    private plygrnd.util.Status Status;

    public ProduceSCV() {
        this.Uuid = java.util.UUID.randomUUID();
    }

    @Override
    public UUID getGuid() {
        return this.Uuid;
    }

    @Override
    public plygrnd.util.Status getStatus() {
        return this.Status;
    }

    public plygrnd.util.Status ProduceSCV() {
        // method here to issue command to MQ to produce SCV
        // todo: add active MQ
        this.Status = plygrnd.util.Status.Initialized;
        return this.Status;
    }
}
