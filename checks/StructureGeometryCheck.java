public class StructureGeometryCheck {
 public static void main(String[] args) throws Exception {

 CheckSupport.close(new Figuras.Cuadrado(3,3).Area(),9);CheckSupport.close(new Figuras.Cuadrado(50000,50000).Area(),2500000000d);
 CheckSupport.close(new Figuras.TrianguloE(3,3).Area(),4.5);CheckSupport.close(new Figuras.Rectangulo(3,5).Perimetro(),16);

 CheckSupport.done();
 }
}
