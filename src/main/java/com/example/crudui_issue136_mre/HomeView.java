package com.example.crudui_issue136_mre;

import java.util.List;

import org.vaadin.crudui.crud.impl.GridCrud;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {
    final GridCrud<Person> gridCrud = new GridCrud<>(Person.class);

    public HomeView() {
        add(gridCrud);

        configureGridCrud();
    }

    private void configureGridCrud() {
        gridCrud.setFindAllOperation(() -> List.of(
                new Person("Alice", 40),
                new Person("Bob", 11),
                new Person("Carol", 35)));

        gridCrud.getCrudFormFactory().setFieldProvider("age", person -> new IntegerField("Age"));

        // NOTE: uncomment this line to see the difference
        // gridCrud.getCrudFormFactory().setConverter("age", new NoOpConverter());
    }
}
