package com.cafe24.dk4750.miniMarket.vo;

public class ReportCompanyByMember {
	private int reportNo;
	private String reportTitle;
	private String reportContent;
	private String companyId;
	private String memberUniqueNo;
	private String reportState;
	private String reportDate;
	private String companyCommentNo;
	public int getReportNo() {
		return reportNo;
	}
	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}
	public String getReportTitle() {
		return reportTitle;
	}
	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}
	public String getReportContent() {
		return reportContent;
	}
	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getMemberUniqueNo() {
		return memberUniqueNo;
	}
	public void setMemberUniqueNo(String memberUniqueNo) {
		this.memberUniqueNo = memberUniqueNo;
	}
	public String getReportState() {
		return reportState;
	}
	public void setReportState(String reportState) {
		this.reportState = reportState;
	}
	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getCompanyCommentNo() {
		return companyCommentNo;
	}
	public void setCompanyCommentNo(String companyCommentNo) {
		this.companyCommentNo = companyCommentNo;
	}
	@Override
	public String toString() {
		return "ReportCompanyByMember [reportNo=" + reportNo + ", reportTitle=" + reportTitle + ", reportContent="
				+ reportContent + ", companyId=" + companyId + ", memberUniqueNo=" + memberUniqueNo + ", reportState="
				+ reportState + ", reportDate=" + reportDate + ", companyCommentNo=" + companyCommentNo + "]";
	}
	
}
