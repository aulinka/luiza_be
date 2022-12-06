# luiza_be

Timovy projekt 2022

## čo potrebujete na spustenie

Na spustenie tohto projektu potrebujete mat nainstalovane:

- IDE prostredie
- Java (11)
- Git

## ako spustit

- https://github.com/aulinka/luiza_be.git
- Intellij IDEA (File -> New -> Project from VC)

## dolezite !!!

Branch *dev* sluzi na developovanie aplikacie, nikdy nepushujte do master branch
Z branch dev si vytvorte novu a nazvyte ju podla funkcionality ktoru riesite

`git checkout -b nazov_vetvy`

## praca s aplikaciou

1. **spustenie databazy**

- v priecinku s projektom spustite prikaz ```docker-compose up -d``` (ak pracujete v IntelliJ IDEA v zalozke terminal),
  nasledne sa skuste napojit na DB, bud rovno v IDE prostredi (postup v nasledujucej odrazke) alebo pomocou aplikacii
  ako je [DBeaver](https://dbeaver.io/download/)
- vo vertikalnych zalozkach v pravo otovrte zalozku Database -> New -> Data Source,
  vyberte PostgreSQL (RDBMS), vyplnte inputy *user, password, database* podla informacii v docker-compose.yml subore