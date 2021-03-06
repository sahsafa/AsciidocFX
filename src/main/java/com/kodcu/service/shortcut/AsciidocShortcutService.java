package com.kodcu.service.shortcut;

import com.kodcu.controller.ApplicationController;
import com.kodcu.other.Current;
import com.kodcu.service.table.AsciidocTableController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by usta on 13.03.2015.
 */
@Component
public class AsciidocShortcutService implements ShortcutService {

    private final Current current;
    private final ApplicationController controller;
    private final AsciidocTableController tableController;

    @Autowired
    public AsciidocShortcutService(Current current, ApplicationController controller, AsciidocTableController tableController) {
        this.current = current;
        this.controller = controller;
        this.tableController = tableController;
    }

    @Override
    public void addBold() {
        current.currentEngine().executeScript("editorMenu.asciidoc.boldText()");
    }

    @Override
    public void addItalic() {
        current.currentEngine().executeScript("editorMenu.asciidoc.italicizeText()");
    }

    @Override
    public void addHeading() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addHeading()");
    }

    @Override
    public void addCode(String lang) {
        current.currentEngine().executeScript("editorMenu.asciidoc.addSourceCode('" + lang + "')");
    }

    @Override
    public void addUnorderedList() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addUlList()");
    }

    @Override
    public void addOrderedList() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addOlList()");
    }

    @Override
    public void addTable() {
        controller.createAsciidocTable();
    }

    @Override
    public void addBasicTable(String row, String column) {
        tableController.createBasicTable(row, column);
    }

    @Override
    public void addImage() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addImageSection()");
    }

    @Override
    public void addSubscript() {
        current.currentEngine().executeScript("editorMenu.asciidoc.subScript()");
    }

    @Override
    public void addSuperscript() {
        current.currentEngine().executeScript("editorMenu.asciidoc.superScript()");
    }

    @Override
    public void addUnderline() {
        current.currentEngine().executeScript("editorMenu.asciidoc.underlinedText()");
    }

    @Override
    public void addHyperlink() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addHyperLink()");
    }

    @Override
    public void addStrike() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addStrikeThroughText()");
    }

    @Override
    public void addQuote() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addQuote()");
    }

    @Override
    public void addHighlight() {
        current.currentEngine().executeScript("editorMenu.asciidoc.highlightedText()");
    }

    @Override
    public void addAdmonition(String type) {
        current.currentEngine().executeScript(String.format("editorMenu.asciidoc.addAdmonition('%s')", type));
    }

    @Override
    public void addSidebarBlock() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addSidebarBlock()");
    }

    @Override
    public void addExampleBlock() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addExampleBlock()");
    }

    @Override
    public void addPassthroughBlock() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addPassthroughBlock()");
    }

    @Override
    public void addIndexSelection() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addIndexSelection()");
    }

    @Override
    public void addColophon() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addColophon()");
    }

    @Override
    public void addPreface() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addPreface()");
    }

    @Override
    public void addDedication() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addDedication()");
    }

    @Override
    public void addAppendix() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addAppendix()");
    }

    @Override
    public void addGlossary() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addGlossary()");
    }

    @Override
    public void addBibliography() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addBibliography()");
    }

    @Override
    public void addIndex() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addIndex()");
    }

    @Override
    public void addBookHeader() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addBookHeader()");
    }

    @Override
    public void addArticleHeader() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addArticleHeader()");
    }

    @Override
    public void addMathBlock() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addMathBlock()");
    }

    @Override
    public void addUmlBlock() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addUmlBlock()");
    }

    @Override
    public void addTreeBlock() {
        current.currentEngine().executeScript("editorMenu.asciidoc.addTreeBlock()");
    }
}
