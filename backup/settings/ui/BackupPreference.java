package com.google.android.gms.backup.settings.ui;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.ajwx;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class BackupPreference extends Preference {
    public BackupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(ajwx.h);
    }

    public List k(Account account) {
        return Collections.EMPTY_LIST;
    }

    public final void l(ajwx ajwxVar) {
        n(ajwxVar.a(this.j));
    }

    public void o() {
    }
}
