package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.ffti;
import defpackage.fftw;
import defpackage.zvl;
import defpackage.zwv;
import defpackage.zwx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SimpleNotificationChimeraWorkflow extends zvl {
    public static final /* synthetic */ int A = 0;

    public static Intent u(fftw fftwVar, String str, byte[] bArr) {
        Intent a = a(fftwVar, str, bArr);
        a.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.SimpleNotificationWorkflow");
        return a;
    }

    @Override // defpackage.zvl
    protected final zwx b() {
        Bundle bundle = this.j;
        zwv zwvVar = new zwv();
        zwvVar.setArguments(bundle);
        return zwvVar;
    }

    @Override // defpackage.zvl, defpackage.zwm
    public final boolean n(zwx zwxVar, int i) {
        if (super.n(zwxVar, i)) {
            return true;
        }
        if (!zwv.a.equals(zwxVar.y())) {
            throw new UnsupportedOperationException("Fragment not supported in simple notification flow.");
        }
        t(ffti.APPROVE_SELECTED, 2);
        setResult(-1);
        finish();
        return true;
    }
}
