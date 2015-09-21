public class LaunchBidAskScrape {
	@SuppressWarnings("static-access")
	static String stock;
	public static void main(String[] args) throws Exception {
		GetProperties gp = new GetProperties();
		BidAskScrape bas = new BidAskScrape();
		stock = gp.selectStock();
		bas.main(null);
	}
	
	String setUrl() {
		String finurl = "http://finance.yahoo.com/q?s=" + stock;
		return finurl;
		
	}
}
