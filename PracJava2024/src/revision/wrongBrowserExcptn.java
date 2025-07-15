package revision;

public class wrongBrowserExcptn {

	public void selectBrowser(String browser) {
		switch(browser) {
		case "chrome":
			System.out.println("Chrome Launched!");
			break;
		case "safari":
			System.out.println("Safari Launched!");
			break;
		case "edge":
			System.out.println("Edge Launched!");
			break;
		default:
			throw new wrongBrowserSelectedException("Wrong browser passed!");
		}
	}
	
	public static void main(String[] params) {
		wrongBrowserExcptn wbe = new wrongBrowserExcptn();
		wbe.selectBrowser("edged");
	}
	
}
