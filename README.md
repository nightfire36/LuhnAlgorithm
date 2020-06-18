# LuhnAlgorithm

Algorytm ten wygląda następująco:
1. Dla każdej pozycji cyfry określone zostają wagi (mnożniki). Najczęściej jest to 2 dla
pozycji nieparzystych, 1 dla parzystych.
2. Każdą cyfrę liczby mnoży się przez odpowiadającą jej wagę <b>od prawej do lewej</b>.
Przy obliczaniu cyfry kontrolnej przyjmuje się, że ostatnia pozycja jest parzysta, a
przy sprawdzaniu - nieparzysta.
3. Jeśli w wyniku mnożenia otrzymano liczbę dwucyfrową, dodaje się cyfry do siebie
otrzymując liczbę jednocyfrową.
4. Dodaje się wszystkie otrzymane liczby do siebie.
5. Wykonuje się operację mod 10 na otrzymanej sumie (pozostawia się jedynie cyfrę
jedności).
6. Następnie, jeśli otrzymana cyfra nie równa się 0, odejmuje się ją od 10. Otrzymano
cyfrę kontrolną, która jest "doklejana" do liczby.
7. Sprawdzenie poprawności liczby odbywa się poprzez zastosowanie na całej liczbie
(łącznie z cyfrą kontrolną) kroków 1-5. Jeżeli liczba jest poprawna otrzyma się w
wyniku zero.

<b>Przykład</b>
Dana jest liczba 92480_.
