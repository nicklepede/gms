package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.abvl;
import defpackage.abwn;
import defpackage.abwt;
import defpackage.abwx;
import defpackage.abxb;
import defpackage.fiig;
import defpackage.fiiu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BasicConfirmationChimeraWorkflow extends abvl {
    public static final /* synthetic */ int A = 0;

    public static Intent u(fiiu fiiuVar, String str, byte[] bArr) {
        Intent a = a(fiiuVar, str, bArr);
        a.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.BasicConfirmationWorkflow");
        return a;
    }

    @Override // defpackage.abvl, defpackage.abwm
    public final boolean n(abwx abwxVar, int i) {
        if (super.n(abwxVar, i)) {
            return true;
        }
        String y = abwxVar.y();
        if (!abwt.a.equals(y)) {
            if (!abwn.a.equals(y)) {
                throw new RuntimeException("Fragment not supported in basic confirm workflow: ".concat(String.valueOf(y)));
            }
            setResult(-1);
            finish();
            return true;
        }
        if (i != 0) {
            c(abwxVar);
            return true;
        }
        t(fiig.APPROVE_SELECTED, 2);
        f(this.j.getString(abxb.g));
        return true;
    }
}
