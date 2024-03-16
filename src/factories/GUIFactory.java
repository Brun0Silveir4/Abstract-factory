package factories;

import buttons.Button;
import checkboxes.Checkbox;

// a factory conhece o tipo de todos os tipos abstratos de produtos

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
