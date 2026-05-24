// 1. A JSON adathalmaz eltárolása egy változóban (vagy beolvasása)
const orarendJson =  {
        "ora": [
            {
                "id": "01",
                "tipus": "gyakorlat",
                "targy": "Webkönyvtárak",
                "idopont": { "nap": "péntek", "tol": 13, "ig": 18 },
                "helyszin": "Inf 124",
                "oktato": "Bednarik",
                "szak": "Programtervező informatikus"
            },
            {
                "id": "02",
                "tipus": "előadás",
                "targy": "Valószínüségszámítás",
                "idopont": { "nap": "péntek", "tol": 13, "ig": 18 },
                "helyszin": "Inf 124",
                "oktato": "Bednarik",
                "szak": "Programtervező informatikus"
            },
            {
                "id": "03",
                "tipus": "előadás",
                "targy": "Hálózati architektúrák",
                "idopont": { "nap": "szombat", "tol": 9, "ig": 13 },
                "helyszin": "Inf 124",
                "oktato": "Bednarik",
                "szak": "Programtervező informatikus"
            }
        ]
    }
};

// 2. Az órák listájának kinyerése
const orak = orarendJson.ora;

console.log("=== ÓRAREND FELDOLGOZÁSA (JS) ===");
console.log(`Összesen ${orak.length} óra található a rendszerben.\n`);

// 3. Iteráció (bejárás) és blokkos kiírás a konzolra
orak.forEach(ora => {
    console.log(`----------------------------------------`);
    console.log(`[ID: ${ora.id}] - ${ora.targy} (${ora.tipus})`);
    console.log(`Oktató:   ${ora.oktato}`);
    console.log(`Helyszín: ${ora.helyszin}`);
    console.log(`Időpont:  ${ora.idopont.nap} ${ora.idopont.tol}:00 - ${ora.idopont.ig}:00`);
    console.log(`Szak:     ${ora.szak}`);
});
console.log(`----------------------------------------`);