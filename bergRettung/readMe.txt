Die MainMethode (bergrettung.java) enthält eine Methode test(). Diese testet die Methoden vieler Klassen auf funktionsfähigkeit. Sie ist im Normalbetrieb auszukommentieren.

In der MainMethode gibt es ein Objekt set der Klasse Setup. Dieses Objekt führt die Methoden createTable und deleteTable aus. Folglich werden die Tabellen automatisch geleert.
Deshalb werden in der Methode befuellen() einige Testdaten eingefügt

Möchte man die Datenbank resetten, so sind unbedingt alle drei Methoden (set.deleteTable(), set.createTable(), befuellen()) auszuführen, da sonst primary Constraints in der Datenbank
verletzt werden.


Bei Erstaufrufen ist die Methode set.deleteTable() unbedingt auszukommentieren, da keine nicht vorhandenen Tabellen gelöscht werden können.

Beim Erstellen der Datenbank ist auf folgende Werte zu achten:

	DRIVER = "org.apache.derby.jdbc.ClientDriver";
    URL = "jdbc:derby://localhost:1527/Bergrettung";
    USER = "SPE";
    PWD = "123";
	
	
	
	
Wir wünschen viel Spaß bei der Verwendung unseres Programms
 