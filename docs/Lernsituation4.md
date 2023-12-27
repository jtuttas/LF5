# Lernsituation 4

 **Die Einkäufe (Warenkörbe) sollen im Kassensystem erfasst und als Datei im Computer zur Weiterverarbeitung gespeichert werden.**
 
 **Als Auszubildender wirken Sie bei dem Entwurf als auch bei der Implementierung der notwendigen Datenstruktur und deren Speicherung in Form einer Datei mit und stellen diese dem Entwicklerteam vor.**

## Daten und Klassen

Dinge in der natürlichen Welt setzten sich zumeist aus verschiedenen Datentypen zusammen. So besitzt jede Person einen Namen (*String*) und ein Alter (*byte*). In objektorientierten Programmen werden diese Daten in Form einer Klasse zusammengefasst. 

```java
public class Person {
    public String name;
    public int age;
}
```

Zur Darstellung dieser Daten dient das Klassendiagramm als grafische Notation.

![Klassendiagramm Person](images/Person.png)

Zu beachten ist hier, dass die Notation lautet **Name des Attributs:Datentyp**.

### Aufgabe 1

In unserem Kassensystem werden Waren, deren Preis, Mengen und der MwSt.-Satz gespeichert. Erstellen Sie für das Kassensystem ein geeignetes Klassendiagramm für eine **Postition** (auf dem Bon) und implementieren Sie diese Datenstruktur in JAVA.

### Lösung Aufgabe 1

![Klassendiagramm Position](images/Position.png)

```java
public class Position {
    public String bezeichnung;
    public double preis;
    public double menge;
    public boolean reduziert;
}
```

## Beziehungen zwischen Klassen ("ist Teil von Beziehung")

Dinge in der realen Welt bestehen nicht nur aus einer Ansammlung von primitiven Datentypen, sondern sie stehen auch in einer Beziehung zu anderen Dingen.

So besteht ein Datum, z.B. aus den primitiven Daten Tag, Monat und Jahr und kann als Klassendiagramm wie folgt dargestellt werden.

![Klassendiagramm Datum](images/Datum.png)

```java
public class Datum {
    public byte tag;
    public byte monat;
    public short jahr;
}
```

Die zuvor beschriebene Person mit einem Namen und einem Alter, besitzt natürlich auch ein Geburtsdatum (aus dem man dann das Alter bestimmen, wodurch das alter redundant wird und weggelassen werden kann). Im Klassendiagramm kann dieser Sachverhalt wie folgt dargestellt werden.

![Klassendiagramm Person & Datum](images/Person2.png)

Im Java Code würde das wie folgt aussehen

```java
public class Person {
    public String name;
    public Datum geb;
}
```

### Übung 1

Auch ihre Schulklasse besteht aus vielen Daten, die in einer Beziehung zueinander stehen (die Schüler der Klasse mal vernachlässigt). So besitzt ihr Schulklasse:

- eine Bezeichnung
- einen Klassenlehrer
- ein Einschulungsdatum
- einen Ausbildungsberuf
- und ggf. noch mehr

Erstellen Sie einer Klassendiagramm der Schulklasse, wobei möglichst viele "Dinge" in einzelnen Klassen zusammengefasst werden.

### Lösung Übung 1

![Klassendiagramm Schulklasse](images/Schulklasse.png)

### Aufgabe 2

Untersuchen Sie die Daten auf einem Einkaufzettel und stellen Sie diese Daten in Form eins Klassendiagramms dar. Fassen Sie dabei möglichst viele Daten zu Klassen (Dinge) zusammen. Vernachlässigen Sie dabei die gekauften Positionen. 

Stellen Sie im Anschluss daran ihre Lösung der Klasse vor und diskutieren Sie im Klassenverband Vor- und Nachteile der einzelnen Lösungen.

### Lösung Aufgabe 2

![Daten eines Bons](images/bon2.png)

## Beziehungen zwischen Klassen ("ist so etwas wie Beziehung")

Dinge in der objektorientierten Welt haben jedoch nicht nur eine "ist Teil von" Beziehung, sondern ähneln einander im Sinne von einer "ist so etwas wie" Beziehung. So hat eine Flasche eine Füllmenge. Eine Cola Flasche ist dabei so etwas wie eine Flasche enthält aber ein Coffein haltiges Getränk. Auch eine Weinflasche ist eine Flasche enthält aber ein alkoholisches Getränk mit einem alkoholgehalt. Im Klassendiagramm wird dieser Zusammenhang wie folgt dargestellt.

![Klassendiagramm Flaschen](images/Flaschen.png)

Dabei bezeichnet man die allgemeine Klasse als **Elternklasse** und die konkreteren (spezialisierteren) Klassen als **Kindklasse**. Bei dieser Art von Beziehung gehen alle Attribute der Elternklasse auf die Kindklasse über, daher wird dieses auch als **Vererbung** bezeichnet. D.h. auch die Weinflasche besitzt ein *Volumen* hat aber zusätzlich das Attribut *Alkoholgehalt*.

Im Java code wird die "ist so was wie" Beziehung durch das Schlüsselwort **extends** beschrieben. So kann man den obigen Zusammenhang in Java wie folgt ausdrücken.

```java
publci classs WeinFlasche extends Flasche {
    public double alkoholgehalt;
}
```

### Übung 2

>Jede Person besitzt einen Namen und ein Geschlecht. Erwachsene sind Personen, die über einen Familienstand verfügen. Ein Lehrer ist ein Erwachsener, der ein Kürzel hat. Auch ein Student ist ein Erwachsener, der über eine Matrikelnummer verfügt. Ein Kind ist eine Person und hat ein Lieblingsspiel. Ein Schulkind geht darüber hinaus noch zu einer Schule. Ein Koordinator einer Schule ist ein Lehrer der einen Abteilung leitet. Der Schulleiter einer Schule ist Lehrer, leitet aber eine ganze Schule. Ein Austauschstudent ist ein Student, der eine Gastuniversität hat.

Stellen Sie diesen Zusammenhang im Klassendiagramm dar.

### Lösung Übung 2

![Vererbungshierarchie](images/Vererbung.png)

### Aufgabe 3

Auch in dem Kassensystem für die GoodFood GmbH treten Dinge in eine "ist so etwas wie" Beziehung auf. So gibt es in dem Ladengeschäft Produkte und LoseProdukte. Jedes Produkt hat dabei einen Namen, einen Preis und einen Mehrwertsteuersatz. Bei einem losen Produkt (wie Kartoffeln, Äpfel etc.) muss jedoch noch das Gewicht mit berücksichtigt werden.

Stellen Sie diesen Zusammenhang in Form eines Klassendiagramms dar und implementieren Sie die Klasse Produkt und LosesProdukt in Java.

### Lösung Aufgabe 3

![Klassendiagramm Produkt](images/Produkt.png)

```java

public class Produkt {
    public String bezeichnung;
    public double preis;
    public double mwst;
}

public class LosesProdukt extends Produkt{
    public double gewicht;
}

```

## Objekte erzeugen und Attribute zuweisen

## Felder von Daten

## Speicherung von Objekten

