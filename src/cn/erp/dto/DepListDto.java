package cn.erp.dto;

import java.util.List;

public class DepListDto {

	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "DepList [total=" + total + ", rows=" + rows + "]";
	}
	
	
}
