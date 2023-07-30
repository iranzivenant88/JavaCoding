public class ExampleOne{
	public static void main(String...args){
	
	BaseOne b = New DerivedFour();
	Object o  = (BaseTwo)b; //true
	Object o = (BaseOne)b;//false
	Object o = (DerivedThree)b;//true
	BaseTwo b1 = (BaseOne)b; //false
	BaseOne b1 = (DerivedFour)b;//true
	BaseOne b1 = (DerivedOne)b;//false

	}
 }

clas Object{}
class BaseOne extends Object {}
class BaseTwo extends Object{}
class DerivedOne extends BaseOne {}
class DerivedTwo extends BaseOne {}
class DerivedThree extends BaseTwo {}
class DerivedFour extends BaseTwo {}


BaseOne b = new DerivedFour();

Object o =  (BaseTwo) b; // invalid, DerivedFour is not a subclass of BaseTwo
Object o2 = (BaseOne) DerivedFour; // invalid, DerivedFour is not a subclass of BaseOne
Object o3 = (DerivedThree) BaseOne; // invvalid, DerivedFour is  a subclass of DerivedThree
BaseTwo b1 = (BaseTwo) BaseOne; // invalid, DerivedFour is a subclass of BaseTwo
BaseOne b2 = (DerivedFour) BaseOne; // invalid, DerivedFour is a subclass of BaseTwo
BaseOne b3 = (DerivedOne) DerivedFour; // invalid, DerivedFour is not a  subclass of DerivedOne

