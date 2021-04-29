package br.eti.gadelha.service;

import java.util.List;
import java.util.Optional;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	22/07/2019
 * @version	1.0
 * @link	www.gadelha.eti.br
 **/

public interface GenericDAO<T,K> {
    public abstract T create(T objeto);
    public abstract List<T> retrieve();
    public abstract T retrieve(K id);
    public abstract Optional<T> retrieveOptional(K id);
    public abstract T update(T objeto);
    public abstract void delete(K id);
    public abstract void deleteAll();
}