package MundoAnimal;

public class DefineEspecie {
	public static void especieAnimal(Animal bicho) {
		if(bicho instanceof Cachorro) {
			bicho.especie = "Cachorro";
		}
		if(bicho instanceof Passaro){
			bicho.especie = "Passaro";
		}
	}
}
