package weihua.realme.energy.view;

import weihua.realme.energy.EnergyType;

/**
 * 美好画面
 * 
 * @author chengwei2
 *
 */
public class GoodSceneView implements View {

	/**
	 * 能量类型
	 */
	public EnergyType energyType = EnergyType.OTHER;

	/**
	 * 色相类型
	 */
	public ViewType viewType = ViewType.SEE;

	/**
	 * 能量值(有正负)
	 */
	public long energyValue = 100;

}
