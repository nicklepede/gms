package com.google.android.gms.auth.aang.impl.deviceaccount;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.auth.aang.impl.deviceaccount.DeviceAccountDeletionChimeraReceiver;
import defpackage.aebj;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catb;
import defpackage.eluo;
import defpackage.emod;
import defpackage.emok;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmvk;
import defpackage.wtq;
import defpackage.wxa;
import defpackage.xhx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceAccountDeletionChimeraReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int b = 0;
    private static final ausn c = wxa.a("DeviceAccountDeletionChimeraReceiver");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c2;
        if (!wtq.f()) {
            Process.myUserHandle().getIdentifier();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((eluo) c.j()).x("Action is null.");
            return;
        }
        switch (action.hashCode()) {
            case -2061058799:
                if (action.equals("android.intent.action.USER_REMOVED")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1398590059:
                if (action.equals("android.intent.action.MASTER_CLEAR_NOTIFICATION")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1343238867:
                if (action.equals("com.google.android.gms.auth.ACTION_DELETE_DEVICE_ACCOUNT")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1851573788:
                if (action.equals("com.google.android.gms.auth.STORE_DEVICE_ACCOUNT_DELETION_DATA")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            Bundle extras = intent.getExtras();
            int i = DeviceAccountDeletionTaskService.a;
            catb catbVar = new catb();
            catbVar.t(DeviceAccountDeletionTaskService.e("TASK_STORE_DEVICE_ACCOUNT_DELETION_DATA", DeviceAccountDeletionTaskService.d(extras)));
            catbVar.e(fmvk.c(), fmvk.b());
            catbVar.p = true;
            catbVar.u = extras;
            catbVar.v(2);
            catbVar.w(DeviceAccountDeletionTaskService.class.getName());
            casd.a(context).f(catbVar.b());
            return;
        }
        if (c2 != 1) {
            if (c2 != 2) {
                if (c2 != 3) {
                    ((eluo) c.j()).B("Unknown action=%s", action);
                    return;
                }
                final aebj aebjVar = new aebj(context);
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                try {
                    final wtq wtqVar = (wtq) wtq.a.b();
                    try {
                        Map c3 = wtqVar.c();
                        ((eluo) wtq.b.h()).z("Deleting %d device accounts", c3.size());
                        aupz aupzVar = new aupz(Integer.MAX_VALUE, 9);
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : c3.entrySet()) {
                            final int intValue = ((Integer) entry.getKey()).intValue();
                            final xhx xhxVar = (xhx) entry.getValue();
                            arrayList.add(aupzVar.submit(new Callable() { // from class: wtm
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    wtq wtqVar2 = wtq.this;
                                    aebj aebjVar2 = aebjVar;
                                    int i2 = intValue;
                                    xhx xhxVar2 = xhxVar;
                                    try {
                                        ewdb g = wtq.g(aebjVar2, xhxVar2);
                                        if (g == null) {
                                            return ektg.a;
                                        }
                                        wtqVar2.d(i2, xhxVar2);
                                        ((eluo) wtq.b.h()).z("Deleted device account for user %d", i2);
                                        return ekvi.j(g);
                                    } catch (fwuc | wjw e) {
                                        ((eluo) ((eluo) wtq.b.j()).s(e)).z("Failed to delete device account for user %d", i2);
                                        return ektg.a;
                                    }
                                }
                            }));
                        }
                        fgrc v = emok.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        emok emokVar = (emok) v.b;
                        emokVar.c = 5;
                        emokVar.b |= 1;
                        fgrc v2 = emod.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fgri fgriVar = v2.b;
                        emod emodVar = (emod) fgriVar;
                        emodVar.c = 3;
                        emodVar.b |= 1;
                        if (!fgriVar.L()) {
                            v2.U();
                        }
                        emod emodVar2 = (emod) v2.b;
                        emodVar2.d = 2;
                        emodVar2.b = 2 | emodVar2.b;
                        if (!v.b.L()) {
                            v.U();
                        }
                        emok emokVar2 = (emok) v.b;
                        emod emodVar3 = (emod) v2.Q();
                        emodVar3.getClass();
                        emokVar2.h = emodVar3;
                        emokVar2.b |= 32;
                        wxa.h((emok) v.Q());
                        eqgc.a(arrayList).a(new Callable() { // from class: wtk
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i2 = DeviceAccountDeletionChimeraReceiver.b;
                                aebj.this.b();
                                goAsync.finish();
                                return null;
                            }
                        }, eqex.a);
                        return;
                    } catch (IOException e) {
                        fgrc v3 = emok.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        emok emokVar3 = (emok) v3.b;
                        emokVar3.c = 5;
                        emokVar3.b |= 1;
                        fgrc v4 = emod.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fgri fgriVar2 = v4.b;
                        emod emodVar4 = (emod) fgriVar2;
                        emodVar4.c = 3;
                        emodVar4.b |= 1;
                        if (!fgriVar2.L()) {
                            v4.U();
                        }
                        emod emodVar5 = (emod) v4.b;
                        emodVar5.d = 1;
                        emodVar5.b |= 2;
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        emok emokVar4 = (emok) v3.b;
                        emod emodVar6 = (emod) v4.Q();
                        emodVar6.getClass();
                        emokVar4.h = emodVar6;
                        emokVar4.b |= 32;
                        wxa.B(v3, e);
                        throw e;
                    }
                } catch (IOException e2) {
                    ((eluo) ((eluo) c.j()).s(e2)).x("Failed to get device account deletion data.");
                    return;
                }
            }
        } else if (!fmvk.e()) {
            ((eluo) c.h()).x("Received ACTION_DELETE_DEVICE_ACCOUNT but feature not enabled");
            return;
        }
        DeviceAccountDeletionTaskService.g(context, DeviceAccountDeletionTaskService.d(intent.getExtras()));
    }
}
