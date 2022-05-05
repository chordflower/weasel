module weasel.utils {
  requires org.jetbrains.annotations;
  requires com.google.common;
  requires java.compiler;
  requires com.machinezoo.noexception;

  exports cc.chordflower.weasel.utils;
  exports cc.chordflower.weasel.utils.annotations;
  exports cc.chordflower.weasel.utils.reflection;
  exports cc.chordflower.weasel.utils.reflection.mirror;
  exports cc.chordflower.weasel.utils.reflection.runtime;
}