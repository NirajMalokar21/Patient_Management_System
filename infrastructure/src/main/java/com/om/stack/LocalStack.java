package com.om.stack;

import software.amazon.awscdk.*;

public class LocalStack extends Stack {
    public LocalStack(final App scope, final String id,  final StackProps props) {
        super(scope, id, props);

    }

    public static void main(final String[] args){
        App app = new App(AppProps.builder().outdir("D:\\IdeaProject\\patient-management\\infrastructure\\cdk.out").build());
        StackProps props = StackProps.builder()
                .synthesizer(new BootstraplessSynthesizer())
                .build();

        new LocalStack(app, "localstack-ecom", props);
        app.synth();

        System.out.println("App synthesizing in progress...");
    }
}
