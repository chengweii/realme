package weihua.realme.ego.body;

import weihua.realme.ego.body.emotion.Emotion;
import weihua.realme.ego.body.emotion.NormalEmotion;
import weihua.realme.ego.body.thinking.NormalThinking;
import weihua.realme.ego.body.thinking.Thinking;
import weihua.realme.ego.body.thinking.identity.Identity;
import weihua.realme.ego.body.thinking.identity.NormalIdentity;
import weihua.realme.ego.body.thinking.subconsciousness.NormalSubconsciousness;
import weihua.realme.ego.body.thinking.subconsciousness.Subconsciousness;
import weihua.realme.energy.view.View;

/**
 * 默认身体
 * 
 * @author chengwei2
 *
 */
public class NormalBody implements Body {
	
	/**
	 * 身份认同/角色扮演
	 */
	public Identity identity = new NormalIdentity();

	/**
	 * 思想
	 */
	public Thinking thinking = new NormalThinking();

	/**
	 * 潜意识
	 */
	public Subconsciousness subconsciousness = new NormalSubconsciousness();

	/**
	 * 情绪
	 */
	public Emotion emotion = new NormalEmotion();

	@Override
	public void see(View view) {
		// TODO Auto-generated method stub
		System.out.println(view.energyValue);
	}

	@Override
	public void listen(View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smell(View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void taste(View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void touch(View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void think(View view) {
		// TODO Auto-generated method stub
		
	}

}
