package cn.itcast.core.bean.product;

import java.io.Serializable;
/**
 * 品牌
 * @author lx
 *
 */
public class BrandQuery implements Serializable{

	/**
	 * 默认的ID
	 */
	private static final long serialVersionUID = 1L;
	
	//品牌ID  bigint
	private Long id;
	//品牌名称
	private String name;
	//描述
	private String description;
	//图片URL
	private String imgUrl;
	//排序  越大越靠前   
	private Integer sort;
	//是否可用   0 不可用 1 可用
	private Integer isDisplay;//is_display
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", description="
				+ description + ", imgUrl=" + imgUrl + ", sort=" + sort
				+ ", isDisplay=" + isDisplay + "]";
	}
	//附加字段
	//设置每页数的常量
	private static final Integer DEFAULT_PAGESIZE = 10;
	//当前页  最小是1的整数
	private Integer pageNo = 1;
	//每页数
	private Integer pageSize = DEFAULT_PAGESIZE;
	
	// limit 开始行,每页数
	private Integer startRow;
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		//开始计算开始行
		startRow = (pageNo-1)*pageSize;
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		//设置显示记录数时再计算一次开始行防止显示数变化造成的开始行计算错误
		startRow = (pageNo-1)*pageSize;
		this.pageSize = pageSize;
	}

}
