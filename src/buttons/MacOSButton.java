package buttons;


//todas as "familias" de produtos tem algumas variações (win e macOs)
//essa é uma das variações do botão

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
