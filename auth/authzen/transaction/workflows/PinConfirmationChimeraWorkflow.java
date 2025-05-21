package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.fecy;
import defpackage.ffsu;
import defpackage.ffti;
import defpackage.fftl;
import defpackage.fftv;
import defpackage.fftw;
import defpackage.zvl;
import defpackage.zwn;
import defpackage.zwo;
import defpackage.zwt;
import defpackage.zwx;
import defpackage.zxb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PinConfirmationChimeraWorkflow extends zvl {
    public static final /* synthetic */ int A = 0;

    public static Intent u(fftw fftwVar, String str, byte[] bArr) {
        Intent a = a(fftwVar, str, bArr);
        a.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationWorkflow");
        return a;
    }

    @Override // defpackage.zvl, defpackage.zwm
    public final boolean n(zwx zwxVar, int i) {
        if (!super.n(zwxVar, i)) {
            String y = zwxVar.y();
            if (zwt.a.equals(y)) {
                if (i == 0) {
                    r(2, false);
                    fftv fftvVar = this.m.e;
                    if (fftvVar == null) {
                        fftvVar = fftv.b;
                    }
                    ffsu ffsuVar = fftvVar.m;
                    if (ffsuVar == null) {
                        ffsuVar = ffsu.a;
                    }
                    if (((fftl) ffsuVar.c.get(0)).f && this.y == 46) {
                        r(604, false);
                        t(ffti.APPROVE_SELECTED, 2);
                        f(this.j.getString(zxb.g));
                        return true;
                    }
                    fftv fftvVar2 = this.m.e;
                    if (fftvVar2 == null) {
                        fftvVar2 = fftv.b;
                    }
                    ffsu ffsuVar2 = fftvVar2.m;
                    if (ffsuVar2 == null) {
                        ffsuVar2 = ffsu.a;
                    }
                    fecy fecyVar = ((fftl) ffsuVar2.c.get(0)).e;
                    Bundle bundle = this.j;
                    int intValue = ((Integer) fecyVar.get(0)).intValue();
                    zwo.ai.h("Pins received: ".concat(String.valueOf(String.valueOf(fecyVar))), new Object[0]);
                    zwo zwoVar = new zwo();
                    bundle.putString(zwo.d, Integer.toString(intValue));
                    String str = zwo.ag;
                    ArrayList<String> arrayList = new ArrayList<>();
                    Iterator it = fecyVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.toString(((Integer) it.next()).intValue()));
                    }
                    Collections.shuffle(arrayList);
                    bundle.putStringArrayList(str, arrayList);
                    zwoVar.setArguments(bundle);
                    l(zwxVar, zwoVar);
                } else {
                    c(zwxVar);
                }
            } else {
                if (!zwo.a.equals(y)) {
                    if (!zwn.a.equals(y)) {
                        throw new RuntimeException("Fragment not supported in account recovery workflow: ".concat(String.valueOf(y)));
                    }
                    setResult(-1);
                    finish();
                    return true;
                }
                if (i == 0) {
                    t(ffti.APPROVE_SELECTED, 2);
                    f(this.j.getString(zxb.g));
                } else if (i == 1) {
                    t(ffti.APPROVE_MISMATCHED, 202);
                    Bundle bundle2 = (Bundle) this.j.clone();
                    bundle2.putString(zwn.b, this.j.getString(zxb.c));
                    bundle2.putString(zwn.c, this.j.getString(zxb.d));
                    bundle2.putString(zwn.ag, this.j.getString(zxb.e));
                    bundle2.putString(zwn.d, this.j.getString(zxb.f));
                    l(zwxVar, zwn.x(bundle2));
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
