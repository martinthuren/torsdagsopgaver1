/*I denne opgave skal du brug substring metoden.

2.a Lav en metode, printPartOfWord(), med tre 
parametre: 
1. parameter er ordet, 
2. parameter er index for det bogstav delmængden starter med
 og 3. parameter er længden på delmængden 

Ex: argumenterne "København", 1 og 4 skal give 
 outputtet "øben".*/

class words {
	public static void main(String[] args) {
		String København = "København";
		System.out.println(København)
		System.out.println(København.substring(1,4))
	}
}
