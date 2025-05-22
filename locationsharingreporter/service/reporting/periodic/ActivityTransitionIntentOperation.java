package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.R;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import defpackage.aued;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cdeh;
import defpackage.cdfw;
import defpackage.cdih;
import defpackage.cdkf;
import defpackage.cdkg;
import defpackage.dhpk;
import defpackage.edrt;
import defpackage.edru;
import defpackage.edsq;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fsrb;
import defpackage.ilt;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ActivityTransitionIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);

    private static void a() {
        try {
            cdfw a2 = cdfw.a();
            AppContextProvider.a();
            a2.d().get(fsrb.a.lK().K(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 5810)).x("Failed to unregister for activity transition updates.");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        ausn ausnVar = b;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 5805)).x("Device activity transition detected.");
        if (!fsrb.w() || !fsrb.t()) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5806)).x("Activity transition intent received, when flags disabled, unregistering.");
            a();
        }
        if (intent == null) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5809)).x("Received a null Intent.");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5808)).x("Received intent with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_ACTIVITY_TRANSITION")) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5807)).B("Received intent with unknown action: %s", action);
            return;
        }
        cdfw a2 = cdfw.a();
        if (ActivityTransitionResult.b(intent)) {
            ActivityTransitionResult a3 = ActivityTransitionResult.a(intent);
            if (a3 == null) {
                ((eluo) ((eluo) cdfw.a.j()).ai((char) 5799)).x("Received a null ActivityTransitionResult.");
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
            ausn ausnVar2 = cdfw.a;
            ((eluo) ((eluo) ausnVar2.h()).ai((char) 5797)).z("Received activity transition update, activity: %s", i);
            cdih cdihVar = a2.c;
            if (cdihVar.b().h() && ((Integer) cdihVar.b().c()).intValue() == i) {
                return;
            }
            int i2 = i == 4 ? 1 : cdih.e(i) ? 2 : 3;
            int i3 = cdkf.a;
            fgrc v = edrt.a.v();
            fgrc v2 = edsq.a.v();
            fgrc v3 = edru.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            edru edruVar = (edru) v3.b;
            edruVar.c = i2 - 1;
            edruVar.b |= 1;
            edru edruVar2 = (edru) v3.Q();
            if (!v2.b.L()) {
                v2.U();
            }
            edsq edsqVar = (edsq) v2.b;
            edruVar2.getClass();
            fgsa fgsaVar = edsqVar.x;
            if (!fgsaVar.c()) {
                edsqVar.x = fgri.E(fgsaVar);
            }
            edsqVar.x.add(edruVar2);
            if (!v.b.L()) {
                v.U();
            }
            edrt edrtVar = (edrt) v.b;
            edsq edsqVar2 = (edsq) v2.Q();
            edsqVar2.getClass();
            edrtVar.c = edsqVar2;
            edrtVar.b = 1;
            cdkg.b(null, (edrt) v.Q());
            ((eluo) ((eluo) ausnVar2.h()).ai((char) 5798)).B("Received activity transition is different from the last detected, refreshing state. LastReceivedActivity: %s", cdihVar.b());
            cdihVar.d(i);
            cdeh.a();
            Context a4 = AppContextProvider.a();
            if (fsrb.s()) {
                aued f = aued.f(a4);
                ekvl.y(f);
                cdeh.b(f);
                ilt iltVar = new ilt(a4, "LSR_geofencing_debug_notification");
                iltVar.n(R.drawable.ic_dialog_alert);
                iltVar.r("Activity transition");
                iltVar.j(String.format("Activity transition result: %s", DetectedActivity.b(i)));
                iltVar.l = 2;
                f.w(cdeh.class.getName(), 628449244, dhpk.LSR_CENTRALIZED_LOCATION_SHARING, iltVar.b());
            }
            cdfw.b();
        }
    }
}
