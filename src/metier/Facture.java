package metier;

import java.time.LocalDate;

public class Facture
{
	private Client client;
	private int montant;
	private LocalDate datefacture = LocalDate.now();
	private boolean estReglee;
	
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	public Facture (int montant, Client client)
	{
		this.montant = montant;
		this.client = client;
	}
	
	public Client getClient()
	{
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return estReglee;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return datefacture;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		//factures.remove();
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}