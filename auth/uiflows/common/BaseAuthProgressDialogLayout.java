package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.aang;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BaseAuthProgressDialogLayout extends aang {
    public BaseAuthProgressDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.common_progress_dialog, this);
    }

    @Override // defpackage.aang
    public final void a(CharSequence charSequence) {
        ((TextView) findViewById(R.id.message)).setText(charSequence);
    }
}
