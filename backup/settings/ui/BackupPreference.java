package com.google.android.gms.backup.settings.ui;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.alxv;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class BackupPreference extends Preference {
    public BackupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(alxv.h);
    }

    public List k(Account account) {
        return Collections.EMPTY_LIST;
    }

    public final void l(alxv alxvVar) {
        n(alxvVar.a(this.j));
    }

    public void o() {
    }
}
