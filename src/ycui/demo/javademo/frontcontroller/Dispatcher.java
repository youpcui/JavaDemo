package ycui.demo.javademo.frontcontroller;

public class Dispatcher {
	private HomeView homeView;

	private LoginView loginView;

	public Dispatcher() {

		homeView = new HomeView();

		loginView = new LoginView();

	}

	public void doDispacher(String request) {

		if ("HOME".equals(request)) {

			homeView.show();

		} else {

			loginView.show();
		}
	}
}
