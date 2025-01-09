# Зміст
0.  [Як взагалі це все запустити](#як-взагалі-це-все-запустити)
1.  [Опис предметної області](#опис-предметної-області)
2.  [Основні завдання системи](#основні-завдання-системи)
3.  [Додаткові структури](#додаткові-структури)
4.  [Діаграма класів (UML)](#uml-діаграми)
5.  [Результат виконання](#результат-виконання)

---


## Як взагалі це все запустити:
``` BASH
javac -d out src/supercity/*.java
mkdir out
java -cp out supercity.Main
```

---

## опис предметної області
- City — базовий клас, який зберігає інформацію про місто: назву, уряд (Government), списки районів (District), будівель (Building), мешканців (Resident), транспорт (Transport), подій (Event) та громадські послуги (PublicService
- District — район міста (може бути діловим, житловим, промисловим ітд). Містить список будівель
- Building — будівля (житлова, офісна, комерційна). Має власників, мешканців (для житлових) чи орендарів (офісних/комерційних
- Resident — людина, що живе у місті. Має свою особисту інформацію, може бути власником будівлі або просто мешканцем
- PublicService — система громадського обслуговування (водопостачання, енергетика, прибирання ітд
- Transport — громадський транспорт (автобус, метро, трамвай тощо). Держить в собі інформацію про розклад, маршрути, вартість проїзду
- Government — структура управління містом. Може створювати бюджетні звіти, контролювати послуги
- Event — подія в місті (культурна, спортивна, політична). проводиться у певному районі/будівлі

---

## основні завдання системи
1.	додавання, видалення, призначення власників, мешканців
2.	додавання видів транспорту, управління маршрутами, відображння розкладу
3.	призначення локації, дати, бюджету для подій
4.	створення, перегляд стану послуг, розподіл фінансів
5.	Правління (Government) формує звіти, розподіляє кошти між районами, послугами ітд

---

## додаткові структури
1.	BuildingType — : RESIDENTIAL, OFFICE, COMMERCIAL, INDUSTRIAL
2.	DistrictType — : BUSINESS, RESIDENTIAL, INDUSTRIAL, SUBURBAN
3.	BUS
4.  METRO
5.  TRAM

---

## uml діаграми
⚠️ **Примітка:** Геттери, сеттери та метод `toString` пропущені для читабельності діаграми.


![alt text](image-1.png)

## результат виконання
```
ubuntu@ip-172-31-26-138:~/someWork/project$ java -cp out supercity.Main
❗️❗️Не можна додати життеля в нжитлову будівлю з такою даресою: 2 Бізнес стріт



Стоврено новий бюджетний звіт: звіт Бюджету 
{витрати=100000.0, доходи=120000.0, старий бюджет=1000000.0, новий бюджет=1020000.0}
Місто (імʼя): СуперМісто
  Кварталів: 2
  будівль: 3
  жителів: 2
  послуг : 2
  транспортів: 3
  подій: 1

Інформація про квартали:
  квартал{назва='центр', тип=BUSINESS, кількісиь будівель: 2}
  квартал{назва='житлово-Паркова зона', тип=RESIDENTIAL, кількісиь будівель: 1}

Будввлі:
   будівля{id=1, адреса='1 Мейн стріт', тип=RESIDENTIAL, ownersCount=1, residentsCount=1}
   будівля{id=2, адреса='2 Бізнес стріт', тип=OFFICE, ownersCount=0, residentsCount=0}
   будівля{id=3, адреса='3 Торговий бульвар', тип=COMMERCIAL, ownersCount=0, residentsCount=0}

Послуги:
    Послуги {назва:'СуперВодоКанал', опис:'Забезпечення водопроводу', бюджет: 200000.0}
    Послуги {назва:'СуперЕнерго', опис:'Забезпечення електрикою', бюджет: 300000.0}

транспорт:
     Автобус{імʼя='СуперБус', шляхи=[дорога1 - Від житлової до центру, дорога2 - Від житлової до аеропорта], плата=1.5, чиПодвійний=false}
     Метро {назва: 'СуперМетро', шляхи: [Центр - Схід, Схід - Захід], плата: 2.0, к-сть вагонів: 8}
     Трамвай{назва: 'СуперТрам', шляхи: [Центр - університет, Університет - старе Місто], плата: 1.75, гілка: 'Житловий'}

події :
     подія
{назва='СуперКонцерт', опис='Музичний фестиваль просто неба в центрі міста в парку', дата=2025-05-20, бюджет на подвю=50000.0, розмішення=центр}
```
