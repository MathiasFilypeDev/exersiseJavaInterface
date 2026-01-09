/*
*void main(String[] args) {
    List<Person> users = List.of(new Person("Maria", 25), new Person("Mario", 34),
            new Person("João", 22));
    users.forEach(System.out::println);
}
*nesse caso o próprio Java pede para ser realizada a instrução lambda para imprimiro resultado da lista
----------------------------------------------------------
* void main(String[] args) {
    List<Person> persons = List.of(new Person("Maria", 20, "Female"),
            new Person("João", 23, "Male"),
            new Person("Marcio", 30, "Male"));
    printValueString(Person::user, persons);
    printValueString(u -> String.valueOf(u.age()), persons);
    printValueString(Person::sex, persons);
    printValueString(Record::toString, persons); //pode ser utilizado para imprimir
                                                 // todos os metodos do record
}

private static void printValueString(Function<Person, String> callBack, List<Person> persons) {
    persons.forEach(p -> System.out.println(callBack.apply(p)));
}
 */

