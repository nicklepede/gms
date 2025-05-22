package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.abvl;
import defpackage.abwv;
import defpackage.abwx;
import defpackage.fiig;
import defpackage.fiiu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SimpleNotificationChimeraWorkflow extends abvl {
    public static final /* synthetic */ int A = 0;

    public static Intent u(fiiu fiiuVar, String str, byte[] bArr) {
        Intent a = a(fiiuVar, str, bArr);
        a.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.SimpleNotificationWorkflow");
        return a;
    }

    @Override // defpackage.abvl
    protected final abwx b() {
        Bundle bundle = this.j;
        abwv abwvVar = new abwv();
        abwvVar.setArguments(bundle);
        return abwvVar;
    }

    @Override // defpackage.abvl, defpackage.abwm
    public final boolean n(abwx abwxVar, int i) {
        if (super.n(abwxVar, i)) {
            return true;
        }
        if (!abwv.a.equals(abwxVar.y())) {
            throw new UnsupportedOperationException("Fragment not supported in simple notification flow.");
        }
        t(fiig.APPROVE_SELECTED, 2);
        setResult(-1);
        finish();
        return true;
    }
}
