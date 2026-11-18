# Rapor

**Ad Soyad:** Talha Eren Cevik
**Numara:** 748

## 1. Algoritma Açıklaması
<!-- Programın nasıl çalıştığını adım adım, kendi cümlelerinizle yazın. -->
Program kullanıcıdan 0 girene kadar sayı alır her sayı için asal mı mükemmel mi olduğunu ve kaç basamaklı olduğunu belirler 
pozitif ve negatif tek ve çift sayıların adetini en büyük ve enküçük sayıyı ve toplamı bulur eğer 0 girilmeden önce hiç sayı
girilmedi ise uyarı verir
## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-sayi

**İşlemler:**
-sayac arttırma(edt,pozitif negatif tek ve çift)
toplama en buyuk ve en kucuk sayi
basamak sayma asal ve mükmemmel sayi kontrolü
ortalama

**Çıktılar:**
-asal mı mükemmel mi basamak sayısı
sayı adedi pozitif negatif tek çift adeti en buyuk en kucuk sayi toplam ortalama

## 3. Sözde Kod (Pseudocode)

```
1.BASLA adet pozititf negatif tek çift ve toplam değişkenlerini 0 yap sayıyı al 
2.sayı 0 dan farklı ise adeti 1 arttır sayıyı toplama ekle  ilk sayı ise enbuyuk ve enkucuk sayi yap değilse karşılaştır
sayı pozitifse pozitif sayısını değise negatif sayısını arttır, ç,ftse .ift tekse teki arttır,basamak sayısını bul,
asal kontrolü yap,mükrmmel sayı kntrolü yap asal mı mükemmel mi ve basamak sayısını yazdıryeni sayı al
3.dongü bitince 0 sayı girilmişse hiç sayı girilmedi yaz değilse ortalamayı hesapla ve tüm sonuçları yazdır
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 |12 |Asal mi false Mukemmel mi false girdigin sayinin basamak sayisi :2 Sayi giriniz:   eger 0 girer isen souc ekranina yonlendirilirsin |Asal mi false Mukemmel mi false girdigin sayinin basamak sayisi :2 Sayi giriniz:   eger 0 girer isen souc ekranina yonlendirilirsin |evet |
| 2 |0 | Henuz islem yapmadin|Henuz islem yapmadin |evet |
| 3 |1 ve 2 ve 0 |girilen sayi adeti: 2 girilen pozitif sayi adati: 2 girilen negatif sayi adati: 0 tek sayi adeti: 1 cift sayi adeti: 1 en buyuk sayi: 2 en kucuk sayi: 1 sayilarin toplami: 3 Sayilarin ortalamari: 1.5 en buyuk sayi ile en kucuk sayinin farki: 1 pozitif ortalama: 1.5 Asal sayi adeti: 1 | girilen say� adeti: 2 girilen pozitif sayi adati: 2 girilen negatif sayi adati: 0 tek sayi adeti: 1 cift sayi adeti: 1 en buyuk sayi: 2 en kucuk sayi: 1 sayilarin toplami: 3 Sayilarin ortalamar�: 1.5 en buyuk sayi ile en kucuk sayinin farki: 1 pozitif ortalama: 1.5 Asal sayi adeti: 1| evet|
| 4 |5 |Asal mı true Mükemmel mi false girdiğin sayının basamak sayısı: 1 |Asal mı true Mükemmel mi false girdiğin sayının basamak sayısı: 1 |evet |
| 5 |6 |Asal mı false Mükemmel mi true girdiğin sayının basamak sayısı: 1 |Asal mı false Mükemmel mi true girdiğin sayının basamak sayısı: 1 |evet |
| 6 | -15|Asal mı false Mükemmel mi true girdiğin sayının basamak sayısı: 1 |Asal mı false Mükemmel mi true girdiğin sayının basamak sayısı: 1 |evet |
| 7 |28 ve 0 |Girilen sayı adeti: 1 girilen pozitif sayı adeti: 1 girilen negatif sayı adeti: 0 tek sayı adeti: 0 çift sayı adeti: 1 en büyük sayı: 28 en küçük sayı: 28 sayıların toplamı: 28 sayıların ortalaması: 28 pozitif ortalama: 28 asal sayı adeti: 0 | Girilen sayı adeti: 1 girilen pozitif sayı adeti: 1 girilen negatif sayı adeti: 0 tek sayı adeti: 0 çift sayı adeti: 1 en büyük sayı: 28 en küçük sayı: 28 sayıların toplamı: 28 sayıların ortalaması: 28 pozitif ortalama: 28 asal sayı adeti: 0| evet|
| 8 |3 4 ve 0 | Girilen sayı adeti: 2 girilen pozitif sayı adeti: 2 girilen negatif sayı adeti: 0 tek sayı adeti: 1 çift sayı adeti: 1 en büyük sayı: 4 en küçük sayı: 3 sayıların toplamı: 7 sayıların ortalaması: 3.5 en büyük sayı ile en küçük sayının farkı: 1 pozitif ortalama: 3.5 asal sayı adeti: 1| Girilen sayı adeti: 2 girilen pozitif sayı adeti: 2 girilen negatif sayı adeti: 0 tek sayı adeti: 1 çift sayı adeti: 1 en büyük sayı: 4 en küçük sayı: 3 sayıların toplamı: 7 sayıların ortalaması: 3.5 en büyük sayı ile en küçük sayının farkı: 1 pozitif ortalama: 3.5 asal sayı adeti: 1|evet |
