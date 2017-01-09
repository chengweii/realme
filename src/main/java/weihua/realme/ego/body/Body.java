package weihua.realme.ego.body;

import weihua.realme.ego.body.emotion.Emotion;
import weihua.realme.ego.body.identity.Identity;
import weihua.realme.ego.body.subconsciousness.Subconsciousness;
import weihua.realme.ego.body.thinking.Thinking;
import weihua.realme.energy.view.View;

/**
 * 身体
 * 
 * @author chengwei2
 *
 */
public interface Body {
	
	/**
	 * 身份认同/角色扮演
	 */
	public Identity identity = null;

	/**
	 * 思想
	 */
	public Thinking thinking = null;

	/**
	 * 潜意识
	 */
	public Subconsciousness subconsciousness = null;

	/**
	 * 情绪
	 */
	public Emotion emotion = null;
	
	/**
	 * 看
	 * 
	 * @param view
	 */
	public void see(View view);

	/**
	 * 听
	 * 
	 * @param view
	 */
	public void listen(View view);

	/**
	 * 闻
	 * 
	 * @param view
	 */
	public void smell(View view);

	/**
	 * 尝
	 * 
	 * @param view
	 */
	public void taste(View view);

	/**
	 * 触
	 * 
	 * @param view
	 */
	public void touch(View view);

	/**
	 * 想
	 * 
	 * @param view
	 */
	public void think(View view);
}
