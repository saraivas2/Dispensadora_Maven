package dispnotas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DispensadoraTest {

	@Test
	void test() {
		int[] cedulasInicial = {10, 10, 10, 10, 10, 10}; // Inicializando com 10 cédulas de cada valor
        Dispensadora dispensadora = new Dispensadora(cedulasInicial);

        try {
            int[] resultado = dispensadora.dispensar(1870); // Exemplo que não pode ser atendido
            System.out.println("Cédulas usadas: ");
            for (int i = 0; i < resultado.length; i++) {
                System.out.println(dispensadora.Valores_cedulas()[i] + " reais: " + resultado[i] + " cédulas");
            }
        } catch (NaoEhPossivelDispensarValorException e) {
            System.out.println("Erro: " + e.getMessage());
        }
	}

}
