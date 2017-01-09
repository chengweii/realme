package weihua.realme.ego.body.me;

import java.util.HashMap;
import java.util.Map;

import weihua.realme.energy.Energy;
import weihua.realme.energy.EnergyType;
import weihua.realme.energy.OriginEnergy;

/**
 * 默认真我
 * 
 * @author chengwei2
 *
 */
public class NormalMe implements Me {
	/**
	 * 能量池
	 */
	private Map<EnergyType, Energy> energyPool = new HashMap<EnergyType, Energy>(EnergyType.values().length);

	public NormalMe() {
		OriginEnergy originEnergy = new OriginEnergy();
		for (EnergyType entity : EnergyType.values()) {
			energyPool.put(entity, originEnergy);
		}
	}

	@Override
	public Energy claimEnergy(EnergyType energyType) {
		Energy givenEnergy = null;
		for (EnergyType entity : EnergyType.values()) {
			if (entity == energyType) {
				givenEnergy = energyPool.get(entity);
			}
		}
		return givenEnergy;
	}

}
