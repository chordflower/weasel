module robodog.utils {
  requires org.jetbrains.annotations;
  requires com.google.common;
  requires java.compiler;
  requires com.machinezoo.noexception;

  exports cc.chordflower.robodog.utils;
  exports cc.chordflower.robodog.utils.annotations;
  exports cc.chordflower.robodog.utils.reflection;
  exports cc.chordflower.robodog.utils.reflection.mirror;
  exports cc.chordflower.robodog.utils.reflection.runtime;
}