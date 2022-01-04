
public class JobTitle {
	
	private Integer jobtitleNo;
	private String jobtitleName;
	
	
	public JobTitle(Integer jobtitleNo, String jobtitleName) {
		this.jobtitleNo = jobtitleNo;
		this.jobtitleName = jobtitleName;
	}


	public Integer getJobtitleNo() {
		return jobtitleNo;
	}


	public void setJobtitleNo(Integer jobtitleNo) {
		this.jobtitleNo = jobtitleNo;
	}


	public String getJobtitleName() {
		return jobtitleName;
	}


	public void setJobtitleName(String jobtitleName) {
		this.jobtitleName = jobtitleName;
	}
	
	public String toString() {
		return "JobTitle [jobtitleNo=" + jobtitleNo + ", jobtitleName=" + jobtitleName + "]";
	}

}
