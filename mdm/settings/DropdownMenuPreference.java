package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.mdm.settings.DropdownMenuPreference;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import defpackage.cfgt;
import defpackage.ekvl;
import defpackage.mfa;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DropdownMenuPreference extends Preference {
    private static final List c = Arrays.asList("What is your mother's maiden name?", "Another question here?", "One more question here as well?", "A very very very long question, so we can see how that that works?");
    public Integer a;
    public cfgt b;

    public DropdownMenuPreference(Context context) {
        super(context);
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) mfaVar.a.findViewById(R.id.status_auto_complete);
        if (materialAutoCompleteTextView != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.j, R.layout.dropdown_menu_item, R.id.txtName, c);
            materialAutoCompleteTextView.setAdapter(arrayAdapter);
            Integer num = this.a;
            if (num != null) {
                String str = (String) arrayAdapter.getItem(num.intValue());
                ekvl.y(str);
                materialAutoCompleteTextView.setText((CharSequence) str, false);
            }
            materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: cfdt
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    DropdownMenuPreference dropdownMenuPreference = DropdownMenuPreference.this;
                    dropdownMenuPreference.a = Integer.valueOf(i);
                    cfgt cfgtVar = dropdownMenuPreference.b;
                    if (cfgtVar != null) {
                        cfgtVar.a.K();
                    }
                }
            });
        }
    }

    public DropdownMenuPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DropdownMenuPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropdownMenuPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
