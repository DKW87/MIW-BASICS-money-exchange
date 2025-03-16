# Programming –opdracht Math enmethodes 2 - Money Exchange

## Beschrijving

### a.
Schrijf een programma dat uitrekent hoeveel buitenlandse valuta een klant krijgt voor zijn euro's. In het programma wordt voor de volgende valuta het bedrag uitgerekend:
• US dollar
• GB pound
• Yen

Alleen een geheel aantal euro's kan worden omgewisseld.

Zorg dat de invoer en uitvoer van het programma er als volgt uitziet (de wisselkoers kan verschillen, zie hiervoor de tips):
```
In te wisselen bedrag (alleen gehele getallen): 200
U krijgt hiervoor 247.69 Dollar. (Koers 1.23843)
U krijgt hiervoor 176.92 Pond. (Koers 0.88459)
U krijgt hiervoor 26929.42 Yen. (Koers 134.64711)
```

### b.
Voor het wisselen moet de klant transactiekosten betalen. Deze bedragen 1,5%, met een minimum van 2 euro per transactie en een maximum van 15 euro per transactie. Schrijf voor het berekenen van de transactiekosten een methode die op basis van het in te wisselen bedrag in euro's de kosten berekent en teruggeeft (returned).

Zorg dat de invoer en uitvoer van het programma er als volgt uitziet:
```
In te wisselen bedrag (alleen gehele getallen): 100
De transactiekosten bedragen 2.0 Euro.
We rekenen daarom 98 Euro voor u om.
U krijgt hiervoor 121 Dollar. (Koers 1.23843)
U krijgt hiervoor 87 Pond. (Koers 0.88459)
U krijgt hiervoor 13195 Yen. (Koers 134.64711)
```

## Tips
• Schrijf eerst in pseudo-code op wat je programma moet doen, voordat je gaat programmeren.
• Gebruik in je programma constanten om de wisselkoersen op te slaan.
• Rond komma-getallen af zoals bij bedragen gebruikelijk is: op 2 cijfers achter de komma. Als de laatste decimaal een 0 is zal je deze in de uitvoer echter niet zien, dat mag je zo laten.
• Rond het uiteindelijke bedrag (na aftrek van de transactiekosten) af op een geheel getal.
• Voor gevorderden: Schrijf voor het omrekenen een methode die op basis van het bedrag in euro's en de koers het juiste bedrag in de andere valuta uitrekent.

## Richtlijnen bij coderen (zie ook MIW code conventions)
• Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
• Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
• Let op juist gebruik hoofdletters en kleine letters (ICC #3).
• Gebruik goede namen (ICC #4).
• Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7).