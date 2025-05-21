package com.google.android.gms.ads.internal.client;

import defpackage.tbw;
import defpackage.tdh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class v extends tbw {
    public final Object a = new Object();
    public tbw b;

    @Override // defpackage.tbw, com.google.android.gms.ads.internal.client.a
    public final void a() {
        synchronized (this.a) {
            tbw tbwVar = this.b;
            if (tbwVar != null) {
                tbwVar.a();
            }
        }
    }

    @Override // defpackage.tbw
    public final void b() {
        synchronized (this.a) {
            tbw tbwVar = this.b;
            if (tbwVar != null) {
                tbwVar.b();
            }
        }
    }

    @Override // defpackage.tbw
    public void c(tdh tdhVar) {
        synchronized (this.a) {
            tbw tbwVar = this.b;
            if (tbwVar != null) {
                tbwVar.c(tdhVar);
            }
        }
    }

    @Override // defpackage.tbw
    public void d() {
        synchronized (this.a) {
            tbw tbwVar = this.b;
            if (tbwVar != null) {
                tbwVar.d();
            }
        }
    }

    @Override // defpackage.tbw
    public final void e() {
        synchronized (this.a) {
            tbw tbwVar = this.b;
            if (tbwVar != null) {
                tbwVar.e();
            }
        }
    }

    @Override // defpackage.tbw
    public final void f() {
        synchronized (this.a) {
        }
    }
}
