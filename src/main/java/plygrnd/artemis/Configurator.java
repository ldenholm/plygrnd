package plygrnd.artemis;

import org.apache.activemq.artemis.core.config.Configuration;
import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import plygrnd.util.Settings;

public class Configurator {
    public Configurator() {
    }

    public void configureArtemis(Settings settings) {
        Configuration config = new ConfigurationImpl();

        config.addAcceptorConfiguration("in-vm");
        config.addAcceptorConfiguration("tcp", "tcp://127.0.0.1:61616");
    }
}
