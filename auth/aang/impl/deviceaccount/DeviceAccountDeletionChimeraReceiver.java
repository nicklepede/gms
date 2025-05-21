package com.google.android.gms.auth.aang.impl.deviceaccount;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.auth.aang.impl.deviceaccount.DeviceAccountDeletionChimeraReceiver;
import defpackage.acbj;
import defpackage.asmf;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.ejhf;
import defpackage.ekar;
import defpackage.ekay;
import defpackage.enre;
import defpackage.ensj;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkey;
import defpackage.uxq;
import defpackage.vba;
import defpackage.vlw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceAccountDeletionChimeraReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int b = 0;
    private static final asot c = vba.a("DeviceAccountDeletionChimeraReceiver");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c2;
        if (!uxq.f()) {
            Process.myUserHandle().getIdentifier();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((ejhf) c.j()).x("Action is null.");
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
            bykj bykjVar = new bykj();
            bykjVar.t(DeviceAccountDeletionTaskService.e("TASK_STORE_DEVICE_ACCOUNT_DELETION_DATA", DeviceAccountDeletionTaskService.d(extras)));
            bykjVar.e(fkey.c(), fkey.b());
            bykjVar.p = true;
            bykjVar.u = extras;
            bykjVar.v(2);
            bykjVar.w(DeviceAccountDeletionTaskService.class.getName());
            byjl.a(context).f(bykjVar.b());
            return;
        }
        if (c2 != 1) {
            if (c2 != 2) {
                if (c2 != 3) {
                    ((ejhf) c.j()).B("Unknown action=%s", action);
                    return;
                }
                final acbj acbjVar = new acbj(context);
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                try {
                    final uxq uxqVar = (uxq) uxq.a.b();
                    try {
                        Map c3 = uxqVar.c();
                        ((ejhf) uxq.b.h()).z("Deleting %d device accounts", c3.size());
                        asmf asmfVar = new asmf(Integer.MAX_VALUE, 9);
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : c3.entrySet()) {
                            final int intValue = ((Integer) entry.getKey()).intValue();
                            final vlw vlwVar = (vlw) entry.getValue();
                            arrayList.add(asmfVar.submit(new Callable() { // from class: uxm
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    uxq uxqVar2 = uxq.this;
                                    acbj acbjVar2 = acbjVar;
                                    int i2 = intValue;
                                    vlw vlwVar2 = vlwVar;
                                    try {
                                        etnj g = uxq.g(acbjVar2, vlwVar2);
                                        if (g == null) {
                                            return eigb.a;
                                        }
                                        uxqVar2.d(i2, vlwVar2);
                                        ((ejhf) uxq.b.h()).z("Deleted device account for user %d", i2);
                                        return eiid.j(g);
                                    } catch (ftye | unx e) {
                                        ((ejhf) ((ejhf) uxq.b.j()).s(e)).z("Failed to delete device account for user %d", i2);
                                        return eigb.a;
                                    }
                                }
                            }));
                        }
                        fecj v = ekay.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ekay ekayVar = (ekay) v.b;
                        ekayVar.c = 5;
                        ekayVar.b |= 1;
                        fecj v2 = ekar.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fecp fecpVar = v2.b;
                        ekar ekarVar = (ekar) fecpVar;
                        ekarVar.c = 3;
                        ekarVar.b |= 1;
                        if (!fecpVar.L()) {
                            v2.U();
                        }
                        ekar ekarVar2 = (ekar) v2.b;
                        ekarVar2.d = 2;
                        ekarVar2.b = 2 | ekarVar2.b;
                        if (!v.b.L()) {
                            v.U();
                        }
                        ekay ekayVar2 = (ekay) v.b;
                        ekar ekarVar3 = (ekar) v2.Q();
                        ekarVar3.getClass();
                        ekayVar2.h = ekarVar3;
                        ekayVar2.b |= 32;
                        vba.h((ekay) v.Q());
                        ensj.a(arrayList).a(new Callable() { // from class: uxk
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i2 = DeviceAccountDeletionChimeraReceiver.b;
                                acbj.this.b();
                                goAsync.finish();
                                return null;
                            }
                        }, enre.a);
                        return;
                    } catch (IOException e) {
                        fecj v3 = ekay.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        ekay ekayVar3 = (ekay) v3.b;
                        ekayVar3.c = 5;
                        ekayVar3.b |= 1;
                        fecj v4 = ekar.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fecp fecpVar2 = v4.b;
                        ekar ekarVar4 = (ekar) fecpVar2;
                        ekarVar4.c = 3;
                        ekarVar4.b |= 1;
                        if (!fecpVar2.L()) {
                            v4.U();
                        }
                        ekar ekarVar5 = (ekar) v4.b;
                        ekarVar5.d = 1;
                        ekarVar5.b |= 2;
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        ekay ekayVar4 = (ekay) v3.b;
                        ekar ekarVar6 = (ekar) v4.Q();
                        ekarVar6.getClass();
                        ekayVar4.h = ekarVar6;
                        ekayVar4.b |= 32;
                        vba.B(v3, e);
                        throw e;
                    }
                } catch (IOException e2) {
                    ((ejhf) ((ejhf) c.j()).s(e2)).x("Failed to get device account deletion data.");
                    return;
                }
            }
        } else if (!fkey.e()) {
            ((ejhf) c.h()).x("Received ACTION_DELETE_DEVICE_ACCOUNT but feature not enabled");
            return;
        }
        DeviceAccountDeletionTaskService.g(context, DeviceAccountDeletionTaskService.d(intent.getExtras()));
    }
}
