package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Intent;
import defpackage.ajif;
import defpackage.ajru;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupAccountApiHelperIntentOperation extends ajru {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.ajru
    public final void a(Intent intent) {
        new ajif(this).c((Account) intent.getParcelableExtra("account"));
    }
}
