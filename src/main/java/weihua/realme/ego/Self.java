package weihua.realme.ego;

import weihua.realme.ego.body.Body;
import weihua.realme.ego.body.NormalBody;
import weihua.realme.energy.Energy;

/**
 * 自己(小我)
 * 
 * @author chengwei2
 *
 */
public class Self implements Ego {
	
	/**
	 * 身体
	 */
	public Body body = new NormalBody();

	@Override
	public void claimEnergy(Energy energy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void consumeEnergy(Energy energy) {
		// TODO Auto-generated method stub
		
	}

}
