## api-gateway

#### API Gateway, mikro hizmet mimarileri için merkezi bir yönlendirme ve yönetim katmanıdır. Farklı mikro hizmetleri tek bir giriş noktası üzerinden yönetmek, güvenliğini sağlamak ve performansını artırmak amacıyla kullanılır.

Neden API Gateway Kullanmalıyız?
1. Tek Noktadan Erişim
   API Gateway, tüm mikro hizmetlere tek bir URL üzerinden erişim sağlar. Bu, istemci tarafındaki karmaşıklığı azaltarak daha basit bir entegrasyon sunar.

2. Yük Dengeleme
   Gateway, istekleri birden fazla arka uç sunucusuna dağıtarak yük dengelemesi yapabilir. Bu, uygulamanın ölçeklenebilirliğini artırır ve performansı iyileştirir.

3. Güvenlik
   API Gateway, kimlik doğrulama ve yetkilendirme işlemlerini merkezi bir noktada yöneterek mikro hizmetlerin güvenliğini artırır. Bu sayede, her mikro hizmet kendi başına güvenlik önlemleri almak zorunda kalmaz.

4. Önbellekleme
   Yanıtları önbelleğe alarak, performansı artırabilir ve mikro hizmetlerin üzerindeki yükü azaltabilirsin. Önbellekleme, sık kullanılan verilerin hızlı bir şekilde erişilmesini sağlar.

5. Hata Yönetimi
   Gateway, hataları merkezi olarak yönetebilir. Özel hata mesajları döndürebilir veya belirli hata durumlarında alternatif yönlendirmeler yapabilir.

6. Rate Limiting
   İsteklerin belirli bir sınırda tutulmasını sağlayarak, sistemin aşırı yüklenmesini engelleyebilirsin. Bu, kötüye kullanımı önlemeye yardımcı olur.

7. Protokol Dönüşümü
   HTTP, WebSocket gibi farklı protokoller arasında dönüşüm yapabilir. Bu, istemci ve sunucu arasında esneklik sağlar.

8. Dinamik Yönlendirme
   Yeni mikro hizmetler eklemek veya mevcut olanları güncellemek oldukça kolaydır. Sadece yapılandırma dosyasında değişiklik yaparak bu işlemi gerçekleştirebilirsin.