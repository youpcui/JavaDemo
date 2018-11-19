package ycui.demo.javademo.frontcontroller;

public class FrontController {

	private Dispatcher dispatcher;

	public FrontController() {

		dispatcher = new Dispatcher();

	}

	public boolean authenticate() {

		System.out.println("通过认证");

		return true;

	}

	public void dispatcher(String request) {

		if (authenticate()) {

			dispatcher.doDispacher(request);

		}

	}

}
