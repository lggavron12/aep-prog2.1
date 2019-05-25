package aula20190521.v1.aep21;

import aula20190521.v1.pessoa.Fisica;
import aula20190521.v1.pessoa.Juridica;
import aula20190521.v1.pessoa.Pessoa;

public class App {
	
	public static void main(String[] args) {
		Pessoa Maurice = new Fisica("Maurice McDonald", "54647142949", "138.007.070-80");
		Pessoa Richard = new Fisica("Richard McDonald", "54647142949", "123.984.445-12");
		Pessoa Ray = new Fisica("Ray Kroc", "54647142949", "888.333.445-24");
		Juridica McDonalds = new Juridica("McDonald's", "01.004.137/0001-55", 500_000d);
		
		McDonalds.adicionarSocio(Maurice, 40.00d);
		McDonalds.adicionarSocio(Richard, 40.00d);
		McDonalds.adicionarSocio(Ray, 20.00d);

		
	}

}