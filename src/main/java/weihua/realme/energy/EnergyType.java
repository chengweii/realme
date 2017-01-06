package weihua.realme.energy;

/**
 * 能量类型
 * 
 * @author chengwei2
 *
 */
public enum EnergyType {
	/**
	 * 喜悦
	 */
	GLAD(1, "喜悦"),

	/**
	 * 爱
	 */
	LOVE(2, "爱"),

	/**
	 * 和平
	 */
	PEACE(3, "和平"),

	/**
	 * 其他
	 */
	OTHER(4, "其他");

	private EnergyType(Integer code, String value) {
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

	public static EnergyType fromCode(Integer code) {
		for (EnergyType entity : EnergyType.values()) {
			if (entity.getCode().equals(code)) {
				return entity;
			}
		}
		return null;
	}
}
