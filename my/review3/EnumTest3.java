package my.review3;

import java.util.HashMap;
import java.util.Map;

public enum EnumTest3 {

	USA("037", "USA"), CANADA("001", "CANADA");

	/**
	 * Object to do the lookup of
	 */
	private static final Map<String, EnumTest3> LOOKUP = new HashMap<String, EnumTest3>();

	static {
		for (EnumTest3 marketName : EnumTest3.values()) {
			LOOKUP.put(marketName.getMarketCode(), marketName);
		}
	}

	public static EnumTest3 get(String marketCode) {
		return LOOKUP.get(marketCode);
	}

	private final String marketCode;

	private final String marketName;

	private EnumTest3(String marketCode, String marketName) {
		this.marketCode = marketCode;
		this.marketName = marketName;
	}

	public String getMarketCode() {
		return marketCode;
	}

	public String getMarketName() {
		return marketName;
	}
	 public static void main(String[] args) {
		 String str = "037";
		 System.out.println("EnumTestMarketCode 0f " + str + " is : " + EnumTest3.get(str) );
		 	
	 }
}