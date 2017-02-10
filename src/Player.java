/**
 * Created by tony on 10/02/2017.
 */
abstract public class Player {

    /* If there are multiple players we could set PlayerID's so coded the structure like this */
    /* Since we are only using one player i'm not going to use it */
    protected int playerID;

    abstract public void move();

    protected void fillCoordinate(int x, int y, int playerID) {
        Game.getInstance().getGrid().getCoordinate(x, y).setContent(playerID);
    }

    protected Grid getGrid() {
        return Game.getInstance().getGrid();
    }

    public int getPlayerID() {
        return playerID;
    }
}
