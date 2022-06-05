# Introduction

This section, contains a written description of what is available in the weasel-utils module, and basically they boil down
to two things:

- Reflection utilities;
- An annotation to help deal with generic types.

All of these are described in the other pages, also note that with time other annotations may be added, particularly if they
obey to some or all of these guidelines:

- Processable by annotation processors, and hence unneeded at runtime;
- Provide metadata otherwise unavailable ( GenericParameter );
- Provide documentation that appears on javadoc and is useful, for someone reading the api;

While examples of BAD annotations are, present in the namespace javax.persistence ( and now jakarta.persistence ):

- NamedQuery => Totally useless, it even confuses a programmer, if he is not aware of this (example of string based programming);
- NamedQueries => If one isn't bad, now there's more for you;
- NamedNativeQuery => More of it;
- NamedNativeQueries => Couldn't have been missed, by them...
- NamedEntityGraph => Why??
- NamedEntityGraphs => Oh, God Why????
- SqlResultSetMapping => More utter senseless;
- SqlResultSetMappings => Will drive you crazy, in no time.