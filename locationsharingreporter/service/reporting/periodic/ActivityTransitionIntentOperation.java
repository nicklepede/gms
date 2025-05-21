package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.R;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asot;
import defpackage.cavr;
import defpackage.caxg;
import defpackage.cazm;
import defpackage.cbbn;
import defpackage.cbbo;
import defpackage.dfee;
import defpackage.ebfg;
import defpackage.ebfh;
import defpackage.ebgd;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fpxh;
import defpackage.ikd;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ActivityTransitionIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);

    private static void a() {
        try {
            caxg a2 = caxg.a();
            AppContextProvider.a();
            a2.d().get(fpxh.a.a().I(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 5796)).x("Failed to unregister for activity transition updates.");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        asot asotVar = b;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5791)).x("Device activity transition detected.");
        if (!fpxh.w() || !fpxh.t()) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5792)).x("Activity transition intent received, when flags disabled, unregistering.");
            a();
        }
        if (intent == null) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5795)).x("Received a null Intent.");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5794)).x("Received intent with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_ACTIVITY_TRANSITION")) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5793)).B("Received intent with unknown action: %s", action);
            return;
        }
        caxg a2 = caxg.a();
        if (ActivityTransitionResult.b(intent)) {
            ActivityTransitionResult a3 = ActivityTransitionResult.a(intent);
            if (a3 == null) {
                ((ejhf) ((ejhf) caxg.a.j()).ah((char) 5785)).x("Received a null ActivityTransitionResult.");
                return;
            }
            HashSet hashSet = new HashSet();
            List list = a3.a;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    i = 4;
                    break;
                }
                ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) list.get(size);
                if (activityTransitionEvent.b == 1) {
                    hashSet.add(Integer.valueOf(activityTransitionEvent.a));
                } else {
                    i = activityTransitionEvent.a;
                    if (!hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                }
            }
            asot asotVar2 = caxg.a;
            ((ejhf) ((ejhf) asotVar2.h()).ah((char) 5783)).z("Received activity transition update, activity: %s", i);
            cazm cazmVar = a2.c;
            if (cazmVar.b().h() && ((Integer) cazmVar.b().c()).intValue() == i) {
                return;
            }
            int i2 = i == 4 ? 1 : cazm.e(i) ? 2 : 3;
            int i3 = cbbn.a;
            fecj v = ebfg.a.v();
            fecj v2 = ebgd.a.v();
            fecj v3 = ebfh.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            ebfh ebfhVar = (ebfh) v3.b;
            ebfhVar.c = i2 - 1;
            ebfhVar.b |= 1;
            ebfh ebfhVar2 = (ebfh) v3.Q();
            if (!v2.b.L()) {
                v2.U();
            }
            ebgd ebgdVar = (ebgd) v2.b;
            ebfhVar2.getClass();
            fedh fedhVar = ebgdVar.x;
            if (!fedhVar.c()) {
                ebgdVar.x = fecp.E(fedhVar);
            }
            ebgdVar.x.add(ebfhVar2);
            if (!v.b.L()) {
                v.U();
            }
            ebfg ebfgVar = (ebfg) v.b;
            ebgd ebgdVar2 = (ebgd) v2.Q();
            ebgdVar2.getClass();
            ebfgVar.c = ebgdVar2;
            ebfgVar.b = 1;
            cbbo.b(null, (ebfg) v.Q());
            ((ejhf) ((ejhf) asotVar2.h()).ah((char) 5784)).B("Received activity transition is different from the last detected, refreshing state. LastReceivedActivity: %s", cazmVar.b());
            cazmVar.d(i);
            cavr.a();
            Context a4 = AppContextProvider.a();
            if (fpxh.s()) {
                asbo f = asbo.f(a4);
                eiig.x(f);
                cavr.b(f);
                ikd ikdVar = new ikd(a4, "LSR_geofencing_debug_notification");
                ikdVar.g(R.drawable.ic_dialog_alert);
                ikdVar.m("Activity transition");
                ikdVar.l(String.format("Activity transition result: %s", DetectedActivity.b(i)));
                ikdVar.l = 2;
                if (fpxh.C()) {
                    f.w(cavr.class.getName(), 628449244, dfee.LSR_CENTRALIZED_LOCATION_SHARING, ikdVar.b());
                } else {
                    f.v(cavr.class.getName(), 628449244, ikdVar.b());
                }
            }
            caxg.b();
        }
    }
}
