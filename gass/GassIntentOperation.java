package com.google.android.gms.gass;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bjxk;
import defpackage.bjxl;
import defpackage.bjxt;
import defpackage.bjxu;
import defpackage.bjzf;
import defpackage.bjzg;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgti;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GassIntentOperation extends IntentOperation {
    protected static final String a = "GassIntentOperation";
    private static final ausn b = ausn.b(a, auid.GASS);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((eluo) b.j()).x("Intent cannot be null.");
            return;
        }
        try {
            byte[] byteArray = intent.getExtras().getByteArray("IntentParameter");
            bjzg bjzgVar = bjzg.a;
            int length = byteArray.length;
            fgqp fgqpVar = fgqp.a;
            fgti fgtiVar = fgti.a;
            fgri y = fgri.y(bjzgVar, byteArray, 0, length, fgqp.a);
            fgri.M(y);
            bjzg bjzgVar2 = (bjzg) y;
            int i = bjxu.a;
            int a2 = bjzf.a(bjzgVar2.c);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            bjxt bjxkVar = i2 != 1 ? i2 != 2 ? null : new bjxk(this) : new bjxl();
            if (bjxkVar == null) {
                ((eluo) b.j()).x("Failed to create task");
            } else {
                bjxkVar.a(this, bjzgVar2);
            }
        } catch (IOException e) {
            ((eluo) ((eluo) b.j()).s(e)).x("Failed to parse task info");
        }
    }
}
