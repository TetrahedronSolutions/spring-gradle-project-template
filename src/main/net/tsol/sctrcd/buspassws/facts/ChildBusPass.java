package net.tsol.sctrcd.buspassws.facts;

public class ChildBusPass extends BusPass {

    public ChildBusPass(Person person) {
        super(person);
    }

    @Override
    public String toString() {
        return "ChildBusPass: { person=" + getPerson() + " }";
    }

    @Override
    public boolean equals(Object o) {
<<<<<<< HEAD
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
=======
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
>>>>>>> 891422b... added-drools-rules
        ChildBusPass that = (ChildBusPass) o;
        return getPerson().equals(that.getPerson());
    }

    @Override
    public int hashCode() {
        return getPerson().hashCode();
    }
<<<<<<< HEAD

=======
    
>>>>>>> 891422b... added-drools-rules
}