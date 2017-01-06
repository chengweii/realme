package weihua.realme.ego;

import java.util.HashMap;
import java.util.Map;

import weihua.realme.body.Body;
import weihua.realme.emotion.Emotion;
import weihua.realme.energy.Energy;
import weihua.realme.energy.EnergyType;
import weihua.realme.identity.Identity;
import weihua.realme.me.Me;
import weihua.realme.thinking.Thinking;

/**
 * 小我
 * 
 * @author chengwei2
 *
 */
public interface Ego {

	/**
	 * 身份认同/角色扮演
	 */
	public Identity identity = null;

	/**
	 * 思想
	 */
	public Thinking thinking = null;

	/**
	 * 情绪
	 */
	public Emotion emotion = null;

	/**
	 * 身体
	 */
	public Body body = null;

	/**
	 * 真我
	 */
	public Me me = null;

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
