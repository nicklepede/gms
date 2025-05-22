package com.google.android.gms.wallet.dynamite.logging;

import android.content.Context;
import com.google.android.gms.wallet.button.ButtonOptions;
import defpackage.arvr;
import defpackage.dpxc;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhud;
import defpackage.fhuf;
import defpackage.fhug;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class a {
    private final Context a;
    private final arvr b;
    private final long c = UUID.randomUUID().getLeastSignificantBits();
    private final ButtonOptions d;

    public a(Context context, arvr arvrVar, ButtonOptions buttonOptions) {
        this.a = context;
        this.b = arvrVar;
        this.d = buttonOptions;
    }

    public final void a(fgrc fgrcVar) {
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        long j = this.c;
        fhuf fhufVar = (fhuf) fgrcVar.b;
        fhuf fhufVar2 = fhuf.a;
        fhufVar.b |= 2;
        fhufVar.f = j;
        fgrc v = fhug.a.v();
        Context context = this.a;
        String packageName = context.getPackageName();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        fhug fhugVar = (fhug) fgriVar;
        packageName.getClass();
        fhugVar.b |= 1;
        fhugVar.c = packageName;
        int a = fhud.a(this.d.a);
        int i = a != 0 ? a : 1;
        if (!fgriVar.L()) {
            v.U();
        }
        fhug fhugVar2 = (fhug) v.b;
        fhugVar2.d = i - 1;
        fhugVar2.b |= 2;
        fhug fhugVar3 = (fhug) v.Q();
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fhuf fhufVar3 = (fhuf) fgrcVar.b;
        fhugVar3.getClass();
        fhufVar3.g = fhugVar3;
        fhufVar3.b |= 4;
        this.b.j(fgrcVar.Q(), dpxc.b(context, new b())).d();
    }
}
