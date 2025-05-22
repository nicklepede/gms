package com.google.android.gms.chimera.debug;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import defpackage.apzx;
import defpackage.aqjq;
import defpackage.aqjs;
import defpackage.aqjt;
import defpackage.aqju;
import defpackage.aqjw;
import defpackage.aurd;
import defpackage.buy;
import defpackage.fgou;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtj;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ModuleSetJournalUpdate$ModuleSetJournalIntentOperation extends IntentOperation {
    private static final Comparator a = new Comparator() { // from class: aqjv
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            aqju aqjuVar = (aqju) obj;
            aqju aqjuVar2 = (aqju) obj2;
            return eldp.b.d(aqjuVar.c, aqjuVar2.c).c(aqjuVar.d, aqjuVar2.d).a();
        }
    };

    static void a(Context context, byte[] bArr, boolean z) {
        if (bArr == null) {
            Log.w("ModuleSetJournalOp", "Ignoring null module set journal bytes.");
            return;
        }
        try {
            fgqp fgqpVar = fgqp.a;
            fgti fgtiVar = fgti.a;
            fgri y = fgri.y(aqjq.a, bArr, 0, bArr.length, fgqp.a);
            fgri.M(y);
            aqjq aqjqVar = (aqjq) y;
            apzx d = apzx.d(context);
            aqjq f = d.f();
            buy buyVar = new buy();
            if (f != null) {
                for (aqju aqjuVar : f.b) {
                    buyVar.put(aqjw.b(aqjuVar), aqjuVar);
                }
            }
            buy buyVar2 = z ? new buy() : buyVar;
            for (aqju aqjuVar2 : aqjqVar.b) {
                String b = aqjw.b(aqjuVar2);
                aqju aqjuVar3 = (aqju) buyVar.get(b);
                if (aqjuVar3 != null) {
                    fgsa fgsaVar = aqjuVar2.e;
                    fgrc fgrcVar = (fgrc) aqjuVar2.iQ(5, null);
                    fgrcVar.X(aqjuVar2);
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    aqju aqjuVar4 = (aqju) fgrcVar.b;
                    fgtj fgtjVar = fgtj.a;
                    aqjuVar4.e = fgtjVar;
                    fgrcVar.da(fgsaVar);
                    fgrcVar.da(aqjuVar3.e);
                    if (((aqju) fgrcVar.b).e.size() >= 2) {
                        ArrayList arrayList = new ArrayList();
                        aqjt aqjtVar = aqjt.a;
                        for (aqjt aqjtVar2 : DesugarCollections.unmodifiableList(((aqju) fgrcVar.b).e)) {
                            int a2 = aqjs.a(aqjtVar2.c);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            int a3 = aqjs.a(aqjtVar.c);
                            if (a2 != (a3 != 0 ? a3 : 1)) {
                                arrayList.add(aqjtVar2);
                                aqjtVar = aqjtVar2;
                            }
                        }
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        ((aqju) fgrcVar.b).e = fgtjVar;
                        fgrcVar.da(arrayList);
                    }
                    aqjw.k(fgrcVar);
                    aqjuVar2 = (aqju) fgrcVar.Q();
                }
                buyVar2.put(b, aqjuVar2);
            }
            ArrayList arrayList2 = new ArrayList(buyVar2.d);
            for (int i = 0; i < buyVar2.d; i++) {
                arrayList2.add((aqju) buyVar2.i(i));
            }
            Collections.sort(arrayList2, a);
            fgrc v = aqjq.a.v();
            if (!v.b.L()) {
                v.U();
            }
            aqjq aqjqVar2 = (aqjq) v.b;
            aqjqVar2.b();
            fgou.E(arrayList2, aqjqVar2.b);
            aqjq aqjqVar3 = (aqjq) v.Q();
            if (d.h()) {
                d.a.edit().putString("Chimera.moduleSetJournal", aurd.a(aqjqVar3.r())).commit();
            }
        } catch (fgsd unused) {
            Log.w("ModuleSetJournalOp", "Failed to parse module set journal.");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.chimera.debug.WRITE_JOURNAL_UPDATE_ACTION".equals(action)) {
            a(this, intent.getByteArrayExtra("entries"), intent.getIntExtra("isComprehensive", 0) != 0);
            return;
        }
        if ("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(action)) {
            ModuleManager moduleManager = ModuleManager.get(this);
            try {
                aqjw aqjwVar = new aqjw();
                for (ModuleManager.ModuleSetInfo moduleSetInfo : moduleManager.getCurrentConfig().moduleSets) {
                    aqjwVar.i(moduleSetInfo.moduleSetId, moduleSetInfo.moduleSetVersion, 2, moduleSetInfo.enabledFeatures);
                }
                a(this, aqjwVar.d(), false);
            } catch (InvalidConfigException e) {
                Log.w("ModuleSetJournalOp", "Chimera module config error: ".concat(e.toString()));
            }
        }
    }
}
