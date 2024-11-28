package dispnotas;

@SuppressWarnings("serial")
class NaoEhPossivelDispensarValorException extends Exception {
    public NaoEhPossivelDispensarValorException(String mensagem) {
        super(mensagem);
    }
}