package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.acng;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BaseAuthProgressDialogLayout extends acng {
    public BaseAuthProgressDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.common_progress_dialog, this);
    }

    @Override // defpackage.acng
    public final void a(CharSequence charSequence) {
        ((TextView) findViewById(R.id.message)).setText(charSequence);
    }
}
