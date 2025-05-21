package com.google.android.gms.chimera.debug;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import defpackage.anyf;
import defpackage.aohx;
import defpackage.aohz;
import defpackage.aoia;
import defpackage.aoib;
import defpackage.aoid;
import defpackage.asnj;
import defpackage.bul;
import defpackage.feab;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feeq;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ModuleSetJournalUpdate$ModuleSetJournalIntentOperation extends IntentOperation {
    private static final Comparator a = new Comparator() { // from class: aoic
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            aoib aoibVar = (aoib) obj;
            aoib aoibVar2 = (aoib) obj2;
            return eiqk.b.d(aoibVar.c, aoibVar2.c).c(aoibVar.d, aoibVar2.d).a();
        }
    };

    static void a(Context context, byte[] bArr, boolean z) {
        if (bArr == null) {
            Log.w("ModuleSetJournalOp", "Ignoring null module set journal bytes.");
            return;
        }
        try {
            febw febwVar = febw.a;
            feep feepVar = feep.a;
            fecp y = fecp.y(aohx.a, bArr, 0, bArr.length, febw.a);
            fecp.M(y);
            aohx aohxVar = (aohx) y;
            anyf d = anyf.d(context);
            aohx f = d.f();
            bul bulVar = new bul();
            if (f != null) {
                for (aoib aoibVar : f.b) {
                    bulVar.put(aoid.b(aoibVar), aoibVar);
                }
            }
            bul bulVar2 = z ? new bul() : bulVar;
            for (aoib aoibVar2 : aohxVar.b) {
                String b = aoid.b(aoibVar2);
                aoib aoibVar3 = (aoib) bulVar.get(b);
                if (aoibVar3 != null) {
                    fedh fedhVar = aoibVar2.e;
                    fecj fecjVar = (fecj) aoibVar2.iB(5, null);
                    fecjVar.X(aoibVar2);
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    ((aoib) fecjVar.b).e = feeq.a;
                    fecjVar.da(fedhVar);
                    fecjVar.da(aoibVar3.e);
                    if (((aoib) fecjVar.b).e.size() >= 2) {
                        ArrayList arrayList = new ArrayList();
                        aoia aoiaVar = aoia.a;
                        for (aoia aoiaVar2 : DesugarCollections.unmodifiableList(((aoib) fecjVar.b).e)) {
                            int a2 = aohz.a(aoiaVar2.c);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            int a3 = aohz.a(aoiaVar.c);
                            if (a2 != (a3 != 0 ? a3 : 1)) {
                                arrayList.add(aoiaVar2);
                                aoiaVar = aoiaVar2;
                            }
                        }
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        ((aoib) fecjVar.b).e = feeq.a;
                        fecjVar.da(arrayList);
                    }
                    aoid.k(fecjVar);
                    aoibVar2 = (aoib) fecjVar.Q();
                }
                bulVar2.put(b, aoibVar2);
            }
            ArrayList arrayList2 = new ArrayList(bulVar2.d);
            for (int i = 0; i < bulVar2.d; i++) {
                arrayList2.add((aoib) bulVar2.i(i));
            }
            Collections.sort(arrayList2, a);
            fecj v = aohx.a.v();
            if (!v.b.L()) {
                v.U();
            }
            aohx aohxVar2 = (aohx) v.b;
            aohxVar2.b();
            feab.E(arrayList2, aohxVar2.b);
            aohx aohxVar3 = (aohx) v.Q();
            if (d.h()) {
                d.a.edit().putString("Chimera.moduleSetJournal", asnj.a(aohxVar3.r())).commit();
            }
        } catch (fedk unused) {
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
                aoid aoidVar = new aoid();
                for (ModuleManager.ModuleSetInfo moduleSetInfo : moduleManager.getCurrentConfig().moduleSets) {
                    aoidVar.i(moduleSetInfo.moduleSetId, moduleSetInfo.moduleSetVersion, 2, moduleSetInfo.enabledFeatures);
                }
                a(this, aoidVar.d(), false);
            } catch (InvalidConfigException e) {
                Log.w("ModuleSetJournalOp", "Chimera module config error: ".concat(e.toString()));
            }
        }
    }
}
