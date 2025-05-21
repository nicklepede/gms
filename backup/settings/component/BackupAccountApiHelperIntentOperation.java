package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Intent;
import defpackage.ahhp;
import defpackage.ahre;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupAccountApiHelperIntentOperation extends ahre {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.ahre
    public final void a(Intent intent) {
        new ahhp(this).c((Account) intent.getParcelableExtra("account"));
    }
}
