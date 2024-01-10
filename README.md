# Generátor náhodné herní mapy

Tento Java program slouží k náhodnému generování mapy s využitím dlaždicových prvků nazvaných `Title`. Každý `Title` je charakterizován svým indexem (název obrázku "image_" + index) a cesty (vlevo, nahoře, vpravo, dole) v rámci mapy, které jsou buď ano(1) a ne(0). Program vytváří mapu na základě mřížky s pevně stanovenými rozměry (ROWS, COLUMNS) a následně ukládá vygenerovanou mapu jako obrázkový soubor.

## Třída `Title`

Třída `Title` představuje jeden dlaždicový prvek, jehož vlastnosti zahrnují index a souřadnice pozice. Tato třída obsahuje metody pro kontrolu kompatibility s okolními dlaždicemi vzhledem k jejich pozici.

## Hlavní Třída `Main`

Hlavní třída `Main` obsahuje logiku pro generování náhodné mapy. Program pracuje s mřížkou o stanovených rozměrech (`ROWS`, `COLUMNS`) a definuje velikost dlaždic (`TITLE_SIZE`), která se nedoporuřuje měnit. Při generování mapy se zajistí, že každá dlaždice je kompatibilní se svými sousedy.

## Funkcionality

- Program vytváří mřížkovou mapu s definovanými rozměry.
- Náhodně vybírá dlaždice ze stanovené sady, přičemž se zajišťuje jejich kompatibilita se sousedními dlaždicemi.
- Generovaná mapa je vizualizována jako obrázkový soubor, kde každá dlaždice je reprezentována obrázkem načteným ze souboru.

## Možné měnit

- lze přidat nový obrázek do složky `images`, který bude začínat `image_(index)`, poté stačí v Main.java v metodě createTitles přidat nový Title a určit jeho index a strany např. (pokud to bude L, tak top je 1 a right je 1. Left a bottom je 0)
- lze měnit proměnou `ROWS`, která určuje, kolik bude řádků ve výsledné mapě
- lze měnit proměnou `COLUMNS`, která určije, kolik bude sloupců ve výsledné mapě
- lze měnit proměnou `TITLE_SIZE`, ale nedoporuřuji. Proměná určuje velikost inputových obrázků, pokud bude změněna může dojít k zhoršení kvality výsledné mapy

## Výstup

- výstupní mapa je uložena do `outputImage` jako `op.jpg`
