package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.abvl;
import defpackage.abwn;
import defpackage.abwo;
import defpackage.abwt;
import defpackage.abwx;
import defpackage.abxb;
import defpackage.fgrr;
import defpackage.fihs;
import defpackage.fiig;
import defpackage.fiij;
import defpackage.fiit;
import defpackage.fiiu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PinConfirmationChimeraWorkflow extends abvl {
    public static final /* synthetic */ int A = 0;

    public static Intent u(fiiu fiiuVar, String str, byte[] bArr) {
        Intent a = a(fiiuVar, str, bArr);
        a.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationWorkflow");
        return a;
    }

    @Override // defpackage.abvl, defpackage.abwm
    public final boolean n(abwx abwxVar, int i) {
        if (!super.n(abwxVar, i)) {
            String y = abwxVar.y();
            if (abwt.a.equals(y)) {
                if (i == 0) {
                    r(2, false);
                    fiit fiitVar = this.m.e;
                    if (fiitVar == null) {
                        fiitVar = fiit.b;
                    }
                    fihs fihsVar = fiitVar.m;
                    if (fihsVar == null) {
                        fihsVar = fihs.a;
                    }
                    if (((fiij) fihsVar.c.get(0)).f && this.y == 46) {
                        r(604, false);
                        t(fiig.APPROVE_SELECTED, 2);
                        f(this.j.getString(abxb.g));
                        return true;
                    }
                    fiit fiitVar2 = this.m.e;
                    if (fiitVar2 == null) {
                        fiitVar2 = fiit.b;
                    }
                    fihs fihsVar2 = fiitVar2.m;
                    if (fihsVar2 == null) {
                        fihsVar2 = fihs.a;
                    }
                    fgrr fgrrVar = ((fiij) fihsVar2.c.get(0)).e;
                    Bundle bundle = this.j;
                    int intValue = ((Integer) fgrrVar.get(0)).intValue();
                    abwo.ai.h("Pins received: ".concat(String.valueOf(String.valueOf(fgrrVar))), new Object[0]);
                    abwo abwoVar = new abwo();
                    bundle.putString(abwo.d, Integer.toString(intValue));
                    String str = abwo.ag;
                    ArrayList<String> arrayList = new ArrayList<>();
                    Iterator it = fgrrVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.toString(((Integer) it.next()).intValue()));
                    }
                    Collections.shuffle(arrayList);
                    bundle.putStringArrayList(str, arrayList);
                    abwoVar.setArguments(bundle);
                    l(abwxVar, abwoVar);
                } else {
                    c(abwxVar);
                }
            } else {
                if (!abwo.a.equals(y)) {
                    if (!abwn.a.equals(y)) {
                        throw new RuntimeException("Fragment not supported in account recovery workflow: ".concat(String.valueOf(y)));
                    }
                    setResult(-1);
                    finish();
                    return true;
                }
                if (i == 0) {
                    t(fiig.APPROVE_SELECTED, 2);
                    f(this.j.getString(abxb.g));
                } else if (i == 1) {
                    t(fiig.APPROVE_MISMATCHED, 202);
                    Bundle bundle2 = (Bundle) this.j.clone();
                    bundle2.putString(abwn.b, this.j.getString(abxb.c));
                    bundle2.putString(abwn.c, this.j.getString(abxb.d));
                    bundle2.putString(abwn.ag, this.j.getString(abxb.e));
                    bundle2.putString(abwn.d, this.j.getString(abxb.f));
                    l(abwxVar, abwn.x(bundle2));
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
