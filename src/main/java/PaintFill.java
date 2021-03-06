public class PaintFill {

    private static final int rows = 4;
    private static final int columns = 4;

    void changeOldColorWithNewOne (int [][] display, int oldColor, int newColor, int x, int y) {
        //establish base case when limit is reached or when position has different color
        if (y>rows-1||y<0||x>columns||x<0||display[x][y]!=oldColor) {
            return;
        }
        //changing color from the new one
        display[x][y]=newColor;
        //moving to below
        changeOldColorWithNewOne(display, oldColor, newColor, y-1, x);
        //moving to above
        changeOldColorWithNewOne(display, oldColor, newColor, y+1, x);
        //moving to left
        changeOldColorWithNewOne(display, oldColor, newColor, y, x-1);
        //moving to right
        changeOldColorWithNewOne(display, oldColor, newColor, y, x+1);
    }

    //main just to can look what I'm doing
/*    public static void main(String[] args) {

        PaintFill  paintFill = new PaintFill();

        int display[][] = {
		              {8, 8, 4, 8},
                      {8, 0, 0, 8},
                      {8, 0, 0, 8},
                      {8, 0, 0, 8}};

        *//*int display[][] = {
                {8, 8, 8, 8, 8, 8, 8, 8},
                {8, 0, 0, 4, 0, 0, 0, 8},
                {8, 0, 0, 4, 0, 0, 0, 8},
                {8, 0, 0, 4, 0, 0, 0, 8},
                {8, 0, 0, 4, 0, 0, 0, 8},
                {8, 0, 0, 4, 0, 0, 0, 8},
                {8, 0, 0, 0, 0, 0, 0, 8},
                {8, 0, 0, 0, 0, 0, 0, 8},
        };*//*


        //Getting the oldColor
        int oldColor = display[2][1];
        //int oldColor = display[3][6];
        int newColor = 1;

        paintFill.changeOldColorWithNewOne(display, oldColor, newColor, 2, 1);

        //Printing the display with the new color replaced
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                System.out.print(display[i][j] + " ");
            }
            System.out.println();
        }
    }*/
}
