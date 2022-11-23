JC =javac
.SUFFIXES:.java .class
.java.class:
	$(JC) $*.java

CLASSES = \
	src\main\java\jjpg0006\footbalerlstats\Usuario.java\
	src\main\java\jjpg0006\footbalerlstats\Club.java\
	src\main\java\jjpg0006\footbalerlstats\Futbolista.java\
	src\main\java\jjpg0006\footbalerlstats\FootballerStats.java\
	src\test\java\jjpg0006\footbalerlstats\ClubTest.java\
	src\test\java\jjpg0006\footbalerlstats\FutbolistaTest.java\
	src\test\java\jjpg0006\footbalerlstats\UsuarioTest.java\
	src\test\java\jjpg0006\footbalerlstats\FootballerStatsTest.java
	

default: CLASSES
	javac Usuario.java
	javac -cp *.java Club.java
	javac -cp . Futbolista.java
	javac FootballerStats.java
	javac ClubTest.java
	javac FutbolistaTest.java
	javac UsuarioTest.java
	javac FootballerStatsTest.java

CLASSES:$(CLASSES:.java=.class)

clean:\
	$(RM) *.class
