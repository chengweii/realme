package weihua.realme.energy.view;

/**
 * 色相类型
 * 
 * @author chengwei2
 *
 */
public enum ViewType {
	/**
	 * 色
	 */
	SEE(1, "色"),

	/**
	 * 声
	 */
	HEAR(2, "声"),

	/**
	 * 香
	 */
	SMELL(3, "香"),

	/**
	 * 味
	 */
	TASTE(4, "味"),

	/**
	 * 触
	 */
	TOUCH(5, "触"),

	/**
	 * 法
	 */
	THOUGHT(6, "法");

	private ViewType(Integer code, String value) {
		this.code = code;
		this.value = value;
	}

	private Integer code;
	private String value;

	public Integer getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}

	public static ViewType fromCode(Integer code) {
		for (ViewType entity : ViewType.values()) {
			if (entity.getCode().equals(code)) {
				return entity;
			}
		}
		return null;
	}
}
