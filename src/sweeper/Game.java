package sweeper;

public class Game {

    private Bomb bomb;
    private Flag flag;

    public Game (int cols, int rows, int bombs)
    {
        Ranges.setSize(new Coord (cols, rows));
        bomb = new Bomb(bombs);
        flag = new Flag();
    }

    public void start()
    {
       bomb.start();
       flag.start();
    }

    public Box getBox(Coord coord)
    {
        if(Box.OPENED == flag.get(coord))
            return bomb.get(coord);
        else
            return flag.get(coord);
    }
}
