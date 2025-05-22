package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.cfgs;
import defpackage.cfii;
import defpackage.cfij;
import defpackage.mfa;
import defpackage.oka;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SecurityAnswerPreference extends Preference {
    public String a;
    public cfgs b;

    public SecurityAnswerPreference(Context context) {
        super(context);
        this.a = "";
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        View view = mfaVar.a;
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.secret_answer_text);
        Editable text = textInputEditText.getText();
        String obj = text == null ? "" : text.toString();
        textInputEditText.setText(this.a);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.secret_answer_layout);
        textInputEditText.addTextChangedListener(new cfij(this, textInputLayout));
        if (this.a.equals(obj)) {
            return;
        }
        k(textInputLayout);
    }

    public final void k(TextInputLayout textInputLayout) {
        if (l()) {
            textInputLayout.A(oka.a(this.j.getString(R.string.fmd_quick_remote_lock_security_answer_error_long), "count", 100));
        } else if (this.a.isEmpty() || !cfii.a(this.a)) {
            textInputLayout.A(null);
        } else {
            textInputLayout.A(this.j.getString(R.string.fmd_quick_remote_lock_security_answer_error_blank));
        }
        cfgs cfgsVar = this.b;
        if (cfgsVar != null) {
            cfgsVar.a.K();
        }
    }

    public final boolean l() {
        return this.a.length() > 99;
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
