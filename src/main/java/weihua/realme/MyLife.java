package weihua.realme;

import weihua.realme.ego.Family;
import weihua.realme.ego.Self;
import weihua.realme.energy.view.BadSceneView;

/**
 * Hello world!
 *
 */
public class MyLife  implements Life 
{
    public static void main( String[] args )
    {
    	Self self=new Self();
    	self.body.see(new BadSceneView());
    	
    	
    }

	@Override
	public void exploreInnerMe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cultivateCareer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adaptLife() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dealWork() {
		// TODO Auto-generated method stub
		
	}
}
