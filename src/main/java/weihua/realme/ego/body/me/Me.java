package weihua.realme.ego.body.me;

import java.util.HashMap;
import java.util.Map;

import weihua.realme.energy.Energy;
import weihua.realme.energy.EnergyType;

/**
 * 真我
 * 
 * @author chengwei2
 *
 */
public interface Me {
	/**
	 * 能量池
	 */
	public Map<EnergyType, Energy> energyPool = null;

	/**
	 * 索取能量
	 * 
	 * @param energyType
	 */
	public Energy claimEnergy(EnergyType energyType);
}
