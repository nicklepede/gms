package com.google.android.gms.location.service.drivingmode;

import android.content.ComponentName;
import android.content.Context;
import android.util.Pair;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.akd$$ExternalSyntheticApiModelOutline0;
import defpackage.aued;
import defpackage.ausn;
import defpackage.azqz;
import defpackage.btjm;
import defpackage.bulq;
import defpackage.cauf;
import defpackage.edqa;
import defpackage.eluo;
import defpackage.eygu;
import defpackage.eyiv;
import defpackage.eyiw;
import defpackage.eyiz;
import defpackage.eyjb;
import defpackage.fgrc;
import defpackage.fsly;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DrivingModeLoggerService extends GmsTaskBoundService {
    private final Context a;
    private final azqz b;

    public DrivingModeLoggerService(azqz azqzVar, Context context) {
        this.b = azqzVar;
        this.a = context;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        boolean isEnabled;
        ComponentName owner;
        if (!Objects.equals(caufVar.a, "driving_mode_setting")) {
            return 2;
        }
        Context context = this.a;
        ausn ausnVar = edqa.a;
        aued f = aued.f(context);
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
        Pair pair = null;
        if (f == null || !f.z()) {
            ((eluo) edqa.a.h()).x("Null notificationManager or no permission getting existing driving rule");
        } else {
            Map j = f.j();
            if (j != null) {
                Iterator it = j.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue() != null) {
                        owner = akd$$ExternalSyntheticApiModelOutline0.m(entry.getValue()).getOwner();
                        if (componentName.equals(owner)) {
                            pair = new Pair((String) entry.getKey(), akd$$ExternalSyntheticApiModelOutline0.m(entry.getValue()));
                            break;
                        }
                    }
                }
            }
        }
        if (pair == null) {
            d(4);
            return 0;
        }
        isEnabled = akd$$ExternalSyntheticApiModelOutline0.m(pair.second).isEnabled();
        d(true != isEnabled ? 3 : 2);
        return 0;
    }

    final void d(int i) {
        if (fsly.a.lK().w()) {
            azqz azqzVar = this.b;
            fgrc v = eyiw.a.v();
            eyjb eyjbVar = eyjb.DRIVING_MODE_LOCATION;
            if (!v.b.L()) {
                v.U();
            }
            eyiw eyiwVar = (eyiw) v.b;
            eyiwVar.c = eyjbVar.e;
            eyiwVar.b |= 1;
            fgrc v2 = eyiv.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            eyiv eyivVar = (eyiv) v2.b;
            eyivVar.c = i - 1;
            eyivVar.b |= 1;
            if (!v.b.L()) {
                v.U();
            }
            eyiw eyiwVar2 = (eyiw) v.b;
            eyiv eyivVar2 = (eyiv) v2.Q();
            eyivVar2.getClass();
            eyiwVar2.e = eyivVar2;
            eyiwVar2.b |= 16;
            eyiz eyizVar = eyiz.DRIVING_MODE_DAILY_STATUS_LOG;
            if (!v.b.L()) {
                v.U();
            }
            eyiw eyiwVar3 = (eyiw) v.b;
            eyiwVar3.d = eyizVar.Y;
            eyiwVar3.b |= 2;
            fgrc v3 = eygu.a.v();
            eyiw eyiwVar4 = (eyiw) v.Q();
            if (!v3.b.L()) {
                v3.U();
            }
            eygu eyguVar = (eygu) v3.b;
            eyiwVar4.getClass();
            eyguVar.t = eyiwVar4;
            eyguVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            if (!fsly.j()) {
                azqzVar.e((eygu) v3.Q(), 19);
                return;
            }
            btjm l = bulq.v().l((eygu) v3.Q());
            l.c = 18;
            l.a();
        }
    }
}
