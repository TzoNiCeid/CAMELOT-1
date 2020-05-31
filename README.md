# CAMELOT-project texnologias logismikou 2020
Το έργο αφορά την υλοποίηση ενός επιτραπέζιου παιχνιδιού, του AVALON, σε ηλεκτρονική μορφή, δηλαδή σε μορφή εφαρμογής για android. Η αλλαγή της ονομασίας από AVALON σε CAMELOT έγινε για την αποφυγή νομικών προβλημάτων. Ωστόσο στο τεχνικό κείμενο project-description βρίσκονται αναλυτικά οι κανόνες του παιχνιδιού, καθώς και η πηγή για το original game AVALON.

## Prerequisites
Ένα IDE της επιλογής σας για JAVA. Προτείνεται το Eclipse.

## Versioning
Αυτή είναι η τρίτη έκδοση (v0.3) του κώδικα στην οποία θα βρείτε μια αρχική προσέγγιση για τις κλάσεις και τα attributes τους καθώς και τις βασικές αρχικοποιήσεις (κάποιους constructors και setters),δηλαδή  όσα υπήρχαν στην πρώτη έκδοση. Επιπρόσθετα, θα βρείτε νέες μεθόδους στις κλάσεις μας οι οποίες προέκυψαν ύστερα από την ανάλυση των sequence diagrams αλλά και με βάση τις ανάγκες του προς υλοποίηση ζητούμενου σε κάθε περίπτωση χρήσης και συνολικά,την δεύτερη έκδοση δηλαδή.Επιπλέον,θα βρείτε τις κλάσεις interface που υλοποιήθηκαν με χρήση της βιβλιοθήκης swing οι οποίες αποτελούν το τελευταίο κομμάτι του κώδικα συνθέτοντας έτσι πλήρως την εφαρμογή μας.Η κλάση camelot,στην οποία έχουμε ενσωματώσει την public static void main, καλέι την αρχική οθόνη και έπειτα οι υπόλοιπες καλούνται σειριάκα σύμφωνα με τους κανόνες του παιχνιδιού που περιγράφονται αναλυτικά στο τεχνικό κείμενο project-description.

## Running the app
Μέσα στον φάκελο CAMELOT θα βρείτε τον φάκελο camelot ο οποίος περιέχει τους φακέλους src και img. Κατεβάζετε τον φάκελο camelot στο pc. Για να τρέξουμε το app ξεκινάμε κατεβάζοντας όλες τις κλάσεις και πατάμε run στη κλάση camelot.Εμφανίζεται το home screen της εφαρμογής από την οποία πατώντας στο αντίστοιχο κουμπί προχωράμε στην οθονη του MENU.Από εκεί με το κουμπι Rules δεν θα συμβεί τίποτε λόγω έλλειψης χρόνου για την ολοκλήρωση του.Με το κουμπί Special Rules μπορείτε να επίλεξετε αν θέλετε να παίξετε το παιχνίδι με κάποιον από τους ειδικούς κανόνες που αναλυόνται στο project description.Με το κουμπί settings σας εμφανίζει τέσσερις(4) επιλογές ρυθμίσεων οι οποίες θεωρητικά θα λειτουργόυσαν σε επίπεδο android app(στην περίπτωση μας δεν κάνουν κάτι).Πατήστε έξοδο για να επανέλθετε στην ουόνη Αρχικό Μενού.Κατόπιν,πατώντας το κουμπί play το παιχνίδι αρχίζει(σας παραπέμπουμε στο project description για αναλυτικότερη ανάγνωση των κανόνων).Εν συνεχεία εμφανίζεται μια οθόνη επιλογής αριθμού παικτών και ειδικών χαρακτήρων.Μπορείτε να επιλέξετε μεταξύ 5-10 παικτών,σε περιπτώση λάθος αριθμού ή string εμφανίζεται αντίστοιχο fault message.Μπορείτε να επιλέξετε διαφορετικούς συνδυασμούς special roles,σε περίπτωση που δεν συμβαδίζουν,όμως,με τους κανόνες εμφανίζεται αντίστοιχο fault message.Προχωρώντας στην ανάθεση ρόλου ο παίκτης εισάγει το όνομα του και πατώντας στο αντίστοιχο πεδίο του εμφανίζει τυχαία το ρόλο του(με μέριμνα πάντα για την περίπτωση κενού πεδίου ονόματος ή διπλότυπης εγγραφής).Μόλις ολοκληρωθεί η ανάθεση η δράση αρχίζει με την επιλογή της πρώτης αποστολής,ή αν είναι ενεργοποιημένος ο ειδικός κανόνας targeting η δυνατότητα επιλογής της επιθυμητής αποστολής,σύμφωνα πάντα με τους κανόνες(βλ.project description).Ακολουθεί η ψηφοφορία όπου κάθε παίκτης επιλέγει υπέρ/κατά(υποχρεωτικά πρέπει να ψηφισούν όλοι αλλιώς πάλι εμφανίζεται fault message),και ανάλογα με το αποτέλεσμα προχωράμε είτε στην διεκπεραίωση αποστολής είτε επανερχόμαστε στην οθόνη επιλογής αποστολής.Σε περίπτωση πέντε(5) καταψηφήσεων το παιχνίδι τερματίζει με νίκη των κακών.Κατά τη διεκπεραίωση αποστολής οι παίκτες που επιλέχθηκαν επιλέχουν επιτυχία ή αποτυχία της αποστολής(βλ.project description) σειριακά όμως διοτι η ψήφος αυτή είναι κρυφή(και εδώ υπάρχει μέριμνα για την περίπτωση που κάποιος δεν επιλέξει τίποτα).Εάν διαπιστωθεί τουλάχιστον μία αποτυχία το σκορ αυξάνεται υπέρ των κακών,διαφορετικά  υπέρ των καλών.Το παιχνίδι τερματίζει όταν το σκορ κάποιας ομάδας γίνει 3.Σε περίπτωση που το σκορ των καλών είναι 3 και έχει επιλεχθεί ο χαρακτήρας Merlin τότε οι κακοί έχουν μία τελευταία ευκαιρία να κερδίσουν υποδεικνύοντας τον παίκτη που θεωρούν οτι έχει τον συγκεκριμένο ειδικό χαρακτήρα.Αν μαντέψουν σωστά κερδίζουν,αλλιώς το παιχνίδι τελειώνει με νίκη των καλών.Πατώντας το κουμπί συνέχειας θα πάει σε οθόνη επιλογής εξόδου ή νέας παρτίδας.Από την έξοδο θα οδηγηθείτε σε οθόνη αξιολόγησης της εφαρμογής και κατόπιν σε έξοδο από την εφαρμογή,ενώ από την επιλογή Νέα Παρτίδα θα οδηγηθείτε εκ νέου στην οθόνη Αρχικό Μενού. 


## Built with:
Οι authors του κώδικα, για την υλοποίηση των παραπάνω εργάζονται σε:
* BlueJ
* Eclipse 
* IntelliJ IDEA

## Collaborators
Για την υλοποίηση του κώδικα εργάζονται οι εξής:
* Γαλάνη Ειρήνη
* Δούρος Βασίλης
* Ζαρμακούπης Πολύκαρπος
* Νικολακοπούλου Γεωργία 
* Τσακηρίδης Μιχάλης

## License & copyright
Licensed under the [MIT License](LICENSE).
