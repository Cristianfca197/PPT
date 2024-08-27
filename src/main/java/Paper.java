public class Paper implements Form {
    public Paper() {

    }

    @Override
    public Form vs(Form form) {
        return form.vsPaper(this);
    }

    @Override
    public Form vsRock(Form form) {
        return this;
    }

    @Override
    public Form vsPaper(Form form) {
        return null;
    }

    @Override
    public Form vsScissors(Form form) {
        return form;
    }
}
