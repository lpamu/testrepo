package my.review3;

import java.lang.annotation.Documented;


@Documented
@interface ClassPreamble {

   // Annotation element definitions
   //Without Use of Enum  you will have to do string compare, prone to typos and errors
}
public class PopulationCalculator
{
	public static double calculatePopulation(String countryName)
	{
		double population = 0.00;

		if(countryName.equals("India"))
		{
			// Set Indian population here.
		}else if (countryName.equals("Australia"))
		{
			// Set population for Aussies here.
		}else if (countryName.equals("England"))
		{
			//Set population value for England here.
		}
		return population;
	}
}