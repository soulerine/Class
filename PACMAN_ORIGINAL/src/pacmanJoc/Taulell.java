package pacmanJoc;

public class Taulell {
	
	
	
	private char table[][]=new char [19][17];
	

	public Taulell() {
	
		 table = new char[][] {
			      "###################".toCharArray()
			    , "#........#........#".toCharArray()
			    , "#.##.###.#.###.##.#".toCharArray()
			    , "#.................#".toCharArray()
			    , "#.##.#.#####.#.##.#".toCharArray()
			    , "#....#...#...#....#".toCharArray()
			    , "####.###.#.###.####".toCharArray()
			    , "####.#.......#.####".toCharArray()
			    , "####.#.#####.#.####".toCharArray()
			    , "####.#.......#.####".toCharArray()
			    , "####.###.#.###.####".toCharArray()
			    , "#....#...#...#....#".toCharArray()
			    , "#.##.#.#####.#.##.#".toCharArray()
			    , "#.................#".toCharArray()
			    , "#.##.###.#.###.##.#".toCharArray()
			    , "#........#........#".toCharArray()
			    , "###################".toCharArray()
			   
			  };
		 	 
	}
	
	public void impimeixtaula(){
	
	for (int i=0;i<17;i++){
		for (int x=0;x<19;x++){
		System.out.print(table[i][x]+" ");
		
		}
		System.out.println("");
	}
	
	
	
	
	
	}



}
