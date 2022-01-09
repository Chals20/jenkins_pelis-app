package daaw.pelisapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "database_sequences") //creamos collection para almacenar la secuencia autoincremental para otras collections
public class DatabaseSequence {

    @Id
    private String id;

    private long seq;

    public DatabaseSequence() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }
}
