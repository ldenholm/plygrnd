package plygrnd.terran.services;

import plygrnd.terran.services.interfaces.ICommandCentreService;
import plygrnd.util.Status;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CommandCentreService implements ICommandCentreService {
    private Logger _logger;
    public CommandCentreService(Logger logger) {
        this._logger = logger;
    }

    public Status ProduceSCV() {
        _logger.log(Level.INFO, "Testing this logger.");
        return Status.Complete;
    }
}
