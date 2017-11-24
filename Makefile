JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Proceso.java Semaforo.java Servidor.java Token.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
