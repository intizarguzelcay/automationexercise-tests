# 🚀 **AutomationExercise Web Automation Tests** 🛒

Bu repository, **AutomationExercise** web sitesi için yazılmış web otomasyon testlerini içeren bir projedir. Bu testler, Selenium ve Java kullanılarak yazılmıştır ve AutomationExercise'in çeşitli işlevlerini test etmek amacıyla kullanılmaktadır.

## 📁 Proje Yapısı

Proje şu dizin yapısına sahiptir:

automationexercise-tests/ 
├── src/ 
│ ├── main/
│ │ ├── java/ 
│ │ │ ├── pages/
│ │ │ │ ├── BasePage.java // Tüm sayfalarda ortak metotlar 
│ │ │ │ ├── HomePage.java // Anasayfa ile ilgili metotlar
│ │ │ │ ├── LoginPage.java // Giriş ve kayıt sayfası metotları 
│ │ │ │ ├── ProductsPage.java // Ürün sayfası metotları (ürün arama, detay, sepete ekleme vb.)
│ │ │ │ └── CartPage.java // Sepet sayfası metotları 

│ ├── test/ 
│ │ └── java/ 
│ │ │ └── tests/ 
│ │ │ │ ├── HomePageTest.java // Anasayfa test senaryoları
│ │ │ │ ├── LoginPageTest.java // Giriş / kayıt test senaryoları
│ │ │ │ ├── ProductsTest.java // Ürün sayfası test senaryoları 
│ │ │ │ └── CartTest.java // Sepet sayfası test senaryoları 

│ │ │ └── utils/ 
│ │ │ │ └── DriverManager.java // WebDriver yönetimi

├── testng.xml // TestNG konfigürasyon dosyası 
├── pom.xml // Maven yapılandırma ve bağımlılıkları 



---

## 🛠 Kullanılan Teknolojiler

- **Java 11** – Programlama dili
- **Selenium WebDriver** – Web otomasyonu
- **TestNG** – Test yönetimi
- **Maven** – Bağımlılık yönetimi ve build
- **IntelliJ IDEA** – Geliştirme ortamı

---

## 🚀 Kurulum ve Çalıştırma

### Gerekli Yazılımlar
Projeyi çalıştırmadan önce aşağıdaki yazılımların sisteminde yüklü olduğundan emin ol:
- [Java JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [ChromeDriver](https://sites.google.com/chromium.org/driver/) (veya kullanacağın diğer WebDriver)


🔍 Test Senaryoları
Bu proje aşağıdaki senaryoları test etmektedir:

**Kullanıcı Kayıt Testi 📋
  Yeni kullanıcıların doğru şekilde kayıt olabildiğini doğrular.

**Kullanıcı Giriş Testi 🔐
  Kullanıcıların doğru bilgileri girerek giriş yapabildiğini test eder.

**Ürün Testi 🛍
  Ürün arama, ürün detaylarını görüntüleme ve sepete ekleme işlemleri kontrol edilir.

**Sepet Testi 🛒
  Sepet sayfasındaki ürünlerin doğru şekilde listelendiğini, ürün detaylarının (resim, isim, fiyat, adet vb.) görüntülendiğini ve ödeme adımına geçilebildiğini doğrular.

💬 İletişim
Herhangi bir sorunuz veya öneriniz varsa, bana ulaşabilirsiniz.

