import java.util.Scanner;

public class GenomeInput {
	// made these instance variables static as theyre unchanging in the example input values
	int NumeberofGenes=20000;
	int NumberofChromosomes=46;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.printf("A standard human has 20000 cells and 46 chromosomes\n");
		System.out.printf("Add additional information to short prompts to complete the human genome\n\n");
		
		GenomeInput GI=new GenomeInput();

		//uses first  input method
		  HumanGenome Goofy=GI.HumanGenomeInput();
			System.out.printf("\n");
		
			//uses second input method
		  HumanGenome Hercules=GI.HumanGenomeInput2();
			System.out.printf("\n");
			
			//uses first  input method
		  HumanGenome Pluto=GI.HumanGenomeInput();
		 
		 //objects calling HumanGenome print method 
		  Goofy.print();
		  Pluto.print();
		 
		  //uses secondary print method 
		  Hercules.print2();
		 
		  
		  input.close();
		  System.exit(0);
	}
	
	public HumanGenome HumanGenomeInput() {

		  System.out.printf("What is your Disney name?:");
		 		String Name= input.next();
		 
	       System.out.printf("The number of trillions of cells in your body?:");
	        	int Cells=input.nextInt();
	        
	       //new object of human genome returned to main method
	        	return new HumanGenome(Name,NumeberofGenes,NumberofChromosomes,Cells);
	}


	//uses setters
	public HumanGenome HumanGenomeInput2() {
		
		HumanGenome humanGenome = new HumanGenome();
		 
		System.out.printf("What is your Disney name??:");
			String Name= input.next();
		humanGenome.setGenomeName(Name);

		humanGenome.setNumberOfGenes(NumeberofGenes);
	
		humanGenome.setNumberOfChromosomes(NumberofChromosomes);
		 
	    System.out.printf("The number Of trillion of cells in your body??:");
	        int Cells=input.nextInt();
		 humanGenome.setNumberOfCells(Cells);
		
		return humanGenome;
		
	}
	



}
