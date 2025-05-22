package com.google.android.gms.ads.internal.customtabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.l;
import defpackage.akc;
import defpackage.akd;
import defpackage.ake;
import defpackage.akf;
import defpackage.akg;
import defpackage.gbro;
import defpackage.gbrq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d implements gbrq {
    public akc a;
    public akf b;
    public l c;
    private akg d;

    @Override // defpackage.gbrq
    public final void a(akc akcVar) {
        this.a = akcVar;
        akcVar.c();
        l lVar = this.c;
        if (lVar != null) {
            d dVar = lVar.a;
            akc akcVar2 = dVar.a;
            if (akcVar2 == null) {
                dVar.d = null;
            } else if (dVar.d == null) {
                dVar.d = akcVar2.a(null);
            }
            ake a = new akd(dVar.d).a();
            Intent intent = a.a;
            Context context = lVar.b;
            intent.setPackage(gbro.a(context));
            a.a(context, lVar.c);
            Activity activity = (Activity) context;
            akf akfVar = dVar.b;
            if (akfVar == null) {
                return;
            }
            activity.unbindService(akfVar);
            dVar.a = null;
            dVar.d = null;
            dVar.b = null;
        }
    }

    @Override // defpackage.gbrq
    public final void b() {
        this.a = null;
        this.d = null;
    }
}
