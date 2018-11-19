package ycui.demo.javademo.frontcontroller;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {

		FrontController controller = new FrontController();

		controller.dispatcher("HOME");

	}
}
