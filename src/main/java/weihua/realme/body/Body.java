package weihua.realme.body;

import weihua.realme.energy.view.View;

/**
 * 身体
 * 
 * @author chengwei2
 *
 */
public interface Body {
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
