package controller;

import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableCell;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

import java.util.EnumSet;

/**
 * Created by anukul on 6/5/16.
 */
class RadioButtonCell<S,T extends Enum<T>> extends TableCell<S,T> {

    private EnumSet<T> enumeration;

    RadioButtonCell(EnumSet<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    protected void updateItem(T item, boolean empty)
    {
        super.updateItem(item, empty);
        if (!empty)
        {
            // gui setup
            HBox hb = new HBox(7);
            hb.setAlignment(Pos.CENTER);
            final ToggleGroup group = new ToggleGroup();

            // create a radio button for each 'element' of the enumeration
            for (Enum<T> enumElement : enumeration) {
                RadioButton radioButton = new RadioButton(enumElement.toString());
                radioButton.setUserData(enumElement);
                radioButton.setToggleGroup(group);
                hb.getChildren().add(radioButton);
                if (enumElement.equals(item)) {
                    radioButton.setSelected(true);
                }
            }

            // issue events on change of the selected radio button
            group.selectedToggleProperty().addListener(( observable, oldValue, newValue ) -> {
                getTableView().edit(getIndex(), getTableColumn());
                RadioButtonCell.this.commitEdit((T) newValue.getUserData());
            });
            setGraphic(hb);
        }
    }
}
