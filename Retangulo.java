class Retangulo{
  double alt;
  double base;

  public void calculaArea(){
    System.out.println("Àrea: "this.base*this.alt);
  }
  public void calculaPerimetro(){
    System.out.println("Perimetro: "+(2*this.base+2*this.alt));
  }
}
