package soy.dow.nbang.nbangtravel;

import android.view.View;
import android.widget.EditText;

class ChecklistAddActivity {

    EditText titleField = null;
    View base = null;

    ChecklistAddActivity(View base) {
        this.base = base;
    }

    String getTitle() {
        return getTitleField().getText().toString();
    }

    private EditText getTitleField() {

        if(titleField == null) {
            titleField = (EditText)base.findViewById(soy.dow.nbang.nbangtravel.R.id.title);
        }
        return titleField;
    }
}
