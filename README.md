Tüm kodu Starter ayağa kaldıracak!   

(@RestController, @Repository, @Service)  

Web API : Web tabanlı yazlımların ve hizmetlerin diğer uygulamalarla iletişim kurmasını sağlayan bir protokol ve yapıdır.  

C -> Create -> POST    -> Yeni bir işe girecek şu personeli de ekle (Ekleme işi)  
R -> Read   -> GET     -> İsteği bu kısım ister. (http://kerem.com/urunler)  
U -> Update -> PUT     -> Bir kişiyi güncellemek için PUT  
D -> Delete -> DELETE  -> örneğin: (http://kerem.com/urunler/elma) bu ürünü sil.  

CRUD (Create -> POST(eklemek), Read->GET (Getirmek), Update->PUT (Güncellemek için), Delete->DELETE(Silmek için)).  

HTTP Status Codes: Serverden bilgi dönerken nasıl durumda döndüğünü anlatır.  
1 ile başlayan -> Başarılı.  
200 başarılı.  
4 ile başlayan -> Client Error.  
5 ile başlayan -> Server Error.  

Katmanlı Mimari MVC (Model View Controller) Client -> Controller - Service - Repository -> DataBase  

Controller : Gelen isteği karşılayan ve bu işi yapacak olan kodu Service katmanına gönderen katman örn: Kerem.com/5766  

Service : (Filtreleme) Burada kontrolleri gerçekleştirir (ID:5766 olan kişinin .... özelliği dolu mu? gereken şartları karşılıyor mu?) Tüm şartlar karşılanıyorsa Repository katmanına gönderir.

Repository : Veritabanına erişmek için kullanılan katmadır. ID : 5766 olan kişiyi veritabanından ister. Veritabanı bulup döndürür, sonrasında Repository hiçbir işlem yapmadan Service katmanına döndürür. Service katmanı Controllera döner ve Controller da Cliente döner.

@RestController : Dışarıdan gelen istekleri karşılayacak sınıf (Controller katmanı)

@Service : Service anatasyonu olduğunu belirtit

@Repository : Repository anatasyonu olduğunu belirtir.

@AutoWired : Enjekte etmek. Anatasynlar arasında geçiş yapabilmek için kullanılır.

Dependency Injection = Bean'i alıp herhangi bir class'a enjecte etmek.

IOC (Inversion of Controll) = Bean oluşturma.
