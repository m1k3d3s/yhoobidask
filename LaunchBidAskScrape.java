public class LaunchBidAskScrape {
	@SuppressWarnings("static-access")
	static String stock;
	static String url;
	public static void main(String[] args) throws Exception {
		GetProperties gp = new GetProperties();
		stock = gp.selectStock();
		url = gp.selectUrl();
		BidAskScrape.main(null);
	}
	
	String setUrl() {
		String finurl = url + stock;
		return finurl;
		
	}
}
