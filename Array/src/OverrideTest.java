public class OverrideTest {
	OverrideTest test() {
		return this;
	}
}

class child extends OverrideTest {
	
	@Override
	OverrideTest test() {

		return this;
	}

}

class A {
}

class B {
}