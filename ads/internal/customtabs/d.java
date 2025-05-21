package com.google.android.gms.ads.internal.customtabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.l;
import defpackage.ajt;
import defpackage.aju;
import defpackage.ajv;
import defpackage.ajw;
import defpackage.ajx;
import defpackage.fyuu;
import defpackage.fyuw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d implements fyuw {
    public ajt a;
    public ajw b;
    public l c;
    private ajx d;

    @Override // defpackage.fyuw
    public final void a(ajt ajtVar) {
        this.a = ajtVar;
        ajtVar.c();
        l lVar = this.c;
        if (lVar != null) {
            d dVar = lVar.a;
            ajt ajtVar2 = dVar.a;
            if (ajtVar2 == null) {
                dVar.d = null;
            } else if (dVar.d == null) {
                dVar.d = ajtVar2.a(null);
            }
            ajv a = new aju(dVar.d).a();
            Intent intent = a.a;
            Context context = lVar.b;
            intent.setPackage(fyuu.a(context));
            a.a(context, lVar.c);
            Activity activity = (Activity) context;
            ajw ajwVar = dVar.b;
            if (ajwVar == null) {
                return;
            }
            activity.unbindService(ajwVar);
            dVar.a = null;
            dVar.d = null;
            dVar.b = null;
        }
    }

    @Override // defpackage.fyuw
    public final void b() {
        this.a = null;
        this.d = null;
    }
}
