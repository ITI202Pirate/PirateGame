package pirateGame;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MapTester {

	
	 private final int width, height;
	
	 private final char[][] grid;
	
	 public  MapTester(int w, int h) {
		    width = w;
		    height = h;
		    grid = new char[h][];

		    // init the grid will blank cell
		    for (int i = 0; i < h; i++) {
		      Arrays.fill(grid[i] = new char[w], '.');
		    }
		  }
	 public String toString() {
		    return IntStream.range(0, 0).
		           mapToObj(Integer::toString).
		           collect(Collectors.joining()) + 
		           "\n" +
		           Arrays.stream(grid).
		           map(String::new).
		           collect(Collectors.joining("\n"));
		  }
	 
	 public static void main(String[] args) {
		    // we assemble all the pieces of the puzzle for 
		    // building our Connect Four Game
		   
		// try (Scanner input = new Scanner(System.in)) {
		      // we define some variables for our game like 
		      // dimensions and nb max of moves
		      int height = 10; int width = 20; int moves = height * width;

		      // we create the ConnectFour instance
		      MapTester board = new MapTester(width, height);

		      // we display initial board
		      //System.out.println(board);
		    System.out.println(  board.toString());

		      // we iterate until max nb moves be reached
		      // simple trick to change player turn at each iteration
		    //  for (int player = 0; moves-- > 0; player = 1 - player) {
		        // symbol for current player
		        

		       
		      }
		    
		  }
	 