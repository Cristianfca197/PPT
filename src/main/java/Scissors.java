public class Scissors implements Form {
    public Scissors(){

    }

    @Override
    public Form vs(Form form) {
        return form.vsScissors(this);
    }

    @Override
    public Form vsRock(Form rock) {
        return rock;
    }

    @Override
    public Form vsPaper(Form form) {
        return this;
    }

    @Override
    public Form vsScissors(Form form) {
        return null;
    }
}
