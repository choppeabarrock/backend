package com.choppeabarrock.backend.model;

/*
http://www.javabyexamples.com/lombok-data-and-value-for-fast-pojos/

@Data/@Data(staticConstructor = "of") (for mutable classes) :
    @Getter
    @Setter
    @RequiredArgsConstructor
    @ToString
    @EqualsAndHashCode



@Value ( immutable objects) :
    @Getter
    @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
    @AllArgsConstructor
    @EqualsAndHashCode
    @ToString

see  @NonFinal
    @PackagePrivate


see http://www.javabyexamples.com/delombok-builder/
    on the constructor


Use @Singular on attribute for add() to collection when @Builder on constructor.

    @Builder.Default to define default values for the annotated fields.

    https://projectlombok.org/features/experimental/SuperBuilder
    @SuperBuilder is not compatible with @Builder.

*/
