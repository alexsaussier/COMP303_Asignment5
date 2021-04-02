/**
 * An interface that represents the subjects in the Observer Pattern
 * Extended by Watchable - Stores the information about the last watched element in a WatchList
 */
public interface Model {

    Watchable lastWatchedElement(Watchable pWatchable);


}
