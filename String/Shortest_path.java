 public class  Shortest_path  {

    public static float getShortestPath(String path)
    {
        int x=0 , y=0;

        for(int i=0;i<path.length(); i++)
        {
            char dir = path.charAt(i);

            //south
            if(dir == 'S')
            {
                y--;
            }

            //North
            else if(dir == 'N')
            {
                y++;
            }

            //West
            else if(dir == 'W')
            {
                x--;
            }

            //East
            else
            {
                x++;
            }
             
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) 
    {
        String path1 = "WNEENESENNN";
        String path2 = "NEWS";
        String path3 = "NS";
        String path4 = "NNNNNNNNNNN";
        
        System.out.println("Shoertesr Path for 1 : "+getShortestPath(path1));
        System.out.println("Shoertesr Path for 2 : "+getShortestPath(path2));
        System.out.println("Shoertesr Path for 3 : "+getShortestPath(path3));
        System.out.println("Shoertesr Path for 4 : "+getShortestPath(path4));
    }
}
