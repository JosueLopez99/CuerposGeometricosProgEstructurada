import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        double AreaLateral, altura, Perimetrobase, radio, AreaBase,area,PerimetroBaseMayor;
        double AreaTotal, Volumen,AreaBaseMayor,AreaBaseMenor,RadioMayor;
        double ApotemaP, generatriz, RadioEsfera, longitud,profundidad,numgrados;
        char A ;


        for(int z = 1; z >= 3; z++) {

        System.out.println("Seleccione el cuerpo Geometrico a calcular");
        System.out.println("-----------------------------------------------");
        System.out.println("a.Prisma");
        System.out.println("b.Cilindro");
        System.out.println("c.Piramide");
        System.out.println("d.Cono");
        System.out.println("e.Esfera");
        System.out.println("f.Zona Esferica");
        System.out.println("g.Casquete Esferico");
        System.out.println("h.Huso Esferico y Cuña Esferica"); 
        System.out.println("--------------------------------------------");
        System.out.println("i.Ortoedro");
        System.out.println("j.Tetraedro");
        System.out.println("k.Hexaedro");
        System.out.println("l.Octaedro");
        System.out.println("m.Dodecaedro");
        System.out.println("n.Icosaedro");
        System.out.println("o.Tronco de Cono");
        System.out.println("p.Tronco de la piramide"); 
        A = lector.next().charAt(0);
        
        switch(A){
            case 'a':
            System.out.println("Inserte el Perimetro de la base");
    Perimetrobase = lector.nextDouble();
  
    System.out.println("Inserte la altura");
    altura = lector.nextDouble();
 
    AreaLateral = (Perimetrobase * altura);

    System.out.println("El area lateral es : " + AreaLateral);

    //=================================================

    System.out.println("Inserte el area de la base ");
    AreaBase = lector.nextDouble();

    AreaTotal = AreaLateral + (AreaBase * 2);

    System.out.println("El area total es " + AreaTotal);
//=======================================================

System.out.println("Inserte el Volumen");
Volumen = lector.nextDouble();

Volumen = (AreaBase * altura);

System.out.println("EL volumen es " + Volumen);
  break;
  
case 'b':
            System.out.println("Inserte el Perimetro de la base");
    Perimetrobase = lector.nextDouble();
  
    System.out.println("Inserte la altura");
    altura = lector.nextDouble();
 
    AreaLateral = (Perimetrobase * altura);

    System.out.println("El area lateral es : " + AreaLateral);

    //=================================================

    System.out.println("Inserte el area de la base ");
    AreaBase = lector.nextDouble();

    AreaTotal = AreaLateral + (AreaBase * 2);

    System.out.println("El area total es " + AreaTotal);
//=======================================================

System.out.println("Inserte el Volumen");
Volumen = lector.nextDouble();

Volumen = (AreaBase * altura);

System.out.println("EL volumen es " + Volumen);
  break;

case 'c':
           System.out.println("Ingrese el perimetro de base");
    
    Perimetrobase = lector.nextDouble();

    System.out.println("Ingrese el apotema de la piramide");
    ApotemaP = lector.nextDouble();

    AreaLateral = (Perimetrobase * ApotemaP)/2;

    System.out.println("El area lateral es " + AreaLateral);

   //==============================================================
   
   System.out.println("Ingrese el area de la base");
   AreaBase = lector.nextDouble();

   AreaTotal = (AreaLateral + AreaBase);

   System.out.println("El area total es " + AreaTotal);

   //============================================================

   System.out.println("inserte la altura");
   altura = lector.nextDouble();

   Volumen = (AreaBase * altura)/3;

   System.out.println("EL volumen es " + Volumen);
   break;

   case 'd':

    System.out.println("Ingrese el perimetro de base");
    
    Perimetrobase = lector.nextDouble();

    System.out.println("Ingrese la generatriz");
    generatriz = lector.nextDouble();

    AreaLateral = (Perimetrobase * generatriz)/2;

    System.out.println("El area lateral es " + AreaLateral);

   //==============================================================
   
   System.out.println("Ingrese el area de la base");
   AreaBase = lector.nextDouble();

   AreaTotal = (AreaLateral + AreaBase);

   System.out.println("El area total es " + AreaTotal);

   //============================================================

   System.out.println("inserte la altura");
   altura = lector.nextDouble();

   Volumen = (AreaBase * altura)/3;

   System.out.println("EL volumen es " + Volumen);
   break;

   case 'e':
   System.out.println("Ingrese el radio");
        radio = lector.nextDouble();

        area = (4 * 3.14)*(radio * radio);

       System.out.println("EL valor de area es " + area);

       //===================================================

      Volumen = (4/3 * 3.14) * (radio * radio * radio);

      System.out.println("El valor de volumen es " + Volumen);
      break;

      case 'f':
      System.out.println("Ingrese el radio de la esfera");
RadioEsfera = lector.nextDouble();

System.out.println("Ingrese la altura");
altura = lector.nextDouble();

area = (2*3.14) * (RadioEsfera * altura);

System.out.println("El Area es " + area);

//=======================================
 System.out.println("Ingrese el radio");
 radio = lector.nextDouble();

 Volumen = (3.14*altura) *  + (altura*altura+6+radio*radio*radio*radio)/6;

 System.out.println("El volumen " + Volumen);
 break;

 case 'g':
 System.out.println("Ingrese el radio de la esfera");
RadioEsfera = lector.nextDouble();

System.out.println("Ingrese la altura");
altura = lector.nextDouble();

area = (2*3.14) * (RadioEsfera * altura);

System.out.println("El Area es " + area);

//===============================================

Volumen = (3.14*altura) * (3*RadioEsfera - altura)/3;
 
System.out.println("El volumen es " + Volumen);
break;

case 'h':
System.out.println("Ingrese el radio");
        radio = lector.nextDouble();

        System.out.println("Ingrese el numero de grados");
        numgrados = lector.nextDouble();

        area = (4*3.14) * (radio*radio)*(numgrados)/360;

    System.out.println("El Area del Huso Esferico es " + area);

    //========================================================

    Volumen = (4/3) * (3.14*(radio*radio*radio)*numgrados)/360;
    System.out.println("El Volumen de la cuña Esferica es " + Volumen);
    break;

    case 'i':
     System.out.println("Ingrese la altura");
         altura = lector.nextDouble();

        System.out.println("Ingrese la longitud");
        longitud = lector.nextDouble();

        System.out.println("Ingrese la profundidad");
        profundidad = lector.nextDouble();

        area = 2*(altura*longitud+altura*profundidad+longitud*profundidad);

    System.out.println("El Area es " + area);

    //========================================================
    Volumen = (altura*longitud*profundidad);
    System.out.println("El volumen es " + Volumen);
    break;

    case 'j':
    System.out.println("Ingrese la altura");
    altura = lector.nextDouble();

    area = (altura*altura)*1.73;
    System.out.println("El area es " + area);
    
    //======================================

    Volumen = (1.41/12)*(altura*altura*altura);
    System.out.println("El volumen es " + Volumen);
    break;

    case 'k':
    System.out.println("Ingrese la altura");
        altura = lector.nextDouble();


        area = 6*(altura*altura);

        Volumen = (altura*altura*altura);

        
        System.out.println("El area es " + area);

        System.out.println("EL volumen es " + Volumen);
        break;

        case 'l':
         System.out.println("Ingrese la altura");
    altura = lector.nextDouble();

    area = 2*(altura*altura)*Math.sqrt(3);
    System.out.println("El area es " + area);
    
    //======================================

    Volumen = Math.sqrt(2)/3*(altura*altura*altura);
    System.out.println("El volumen es " + Volumen);
    break;

    case 'm':
    System.out.println("Ingrese la altura");
    altura = lector.nextDouble();

    area = 3*(altura*altura)*Math.sqrt(35*Math.sqrt(5));
    System.out.println("El area es " + area);

    //======================
    Volumen = (1/4*15+7*Math.sqrt(5))*(altura*altura*altura);
    System.out.println("El volumen es " + Volumen);
    break;

    case 'n':
    System.out.println("Ingrese la altura");
    altura = lector.nextDouble();

    area = (altura*altura)*1.73;
    System.out.println("El area es " + area);

    area = 5*(altura*altura)*Math.sqrt(3);
    System.out.println("El area es " + area);

    //===================================
    Volumen = 5/12*3+Math.sqrt(5)*altura*altura*altura;
    System.out.println("El Volumen es " + Volumen);
    break;

    case 'o':
    System.out.println("Ingrese la generatriz");
        generatriz = lector.nextDouble();

    System.out.println("Ingrese el radio mayor");
    RadioMayor = lector.nextDouble();

    System.out.println("Ingrese el radio");
    radio = lector.nextDouble();

     System.out.println("Ingrese la altura");
    altura= lector.nextDouble();

    System.out.println("Ingrese el Area Base Mayor");
    AreaBaseMayor = lector.nextDouble();

     System.out.println("Ingrese el Area Base Menor");
    AreaBaseMenor = lector.nextDouble();

    AreaLateral = (3.14*generatriz)*(RadioMayor+radio);

    System.out.println("El area lateral es " + AreaLateral);

    //=========================================================
    AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor;

    System.out.println("El area total es " + AreaTotal);

    //====================================================
    

    Volumen = (1/3)*3.14*altura*(RadioMayor*RadioMayor)+(radio*radio)+RadioMayor*radio;

    System.out.println("El volumen es " +  Volumen);
    break;

    case 'p':
     System.out.println("Ingrese el Perimetro Base Mayor");
      PerimetroBaseMayor = lector.nextDouble();

    System.out.println("Ingrese el Apotema de la Piramide");
    ApotemaP = lector.nextDouble();

     System.out.println("Ingrese la altura");
    altura= lector.nextDouble();

    System.out.println("Ingrese el Area Base Mayor");
    AreaBaseMayor = lector.nextDouble();

     System.out.println("Ingrese el Area Base Menor");
    AreaBaseMenor = lector.nextDouble();

    AreaLateral = (PerimetroBaseMayor + PerimetroBaseMayor)/2*ApotemaP;

    System.out.println("El area lateral es " + AreaLateral);

    //=========================================================
    AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor;

    System.out.println("El area total es " + AreaTotal);

    //====================================================
    

    Volumen = (1/3)*altura*(AreaBaseMayor + AreaBaseMenor )+ Math.sqrt(AreaBaseMayor)*Math.sqrt(AreaBaseMenor);

    System.out.println("El volumen es " +  Volumen);
    break;

    default:
    System.out.println("Usted ha sido vetado del programa");
    while(z == 3){
    
    }
    }  
  }
 }
}
