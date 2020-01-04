package cn.erp.util;

import java.util.ArrayList;
import java.util.List;

public class PageResult {

	private long totalCount;//总记录数
	private int pageNo;//当前页数
	private int totalPageCount;//总页数
	private int pageSize;//页大小
	private List<?> items;//列表记录
	private int defaultSize = 3;//默认页数
	private int beginNo;//开始记录数
	
	
	
	//总页数 = 总记录数/页大小
	
	public int getBeginNo() {
		return beginNo;
	}
	public void setBeginNo(int beginNo) {
		this.beginNo = beginNo;
	}
	public int getDefaultSize() {
		return defaultSize;
	}
	public void setDefaultSize(int defaultSize) {
		this.defaultSize = defaultSize;
	}
	//计算总页数
	/*public PageResult(long totalCount, int pageNo, int pageSize, List items) {
		//super();
		this.items = items==null?new ArrayList():items;
		this.totalCount = totalCount;
		
		
		this.pageSize = pageSize;
		if(totalCount != 0){
			//计算总页数
			int tem=(int) (totalCount/pageSize);
			this.totalPageCount=(totalCount%pageSize==0)?tem:(tem+1);
		}else {
			this.pageNo = 0;
		}
	}*/
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List getItems() {
		return items;
	}
	public void setItems(List items) {
		this.items = items;
	}
	
	
	
}
