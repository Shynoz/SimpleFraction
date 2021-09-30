
## Partie en présentiel : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le projet Java `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    Creation d'un README.

    Pour la suite, ne cochez aucune de ces cases.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    git config --global user.name "Baptiste Devylder"
    git config --global user.email "Bapt091@gmail.com"
    ```
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    git init 
    effectué a la source du projet.
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    git add ./src
    git status (pour voir que tout est bon)
    git commit (on rentre le message des modifications effectuées)
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    Fraction fraction = new Fraction(num,denum);
    System.out.println(fraction.toString());
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    git commit -m "first commit"
    git branch -M master
    git remote add origin https://github.com/uvsq21804324/TODL.git
    git push -u origin master
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
> Répondre ici
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    git add src/README.md
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    .classpath
    .project
    .settings/
    bin/
    src/README.md

    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    je ne les avais pas ajoutés initialement
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    Sur la branche master
    Votre branche est à jour avec 'origin/master'.

    Modifications qui seront validées :
    (utilisez "git reset HEAD <fichier>..." pour désindexer)

        nouveau fichier : src/README.md

    Fichiers non suivis:
    (utilisez "git add <fichier>..." pour inclure dans ce qui sera validé)

        .gitignore

    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Use the SSH protocol with Bitbucket Cloud](https://confluence.atlassian.com/bitbucket/use-the-ssh-protocol-with-bitbucket-cloud-221449711.html)).
    Générer une clée publique que l'on va renter sur github. La clée privée générer on la conserve pour l'authentifiquation.
