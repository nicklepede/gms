package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ccxu;
import defpackage.cczj;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SecurityAnswerPreference extends Preference {
    public String a;
    public ccxu b;

    public SecurityAnswerPreference(Context context) {
        super(context);
        this.a = "";
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        View view = kmpVar.a;
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.secret_answer_text);
        Editable text = textInputEditText.getText();
        String obj = text == null ? "" : text.toString();
        textInputEditText.setText(this.a);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.secret_answer_layout);
        textInputEditText.addTextChangedListener(new cczj(this, textInputLayout));
        if (this.a.equals(obj)) {
            return;
        }
        k(textInputLayout);
    }

    public final void k(TextInputLayout textInputLayout) {
        if (l()) {
            textInputLayout.A(this.j.getString(R.string.fmd_quick_remote_lock_security_answer_error_long));
        } else {
            textInputLayout.A(null);
        }
        ccxu ccxuVar = this.b;
        if (ccxuVar != null) {
            ccxuVar.a.K();
        }
    }

    public final boolean l() {
        return this.a.length() > 100;
    }

    public SecurityAnswerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SecurityAnswerPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SecurityAnswerPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = "";
    }
}
