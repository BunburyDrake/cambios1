package cambios;

public class Pluma {
String color;
String armazon;
String tinta;
String tapa;
String punta;
public void Pluma() {
	System.out.println("hola soy una pluma");
}
public Pluma(String color, String armazon, String tinta, String tapa, String punta) {
	super();
	System.out.println("hola soy una pluma");
	this.color = color;
	this.armazon = armazon;
	this.tinta = tinta;
	this.tapa = tapa;
	this.punta = punta;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getArmazon() {
	return armazon;
}
public void setArmazon(String armazon) {
	this.armazon = armazon;
}
public String getTinta() {
	return tinta;
}
public void setTinta(String tinta) {
	this.tinta = tinta;
}
public String getTapa() {
	return tapa;
}
public void setTapa(String tapa) {
	this.tapa = tapa;
}
public String getPunta() {
	return punta;
}
public void setPunta(String punta) {
	this.punta = punta;
}
@Override
public String toString() {
	return "Pluma [color=" + color + ", armazon=" + armazon + ", tinta=" + tinta + ", tapa=" + tapa + ", punta=" + punta
			+ "]";
}
public void Escribir() {
	System.out.println("ps ps ps");
}
public void Dibujar() {
	System.out.println("juick");
}

}

