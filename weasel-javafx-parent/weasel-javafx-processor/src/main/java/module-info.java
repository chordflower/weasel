open module weasel.javafx.processor {
  requires java.compiler;
  requires org.jetbrains.annotations;
  requires com.google.auto.service;
  requires weasel.javafx.runtime;
  requires com.google.common;
  requires com.squareup.javapoet;
  requires javax.inject;
  requires weasel.utils.reflection;

  exports cc.chordflower.weasel.javafx;
}