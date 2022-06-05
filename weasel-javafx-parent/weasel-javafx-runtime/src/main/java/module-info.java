open module weasel.javafx.runtime {
  requires org.jetbrains.annotations;
  requires javafx.graphics;
  requires javafx.controls;

  exports cc.chordflower.weasel.javafx.annotations;
  exports cc.chordflower.weasel.javafx.runtime;
  exports cc.chordflower.weasel.javafx.utilities.layouts;
  exports cc.chordflower.weasel.javafx.utilities.controls;
  exports cc.chordflower.weasel.javafx.utilities.charts;
}