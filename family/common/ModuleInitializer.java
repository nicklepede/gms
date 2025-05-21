package com.google.android.gms.family.common;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ModuleInitializer extends anya {
    private static final String[] a = {"com.google.android.gms.family.v2.create.FamilyCreationActivity", "com.google.android.gms.family.v2.manage.FamilyManagementActivity", "com.google.android.gms.family.v2.manage.DeleteMemberActivity", "com.google.android.gms.family.v2.invites.SendInvitationsActivity", "com.google.android.gms.family.v2.tos.TosActivity", "com.google.android.gms.family.webview.FamilyWebViewActivity"};

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        String[] strArr = a;
        for (int i = 0; i < 6; i++) {
            asng.H(this, strArr[i], true);
        }
    }
}
