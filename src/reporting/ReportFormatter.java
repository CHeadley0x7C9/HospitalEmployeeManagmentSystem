package reporting;


public class ReportFormatter {
	
	String formattedOuput;
	
	public ReportFormatter(Object object,FormatType formatType) {
		switch(formatType) {
		case XML:
			formattedOuput = convertObjectToXML(object);
			break;
		case CSV:
			formattedOuput = convertObjectToCSV(object);
			break;
		}
		
	}
	
	private String convertObjectToXML(Object object) {
		
		return "XML : <title>"+object.toString()+ "</title>";
		
	}
	
	private String convertObjectToCSV(Object object) {
		
		return "CSV:, , ,"+object.toString()+",,,";
		
	}
	
	protected String getFormattedValue() {
		
		return formattedOuput;
	}
	
	
}
