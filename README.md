# luiza_be

Timovy projekt 2022

## čo potrebujete na spustenie

Na spustenie tohto projektu potrebujete mat nainstalovane:

- IDE prostredie
- Java (11)
- Git
- [docker desktop](https://docs.docker.com/desktop/install/windows-install/) instalacia pre windows, [docker pre linux](https://docs.docker.com/engine/install/ubuntu/)

## ako spustit

- https://github.com/aulinka/luiza_be.git
- Intellij IDEA (File -> New -> Project from VC)

## dolezite !!!

Branch *dev* sluzi na developovanie aplikacie, nikdy nepushujte do master branch
Z branch dev si vytvorte novu a nazvyte ju podla funkcionality ktoru riesite

`git checkout -b nazov_vetvy`

Aplikacia bezi defaultne na porte **8080**

## praca s aplikaciou

1. **spustenie databazy**

- v priecinku s projektom spustite prikaz ```docker-compose up -d``` (ak pracujete v IntelliJ IDEA v zalozke terminal),
  nasledne sa skuste napojit na DB, bud rovno v IDE prostredi, len v Ultimate verzii (postup v nasledujucej odrazke), alebo pomocou aplikacii
  ako je [DBeaver](https://dbeaver.io/download/)
- vo vertikalnych zalozkach v pravo otovrte zalozku Database -> New -> Data Source,
  vyberte PostgreSQL (RDBMS), vyplnte inputy *user, password, database* podla informacii v docker-compose.yml subore
- pre nacitanie scriptu data.sql je potrebne si do suboru **application-dev.yml**, pod kategoriu **jpa:** doplnit **defer-datasource-initialization: true**, ak by to nefungovalo, zmenit **ddl-auto** na **create update**, a pustit script manualne

2. **spustenie aplikacie**
- pre spustenie aplikacie je potrebne pred tym ako stlacite tlacitko *run*, ist do konfiguracie spustania (horna lista, na pravo od kladivka), do inputu **Active profiles** pridat **dev**, nasledne aplikaciu spustit
