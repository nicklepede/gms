package com.google.android.gms.wallet.dynamite.logging;

import android.content.Context;
import com.google.android.gms.wallet.button.ButtonOptions;
import defpackage.apta;
import defpackage.dnmt;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.ffff;
import defpackage.fffh;
import defpackage.fffi;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class a {
    private final Context a;
    private final apta b;
    private final long c = UUID.randomUUID().getLeastSignificantBits();
    private final ButtonOptions d;

    public a(Context context, apta aptaVar, ButtonOptions buttonOptions) {
        this.a = context;
        this.b = aptaVar;
        this.d = buttonOptions;
    }

    public final void a(fecj fecjVar) {
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        long j = this.c;
        fffh fffhVar = (fffh) fecjVar.b;
        fffh fffhVar2 = fffh.a;
        fffhVar.b |= 2;
        fffhVar.f = j;
        fecj v = fffi.a.v();
        Context context = this.a;
        String packageName = context.getPackageName();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        fffi fffiVar = (fffi) fecpVar;
        packageName.getClass();
        fffiVar.b |= 1;
        fffiVar.c = packageName;
        int a = ffff.a(this.d.a);
        int i = a != 0 ? a : 1;
        if (!fecpVar.L()) {
            v.U();
        }
        fffi fffiVar2 = (fffi) v.b;
        fffiVar2.d = i - 1;
        fffiVar2.b |= 2;
        fffi fffiVar3 = (fffi) v.Q();
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        fffh fffhVar3 = (fffh) fecjVar.b;
        fffiVar3.getClass();
        fffhVar3.g = fffiVar3;
        fffhVar3.b |= 4;
        this.b.j(fecjVar.Q(), dnmt.b(context, new b())).d();
    }
}
