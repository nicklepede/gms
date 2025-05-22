package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.abvl;
import defpackage.abwn;
import defpackage.abwp;
import defpackage.abwt;
import defpackage.abwx;
import defpackage.abxb;
import defpackage.fiig;
import defpackage.fiiu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DoubleConfirmationChimeraWorkflow extends abvl {
    public static final /* synthetic */ int A = 0;

    public static Intent u(fiiu fiiuVar, String str, byte[] bArr) {
        Intent a = a(fiiuVar, str, bArr);
        a.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationWorkflow");
        return a;
    }

    @Override // defpackage.abvl, defpackage.abwm
    public final boolean n(abwx abwxVar, int i) {
        if (!super.n(abwxVar, i)) {
            String y = abwxVar.y();
            if (abwt.a.equals(y)) {
                if (i == 0) {
                    r(2, false);
                    Bundle bundle = this.j;
                    abwp abwpVar = new abwp();
                    abwpVar.setArguments(bundle);
                    l(abwxVar, abwpVar);
                } else {
                    t(fiig.APPROVE_ABORTED, 3);
                    c(abwxVar);
                }
            } else {
                if (!abwp.a.equals(y)) {
                    if (!abwn.a.equals(y)) {
                        throw new RuntimeException("Fragment not supported in double confirm workflow: ".concat(String.valueOf(y)));
                    }
                    setResult(-1);
                    finish();
                    return true;
                }
                if (i == 0) {
                    t(fiig.APPROVE_SELECTED, 2);
                    f(this.j.getString(abxb.g));
                } else {
                    t(fiig.APPROVE_ABORTED, 3);
                    k(this.j.getString(abxb.h));
                    setResult(-1);
                    finish();
                }
            }
        }
        return true;
    }
}
