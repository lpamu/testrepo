package my.review3;


public class EnumTest1 {

	public static void main(String[] args) {

		Country[] countries = Country.values();

		for(Country country : countries){
			System.out.println(country.toString() + ": Oridinal Value->" + country.ordinal());
			System.out.println(country.toString() + ": Population ->" + calculatePopulation(country));
		}
	}
	
	public static double calculatePopulation(Country country)
	{
		double population = 0.00;

		if(Country.INDIA.equals(country))
		{
			// Set Indian population here.
			population = 5.00;
		}else if (Country.AUSTRALIA.equals(country))
		{
			// Set population for Aussies here.
			population = 3.00;
		}else if (Country.ENGLAND.equals(country))
		{
			//Set population value for England here.
			population = 2.00;
		}
		return population;
	}
}
