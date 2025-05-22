package com.google.android.gms.family.common;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ModuleInitializer extends apzs {
    private static final String[] a = {"com.google.android.gms.family.v2.create.FamilyCreationActivity", "com.google.android.gms.family.v2.manage.FamilyManagementActivity", "com.google.android.gms.family.v2.manage.DeleteMemberActivity", "com.google.android.gms.family.v2.invites.SendInvitationsActivity", "com.google.android.gms.family.v2.tos.TosActivity", "com.google.android.gms.family.webview.FamilyWebViewActivity"};

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        String[] strArr = a;
        for (int i = 0; i < 6; i++) {
            aura.H(this, strArr[i], true);
        }
    }
}
