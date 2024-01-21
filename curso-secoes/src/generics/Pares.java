package generics;

import java.util.*;

public class Pares<C extends Number, V> {
    private final Set<Par<C, V>> itens = new LinkedHashSet<>();

    public void adicionar(C chave, V valor) {
        if (chave == null) return;

        Par<C, V> novoPar = new Par<C,V>(chave, valor);

        itens.remove(novoPar); // se houver um par com a chave especificada, ele é removido

        itens.add(new Par<>(chave, valor));
    }

    public V getValor(C chave) {
        if (chave == null) return null;

        Optional<Par<C, V>> parOpcional = itens.stream()
                .filter(par -> chave.equals(par.getChave()))
                .findFirst();

        // return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
        return parOpcional
                .map(Par::getValor)
                .orElse(null);
    }
}
