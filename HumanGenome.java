
public class HumanGenome {
		private String GenomeName;
		private static int NumberOfGenes;
		private static int NumberOfChromosomes;
		private int NumberOfCells;

 public HumanGenome() {}

 public HumanGenome(String GenomeName,int NumberOfGenes, int NumberOfChromosomes,int NumberOfCells) {

	 this.GenomeName = GenomeName;
	 HumanGenome.NumberOfGenes = NumberOfGenes;
     HumanGenome.NumberOfChromosomes = NumberOfChromosomes;
	 this.NumberOfCells = NumberOfCells;
}
 //getters and setters
public String getGenomeName() {
	return GenomeName;
}

public  void setGenomeName(String genomeName) {
	this.GenomeName = genomeName;
}

public int getNumberOfGenes() {
	return NumberOfGenes;
}

public void setNumberOfGenes(int numberOfGenes) {
	HumanGenome.NumberOfGenes = numberOfGenes;
}

public int getNumberOfChromosomes() {
	return NumberOfChromosomes;
}

public void setNumberOfChromosomes(int numberOfChromosomes) {
	HumanGenome.NumberOfChromosomes = numberOfChromosomes;
}

public int getNumberOfCells() {
	return NumberOfCells;
}

public void setNumberOfCells(int numberOfCells) {
	this.NumberOfCells = numberOfCells;
}
// uses static/instance variables 
 public void print() {

	System.out.printf("\nName:%s", this.GenomeName);
	System.out.printf("\nNumber of Genes:%d",HumanGenome.NumberOfGenes);
	System.out.printf("\nNumber of Chromosomes:%d",HumanGenome.NumberOfChromosomes);
	System.out.printf("\nNumber of Cells(trillions):%d",this.NumberOfCells);
	System.out.printf("\n\n");
 }

 //uses getters to get user input values
 public void print2() {


	System.out.printf("\nName:%s", getGenomeName());
	System.out.printf("\nNumber of Genes:%d",getNumberOfGenes());
	System.out.printf("\nNumber of Chromosomes:%d",getNumberOfChromosomes());
	System.out.printf("\nNumber of Cells(trillions):%d",getNumberOfCells());
	System.out.printf("\n\n");
	 }


}
