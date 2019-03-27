package modelo;

public class IteratorUsuario implements Iterator{
    java.util.ArrayList<Usuario> usuarios;
    int posicao = 0;
    
    //construtor
    public IteratorUsuario(java.util.ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    @Override
    public Object first() {
        posicao = 0;
        Usuario user = usuarios.get(posicao);
        return user;
    }
    
    @Override
    public boolean isDone() {
        return posicao == usuarios.size();
    }
     
    @Override
    public Object next() {
        Usuario user = usuarios.get(posicao);
        posicao++;
        return user;
    }
     
    @Override
    public boolean hasNext() {
        if (posicao >= usuarios.size() || usuarios.get(posicao) == null) {
            return false;
        } else {
            return true;
        }
    }
}