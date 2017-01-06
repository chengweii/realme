package weihua.realme.energy.view;

import weihua.realme.energy.Energy;
import weihua.realme.energy.EnergyType;

/**
 * 色相(色、声、香、味、触、法)
 * 
 * @author chengwei2
 *
 */
public interface View extends Energy {

	/**
	 * 能量类型
	 */
	public EnergyType energyType = EnergyType.OTHER;

	/**
	 * 色相类型
	 */
	public ViewType viewType = null;

}
