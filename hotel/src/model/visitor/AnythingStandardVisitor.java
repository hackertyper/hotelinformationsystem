
package model.visitor;

import persistence.*;

public abstract class AnythingStandardVisitor implements AnythingVisitor {
    
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException{
        this.standardHandling(commandCoordinator);
    }
    public void handleServer(PersistentServer server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException{
        this.standardHandling(errorDisplay);
    }
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException{
        this.standardHandling(commonDate);
    }
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException{
        this.standardHandling(commandExecuter);
    }
    protected abstract void standardHandling(Anything anything) throws PersistenceException;
}
