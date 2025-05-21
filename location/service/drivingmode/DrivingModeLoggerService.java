package com.google.android.gms.location.service.drivingmode;

import android.content.ComponentName;
import android.content.Context;
import android.util.Pair;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aju$$ExternalSyntheticApiModelOutline0;
import defpackage.asbo;
import defpackage.asot;
import defpackage.axmz;
import defpackage.brbv;
import defpackage.bsds;
import defpackage.byln;
import defpackage.ebdn;
import defpackage.ejhf;
import defpackage.evqy;
import defpackage.evsz;
import defpackage.evta;
import defpackage.evtd;
import defpackage.evtf;
import defpackage.fecj;
import defpackage.fpsg;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DrivingModeLoggerService extends GmsTaskBoundService {
    private final Context a;
    private final axmz b;

    public DrivingModeLoggerService(axmz axmzVar, Context context) {
        this.b = axmzVar;
        this.a = context;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        boolean isEnabled;
        ComponentName owner;
        if (!Objects.equals(bylnVar.a, "driving_mode_setting")) {
            return 2;
        }
        Context context = this.a;
        asot asotVar = ebdn.a;
        asbo f = asbo.f(context);
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
        Pair pair = null;
        if (f == null || !f.z()) {
            ((ejhf) ebdn.a.h()).x("Null notificationManager or no permission getting existing driving rule");
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
                        owner = aju$$ExternalSyntheticApiModelOutline0.m(entry.getValue()).getOwner();
                        if (componentName.equals(owner)) {
                            pair = new Pair((String) entry.getKey(), aju$$ExternalSyntheticApiModelOutline0.m(entry.getValue()));
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
        isEnabled = aju$$ExternalSyntheticApiModelOutline0.m(pair.second).isEnabled();
        d(true != isEnabled ? 3 : 2);
        return 0;
    }

    final void d(int i) {
        if (fpsg.a.a().w()) {
            axmz axmzVar = this.b;
            fecj v = evta.a.v();
            evtf evtfVar = evtf.DRIVING_MODE_LOCATION;
            if (!v.b.L()) {
                v.U();
            }
            evta evtaVar = (evta) v.b;
            evtaVar.c = evtfVar.e;
            evtaVar.b |= 1;
            fecj v2 = evsz.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            evsz evszVar = (evsz) v2.b;
            evszVar.c = i - 1;
            evszVar.b |= 1;
            if (!v.b.L()) {
                v.U();
            }
            evta evtaVar2 = (evta) v.b;
            evsz evszVar2 = (evsz) v2.Q();
            evszVar2.getClass();
            evtaVar2.e = evszVar2;
            evtaVar2.b |= 16;
            evtd evtdVar = evtd.DRIVING_MODE_DAILY_STATUS_LOG;
            if (!v.b.L()) {
                v.U();
            }
            evta evtaVar3 = (evta) v.b;
            evtaVar3.d = evtdVar.Y;
            evtaVar3.b |= 2;
            fecj v3 = evqy.a.v();
            evta evtaVar4 = (evta) v.Q();
            if (!v3.b.L()) {
                v3.U();
            }
            evqy evqyVar = (evqy) v3.b;
            evtaVar4.getClass();
            evqyVar.t = evtaVar4;
            evqyVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            if (!fpsg.j()) {
                axmzVar.e((evqy) v3.Q(), 19);
                return;
            }
            brbv l = bsds.v().l((evqy) v3.Q());
            l.c = 18;
            l.a();
        }
    }
}
