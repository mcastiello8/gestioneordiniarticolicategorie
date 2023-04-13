package it.prova.gestioneordiniarticolicategorie.service.ordine;

import java.util.List;

import it.prova.gestioneordiniarticolicategorie.dao.ordine.OrdineDAO;
import it.prova.gestioneordiniarticolicategorie.model.Ordine;

public interface OrdineService {

	//per injection
	public void setOrdineDAO (OrdineDAO ordineDAO);
	
	
	public List<Ordine> listAll() throws Exception;
	
	public Ordine caricaSingoloElemento (Long id) throws Exception;
	
	public void aggiorna (Ordine ordineInstance) throws Exception;

	public void inserisciNuovo (Ordine ordineInstance) throws Exception;
	
	public void rimuovi (Long idOrdine) throws Exception;
	
}
