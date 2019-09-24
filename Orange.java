class Orange {

double prix; //prix en euros
String origine; //Origine de l'orange

public Orange()
{
	this.prix = 0;
	this.origine = "Magrébine";
}

public Orange(double p, String o)
{
	if (p>=0){
		this.prix = p;
	}
	else
	{
		this.prix = -1*p;
	}
	this.origine = o;
}


public double getPrix()
{
	return this.prix;
}

public String getOrigine()
{
	return this.origine;
}

public void setPrix(double p)
{
	this.prix=p;
}

public void setOrigine(String o)
{
	this.origine=o;
}


public static void main(String[] args) {
        Orange o1 = new Orange();
	Orange o2 = new Orange(-15,"France");
	System.out.println("L'orange coute "+o1.getPrix()+ "€ et est d'origine "+ o1.getOrigine());
	System.out.println("L'orange coute "+o2.getPrix()+ "€ et est d'origine "+ o2.getOrigine());
    }
}
