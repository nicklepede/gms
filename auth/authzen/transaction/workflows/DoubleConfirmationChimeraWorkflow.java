package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.ffti;
import defpackage.fftw;
import defpackage.zvl;
import defpackage.zwn;
import defpackage.zwp;
import defpackage.zwt;
import defpackage.zwx;
import defpackage.zxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DoubleConfirmationChimeraWorkflow extends zvl {
    public static final /* synthetic */ int A = 0;

    public static Intent u(fftw fftwVar, String str, byte[] bArr) {
        Intent a = a(fftwVar, str, bArr);
        a.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationWorkflow");
        return a;
    }

    @Override // defpackage.zvl, defpackage.zwm
    public final boolean n(zwx zwxVar, int i) {
        if (!super.n(zwxVar, i)) {
            String y = zwxVar.y();
            if (zwt.a.equals(y)) {
                if (i == 0) {
                    r(2, false);
                    Bundle bundle = this.j;
                    zwp zwpVar = new zwp();
                    zwpVar.setArguments(bundle);
                    l(zwxVar, zwpVar);
                } else {
                    t(ffti.APPROVE_ABORTED, 3);
                    c(zwxVar);
                }
            } else {
                if (!zwp.a.equals(y)) {
                    if (!zwn.a.equals(y)) {
                        throw new RuntimeException("Fragment not supported in double confirm workflow: ".concat(String.valueOf(y)));
                    }
                    setResult(-1);
                    finish();
                    return true;
                }
                if (i == 0) {
                    t(ffti.APPROVE_SELECTED, 2);
                    f(this.j.getString(zxb.g));
                } else {
                    t(ffti.APPROVE_ABORTED, 3);
                    k(this.j.getString(zxb.h));
                    setResult(-1);
                    finish();
                }
            }
        }
        return true;
    }
}
