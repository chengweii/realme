package weihua.realme.ego;

import java.util.HashMap;
import java.util.Map;

import weihua.realme.ego.body.Body;
import weihua.realme.ego.body.NormalBody;
import weihua.realme.ego.body.emotion.Emotion;
import weihua.realme.ego.body.emotion.NormalEmotion;
import weihua.realme.ego.body.me.Me;
import weihua.realme.ego.body.me.NormalMe;
import weihua.realme.ego.body.thinking.NormalThinking;
import weihua.realme.ego.body.thinking.Thinking;
import weihua.realme.ego.body.thinking.identity.Identity;
import weihua.realme.ego.body.thinking.identity.NormalIdentity;
import weihua.realme.ego.body.thinking.subconsciousness.NormalSubconsciousness;
import weihua.realme.ego.body.thinking.subconsciousness.Subconsciousness;
import weihua.realme.energy.Energy;
import weihua.realme.energy.EnergyType;

/**
 * 小我
 * 
 * @author chengwei2
 *
 */
public interface Ego {

	/**
	 * 身体
	 */
	public Body body = null;

	/**
	 * 真我
	 */
	public Me me = new NormalMe();

	/**
	 * 能量池
	 */
	public Map<EnergyType, Energy> energyPool = new HashMap<EnergyType, Energy>(EnergyType.values().length);

	/**
	 * 索取能量
	 * 
	 * @param energy
	 */
	public void claimEnergy(Energy energy);

	/**
	 * 消费能量
	 * 
	 * @param energy
	 */
	public void consumeEnergy(Energy energy);
}
