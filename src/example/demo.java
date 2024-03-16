package example;

import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;


// classe demo, onde tudo que foi criado até agora vai aqui.
public class demo {

	// Aqui a aplicação pega o tipo de factory e roda o sistema com as 
	//variáveis/metodos ja criados antes

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
