package by.training.demofuncinterface.entity;

public class UseFoo {
    private String value = "Enclosing scope value";

    public String scopeExperiment() {

        Foo fooIC = new Foo() {
            String value = "Inner class value";

            @Override
            public String method(String string) {
                return this.value;
            }
        };

        String resultIC = fooIC.method("");

        Foo fooLambda = parameter -> {
            String value = "Lambda value";
            return this.value;
        };

        String resultLambda = fooLambda.method("");
        return "Results: resultIC = " + resultIC;
    }

}
