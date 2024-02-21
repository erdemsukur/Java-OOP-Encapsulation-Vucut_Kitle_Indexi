package deneme1;

public class vkiOrnek1 {

	public static void main(String[] args) {
		
		vucutKitle vki=new vucutKitle("Beyza", 1.70, 75);
		vki.bilgiGoster();
		System.out.println("---");
		
		//uygun görülürse yapıcı metod tanımlanmasında düzenleme yapılarak
		//dışarıdan get-set metodu ile veri girişi yapılabilir.
		//vki.setKilo(81);
		//vki.setBoy(1.76); 
		
		vki.boyUzama(2);
		vki.kiloVer(6);

		System.out.println("---");
		vki.bilgiGoster();
		
		System.out.println(".........");
		
		vucutKitle vki2=new vucutKitle("Erdem", 1.78, 75);
		vki2.bilgiGoster();
		System.out.println("---");

		vki2.boyUzama(3);
		vki2.kiloAl(10);

		System.out.println("---");
		vki2.bilgiGoster();
  }
}
