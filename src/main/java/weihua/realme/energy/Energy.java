package weihua.realme.energy;

/**
 * 能量
 * 
 * @author chengwei2
 *
 */
public interface Energy {

	/**
	 * 能量类型
	 */
	public EnergyType energyType = null;
	
	/**
	 * 能量值(有正负)
	 */
	public long energyValue = 0;
}
