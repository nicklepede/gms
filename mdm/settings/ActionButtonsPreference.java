package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.material.button.MaterialButton;
import defpackage.mfa;
import defpackage.ozs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ActionButtonsPreference extends Preference {
    public boolean a;
    public View.OnClickListener b;
    public View.OnClickListener c;
    private boolean d;

    public ActionButtonsPreference(Context context) {
        super(context);
        this.a = false;
        this.d = false;
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        View view = mfaVar.a;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.qrl_delete_question_button);
        materialButton.setVisibility(true != this.a ? 8 : 0);
        if (this.a) {
            materialButton.setOnClickListener(this.c);
        }
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.qrl_sc_set_button);
        Context context = this.j;
        if (ozs.a(context)) {
            materialButton2.setVisibility(8);
            materialButton2 = (MaterialButton) ((QrlSecurityQuestionChimeraActivity) context).findViewById(R.id.action_button);
            materialButton2.setText(context.getString(R.string.fmd_quick_remote_lock_security_question_confirm));
            materialButton2.setVisibility(0);
        } else {
            materialButton2.setVisibility(0);
        }
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            materialButton2.setOnClickListener(onClickListener);
        }
        materialButton2.setEnabled(this.d);
    }

    public final void k(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        d();
    }

    public ActionButtonsPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionButtonsPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ActionButtonsPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.d = false;
    }
}
