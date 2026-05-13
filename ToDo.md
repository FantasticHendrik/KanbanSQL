Idee: Kanban-Board
-Hat Brett? > Buckets > Zettel > Eigenschaften

Brett: zeigt Buckets an

Buckets: zeigen Zettel an, kann filtern, kann sortieren
"Backlog" "ToDo/Sprint" "In Progress" "QA" "Done" "External Dependencies"

Zettel: Enthält ID, Titel, Beschreibung, 
        Verantwortlicher, Fälligkeitsdatum,
        geschätzte Dauer, Vorgänger, Nachfolger, Meilenstein
        
Verantwortliche/MA: ID, Name, Vorname, Kapazität (1-n),

Beziehungen:

Jeder Zettel ist genau einem Bucket zugeordnet, einem Bucket können mehrere Zettel zugeordnet werden. 

Jeder Zettel hat einen Verantwortlichen MA, einem MA können bis zu 3 Zettel zugeordnet werden.

Jeder Zettel hat 0-n Vorgänger und Nachfolger.



Anforderungen:
- Anzeigen/Filtern der Zettel nach Buckets & Mitarbeitern (M) X
- Verschieben der Zettel (M) X
- Erstellen der Zettel (M) X
- Bearbeiten der Zettel (M) X

- IDs alphanumerisch definieren (S) 
- Kapazitäten der Mitarbeiter individuell anpassen (S)
- Konstruktor Zettel überladen (S)
- Mitarbeiter/Meilensteine müssen beim Verschieben der Zettel aus dem Backlog zugewiesen werden (S)

- Löschen der Zettel (C)
- Verbliebene Zeit bis Fälligkeit berechnen (C) 
 
