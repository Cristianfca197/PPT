public class Rock implements Form {
    public Rock(){}

    public Form vs(Form form) {
        return form.vsRock(this);
    }

    @Override
    public Form vsRock(Form rock) {
        return null;
    }

    @Override
    public Form vsPaper(Form form) {
        return form;
    }

    @Override
    public Form vsScissors(Form form) {
        return this;
    }
}
