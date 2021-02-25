package decoratorLocal;

abstract class LocalDecorator implements Local{

	//holds a Local referenceToLocal 
	protected Local referenceToLocal; 
	
	/**
	 * Constructor with local param
	 * @param local
	 */
	public LocalDecorator(Local local) {
		this.referenceToLocal = local;
	}
	
	@Override
	public String getDescription() {
		return "LocalDecorator description";
	}
	
}
