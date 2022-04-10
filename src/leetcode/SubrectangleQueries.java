package leetcode;

public class SubrectangleQueries {
int[][] newrectangle;
    public SubrectangleQueries(int[][] rectangle) {
        this.newrectangle=rectangle;



    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i=row1;i<=row2;i++)
        {
            for (int c=col1;c<=col2;c++)
            {
                newrectangle[i][c]=newValue;
            }
        }

    }

    public int getValue(int row, int col) {
        return newrectangle[row][col];

    }
}
