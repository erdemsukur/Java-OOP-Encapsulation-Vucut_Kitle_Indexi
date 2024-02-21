package deneme1;

public class vucutKitle {
	private String isim;
	private double boy;
	private int kilo;
	private String durum;
	
//verilere sadece sınıf içinden erişim sağlayarak daha güvenli hale getirmek için 
//classa ait özellikler "private" tanımlandı.

	
//YAPICI CONSTRACTION METOD 
	//sınıfın nesnesi oluşturulduğunda çağrılan ilk metoddur.
	//İsim, boy ve kilo parametrelerini kullanarak nesne başlatılır.
	//durumBildir() metodu çağrılarak durum değeri atanır.
	//durum özelliği dışarıdan veri girişi ile değil diğer parametrelerin işleme tabi tutulması sonucu
	//ortaya çıkacağı için işlem metoduna eşitlendi.
	//
	
public vucutKitle(String isim, double boy, int kilo) {
	this.isim=isim;
	this.setBoy(boy);
	//Eğer setBoy metodunda şart koşulu olmasaydı this.boy=boy ifadesi yazılırdı.
	//parametreden alına değer this.x'e yani class içindeki özelliğe aktarılır.
	this.setkilo(kilo);
	this.durum=durumBildir();
}
//get-set methodları
//get:bir sınıfın private olarak tanımlanan veri alanlarının değerlerine erişmek için kullanılan metotlardır.
//set:dışarıdan alınan değeri sınıfın özelliklerine atamak için kullanılır.


public String getDurum() {
	return durum;
}

public void setkilo(int kilo) {
	if ((kilo>300) || (kilo<25))
	{
		throw new IllegalArgumentException("Geçersiz kilo değeri[26-299]");
		//hatalı girişleri kontrol etmek ve uygun hata mesajlarını ekranan vermek için kullanılab yöntemdir.
	}
	else {
		this.kilo=kilo;
	}
}

public int getKilo() {
    return kilo;
}


public void setBoy(double boy) {
	if (boy>2.30 || boy<1.20) {
		throw new IllegalArgumentException("Geçersiz boy değeri[26-299]");
	}
	else {
		this.boy=boy;
		}
}

public double getBoy() {
	return boy;
}

public double vkiHesapla() {
	
	return kilo/(boy*boy);
}

//vkiHesapla metodundan dönen değeri string bir ifadeye çevirerek anlamlandırdık
//ve class özelliğine gönderdik

public String durumBildir() {
	
	double islem=vkiHesapla();
	String KisiDurum;
	if(islem>=25)
	{
		KisiDurum="Sağlıksız Birey";
		return KisiDurum;
	}
	else {
		KisiDurum="Sağlıklı Birey";
		return KisiDurum;
	}
}
//classlara atanan değerleri değiştiren eylem metodları
public void kiloVer(int kosu)
{
	kilo=kilo-kosu;
	System.out.println(kosu+" kilo verildi.");
}
public void kiloAl(int yemek)
{
	kilo=kilo+yemek;
	System.out.println(yemek+" kilo alındı.");
}

public void boyUzama(double sut)
{
	boy=boy+(sut/100);
	System.out.println(sut+" cm uzadı.");
}

//girilen değerleri ekrana yazdıran metod
public void bilgiGoster(){

	System.out.println("İsim: "+isim);
	System.out.println("Boy: "+getBoy());
	System.out.println("Kilo: "+getKilo());
	System.out.println("Vücut Kitle İndeksi: "+vkiHesapla());
	System.out.println("Durum: "+durumBildir());
  }
}


