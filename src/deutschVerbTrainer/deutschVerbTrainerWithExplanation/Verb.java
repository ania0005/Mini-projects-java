package deutschVerbTrainer.deutschVerbTrainerWithExplanation;

import java.util.Objects;

public class Verb {

    private String infinitive;

    private String prateritumForm;
    private String perfectForm;

    private String translate;

    public Verb(String infinitive, String prateritumForm, String perfectForm, String translate) {
        this.infinitive = infinitive;
        this.prateritumForm = prateritumForm;
        this.perfectForm = perfectForm;
        this.translate = translate;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public String getPrateritumForm() {
        return prateritumForm;
    }

    public String getPerfectForm() {
        return perfectForm;
    }

    public String getTranslate() {
        return translate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verb verb = (Verb) o;
        return Objects.equals(infinitive, verb.infinitive) && Objects.equals(prateritumForm, verb.prateritumForm) && Objects.equals(perfectForm, verb.perfectForm) && Objects.equals(translate, verb.translate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infinitive, prateritumForm, perfectForm, translate);
    }

    @Override
    public String toString() {
        return "Verb{" +
                "infinitive='" + infinitive + '\'' +
                ", prateritumForm='" + prateritumForm + '\'' +
                ", perfectForm='" + perfectForm + '\'' +
                ", translate='" + translate + '\'' +
                '}';
    }
}
