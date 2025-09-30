package br.com.mariojp.solid.isp;

public class OfficeService {
	private final Printer printer;
	private final Scanner scanner;
	
	public OfficeService(Scanner scanner) {
		this.printer = null;
		this.scanner = scanner;
	}
	
	public OfficeService(Printer printer) {
		this.printer = printer;
		this.scanner = null;
	}
	
	public OfficeService(MultiFunctionDevice device) {
		this.printer = device;
		this.scanner = device;
	}
	
    public void printReport(String content){
        printer.print(content);
    }
    
    public void scanReport(String content) {
        scanner.scan("audit.txt");
    }
}
