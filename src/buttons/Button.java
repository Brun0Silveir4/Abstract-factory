package buttons;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 *
 * This is the common interface for buttons family.
 */

// Uma Factory Abstrata assume que o programa tem uma série de "familias" de produtos,
// que estão estruturados dentro de classes hierarquicas (botões e checkbox).
// Todos os produtos da mesma "familia" tem uma interface comum.

// E essa é a interface comum da "família" dos botões


public interface Button {
    void paint();
}
