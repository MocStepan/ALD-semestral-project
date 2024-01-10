# Generátor Mapy s Títky

Tento Java program slouží k náhodnému generování mapy s využitím dlaždicových prvků nazvaných `Title`. Každý `Title` je charakterizován svým indexem a souřadnicemi pozice (vlevo, nahoře, vpravo, dole) v rámci mapy. Program vytváří mapu na základě mřížky s pevně stanovenými rozměry (ŘÁDKY, SLOUPCE) a následně ukládá vygenerovanou mapu jako obrázkový soubor.

## Třída `Title`

Třída `Title` představuje jeden dlaždicový prvek, jehož vlastnosti zahrnují index a souřadnice pozice. Tato třída obsahuje metody pro kontrolu kompatibility s okolními dlaždicemi vzhledem k jejich pozici.

## Hlavní Třída `Main`

Hlavní třída `Main` obsahuje logiku pro generování náhodné mapy. Program pracuje s mřížkou o stanovených rozměrech (ŘÁDKY, SLOUPCE) a definuje velikost dlaždic (`TITLE_SIZE`). Při generování mapy se zajistí, že každá dlaždice je kompatibilní se svými sousedy.

## Funkcionality

- Program vytváří mřížkovou mapu s definovanými rozměry.
- Náhodně vybírá dlaždice ze stanovené sady, přičemž se zajišťuje jejich kompatibilita se sousedními dlaždicemi.
- Generovaná mapa je vizualizována jako obrázkový soubor, kde každá dlaždice je reprezentována obrázkem načteným ze souboru.

## Definice Dlaždic

Metoda `createTitles` inicializuje sadu dlaždicových prvků s konkrétními vlastnostmi. Tyto dlaždice jsou využívány během procesu generování mapy.

Pro přizpůsobení kódu specifickým potřebám můžete volně experimentovat a upravovat jeho strukturu.
