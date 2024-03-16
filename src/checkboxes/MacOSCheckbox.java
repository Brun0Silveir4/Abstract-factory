package checkboxes;


//todas as "familias" de produtos tem algumas variações (win e macOs)
//essa é uma das variações de checkbox

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
